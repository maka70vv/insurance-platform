package org.insure.insure.repositories.payments;

import org.insure.insure.models.InsuranceCompanies;
import org.insure.insure.models.Users;
import org.insure.insure.models.payments.CarPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface CarPaymentRepository extends JpaRepository<CarPayment, Long> {
    CarPayment findAllByInn (String inn);
    CarPayment findAllByInsurance_company (InsuranceCompanies insurance_company);
    CarPayment findAllByUser (Users user);
    CarPayment findAllByPolicy_num (String policy_num);
    CarPayment findAllByApproved (boolean approved);
    CarPayment findAllByProcessed (boolean processed);
    CarPayment findAllByDateTimeBetween (Date dateStart, Date dateEnd);
}
