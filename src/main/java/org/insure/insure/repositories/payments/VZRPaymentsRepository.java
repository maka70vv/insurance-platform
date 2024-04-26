package org.insure.insure.repositories.payments;

import org.insure.insure.models.InsuranceCompanies;
import org.insure.insure.models.Users;
import org.insure.insure.models.payments.VZRPayments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface VZRPaymentsRepository extends JpaRepository<VZRPayments, Long> {
    VZRPayments findAllByInn (String inn);
    VZRPayments findAllByInsurance_company (InsuranceCompanies insurance_company);
    VZRPayments findAllByUser (Users user);
    VZRPayments findAllByPolicy_num (String policy_num);
    VZRPayments findAllByApproved (boolean approved);
    VZRPayments findAllByProcessed (boolean processed);
    VZRPayments findAllByDateTimeBetween (Date dateStart, Date dateEnd);
}
