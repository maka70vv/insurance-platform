package org.insure.insure.repositories;

import org.insure.insure.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Optional <Users> findByInn(String inn);
    Optional <Users> findByUsername(String username);
}
