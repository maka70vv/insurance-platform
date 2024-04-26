package org.insure.insure.repositories;

import org.insure.insure.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByInn(String inn);
    Users findByUsername(String username);
}
