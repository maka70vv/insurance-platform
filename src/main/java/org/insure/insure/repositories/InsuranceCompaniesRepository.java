package org.insure.insure.repositories;

import org.insure.insure.models.InsuranceCompanies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceCompaniesRepository extends JpaRepository<InsuranceCompanies, Long> {
    InsuranceCompanies findByName(String name);
}
