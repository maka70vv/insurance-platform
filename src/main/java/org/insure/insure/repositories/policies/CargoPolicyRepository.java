package org.insure.insure.repositories.policies;

import org.insure.insure.models.InsuranceCompanies;
import org.insure.insure.models.Users;
import org.insure.insure.models.policies.CargoPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoPolicyRepository extends JpaRepository<CargoPolicy, Long> {
    CargoPolicy findAllByInn(String inn);
    CargoPolicy findAllByInsurance_company(InsuranceCompanies insurance_company);
    CargoPolicy findAllByUser(Users user);
    CargoPolicy findByPolicy_num (String policy_num);
}
