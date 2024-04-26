package org.insure.insure.repositories.policies;

import org.insure.insure.models.InsuranceCompanies;
import org.insure.insure.models.Users;
import org.insure.insure.models.policies.CarPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarPolicyRepository extends JpaRepository<CarPolicy, Long> {
    CarPolicy findAllByInn (String inn);
    CarPolicy findAllByInsurance_company (InsuranceCompanies insurance_company);
    CarPolicy findAllByUser (Users user);
    CarPolicy findByPolicy_num (String policy_num);
}
