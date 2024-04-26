package org.insure.insure.repositories.payments;

import org.insure.insure.models.InsuranceCompanies;
import org.insure.insure.models.Tariff;
import org.insure.insure.models.payments.Limits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LimitsRepository extends JpaRepository<Limits, Long> {
    Limits findAllByCompanyAndTariff (InsuranceCompanies company, Tariff tariff);
}
