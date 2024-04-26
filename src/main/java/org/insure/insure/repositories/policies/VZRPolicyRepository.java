package org.insure.insure.repositories.policies;

import org.insure.insure.models.InsuranceCompanies;
import org.insure.insure.models.Users;
import org.insure.insure.models.policies.VZRPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VZRPolicyRepository extends JpaRepository<VZRPolicy, Long> {
    VZRPolicy findAllByInn (String inn);
    VZRPolicy findAllByInsurance_company (InsuranceCompanies insurance_company);
    VZRPolicy findAllByUser (Users user);
    VZRPolicy findByPolicy_num (String policy_num);
}
