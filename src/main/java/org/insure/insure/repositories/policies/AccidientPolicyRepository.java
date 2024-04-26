package org.insure.insure.repositories.policies;

import org.insure.insure.models.InsuranceCompanies;
import org.insure.insure.models.Users;
import org.insure.insure.models.policies.AccidentPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccidientPolicyRepository extends JpaRepository<AccidentPolicy, Long> {
    AccidentPolicy findAllByInn (String inn);
    AccidentPolicy findAllByInsurance_company (InsuranceCompanies insurance_company);
    AccidentPolicy findAllByUser (Users user);
    AccidentPolicy findByPolicy_num (String policy_num);
}
