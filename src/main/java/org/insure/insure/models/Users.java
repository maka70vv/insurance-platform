package org.insure.insure.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.insure.insure.models.Enums.Role;
import org.insure.insure.models.Enums.Sex;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users implements UserDetails {
    @Id
    @GeneratedValue
    private Long id;
    private String first_name;
    private String last_name;
    @Column(unique = true)
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToOne
    private InsuranceCompanies company;
    @Column(length = 14)
    private String inn;
    @Column(length = 34)
    private String iban_number;
    private Date date_of_birth;
    @Column(length = 9)
    private String passport_number;
    private String place_of_birth;
    private String place_of_residence;
    @Column(length = 10)
    private String authority;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    private String residential_address;
    @Transient
    private MultipartFile profile_photo;
//    for juridical
    private String fullname;
    private String okpo;
    private String registration_number;
    private String ceo;
    private String position_of_ceo;
    private String envoy;
    private String legal_address;
    private String actual_address;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}