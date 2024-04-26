package org.insure.insure.repositories.payments;

import org.insure.insure.models.InsuranceCompanies;
import org.insure.insure.models.Users;
import org.insure.insure.models.payments.GruzPayments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface GruzPaymentRepository extends JpaRepository<GruzPayments, Long> {
    GruzPayments findAllByInn (String inn);
    GruzPayments findAllByInsurance_company (InsuranceCompanies insurance_company);
    GruzPayments findAllByUser (Users user);
    GruzPayments findAllByPolicy_num (String policy_num);
    GruzPayments findAllByApproved (boolean approved);
    GruzPayments findAllByProcessed (boolean processed);
    GruzPayments findAllByDateTimeBetween (Date dateStart, Date dateEnd);
}
