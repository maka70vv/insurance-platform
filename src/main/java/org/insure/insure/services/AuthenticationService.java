package org.insure.insure.services;

import lombok.RequiredArgsConstructor;
import org.insure.insure.config.JwtService;
import org.insure.insure.models.Enums.Role;
import org.insure.insure.models.Users;
import org.insure.insure.repositories.UserRepository;
import org.insure.insure.responses.AuthRequest;
import org.insure.insure.responses.AuthResponse;
import org.insure.insure.responses.RegisterRequest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repository;
    private final PasswordEncoder encoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthResponse register(RegisterRequest request){
        var user = Users.builder()
                .first_name(request.getFirst_name())
                .last_name(request.getLast_name())
                .username(request.getUsername())
                .role(Role.USER)
                .build();
        repository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthResponse auth(AuthRequest request){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );
        var user = repository.findByUsername(request.getUsername())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);

        return AuthResponse.builder()
                .token(jwtToken)
                .build();
    }

    public void assignUserRole(Long userID, String role) throws Exception{
        Users user = repository.findById(userID)
                .orElseThrow(() -> new Exception("User not found!"));
        user.setRole(Role.valueOf(role));
        repository.save(user);
    }
}
