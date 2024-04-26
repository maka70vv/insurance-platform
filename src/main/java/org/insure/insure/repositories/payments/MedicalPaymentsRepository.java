package org.insure.insure.repositories.payments;

import org.insure.insure.models.InsuranceCompanies;
import org.insure.insure.models.Users;
import org.insure.insure.models.payments.MedicalPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface MedicalPaymentsRepository extends JpaRepository<MedicalPayment, Long> {
    MedicalPayment findAllByInn (String inn);
    MedicalPayment findAllByInsurance_company (InsuranceCompanies insurance_company);
    MedicalPayment findAllByUser (Users user);
    MedicalPayment findAllByPolicy_num (String policy_num);
    MedicalPayment findAllByApproved (boolean approved);
    MedicalPayment findAllByProcessed (boolean processed);
    MedicalPayment findAllByDateTimeBetween (Date dateStart, Date dateEnd);
}
