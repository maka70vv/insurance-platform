package org.insure.insure.repositories.payments;

import org.insure.insure.models.Users;
import org.insure.insure.models.payments.LimitsByUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LimitsByUserRepository extends JpaRepository<LimitsByUser, Long> {
    LimitsByUser findAllByUser(Users user);
    LimitsByUser findAllByPolicy_num(String policy_num);
}
