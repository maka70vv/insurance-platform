package org.insure.insure.repositories.policies;

import org.insure.insure.models.InsuranceCompanies;
import org.insure.insure.models.Users;
import org.insure.insure.models.policies.DMSPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DMSPolicyRepository extends JpaRepository<DMSPolicy, Long> {
    DMSPolicy findAllByInn (String inn);
    DMSPolicy findAllByInsurance_company (InsuranceCompanies insurance_company);
    DMSPolicy findAllByUser (Users user);
    DMSPolicy findByPolicy_num (String policy_num);
}
