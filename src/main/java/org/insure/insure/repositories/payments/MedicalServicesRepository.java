package org.insure.insure.repositories.payments;

import org.insure.insure.models.payments.MedicalServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalServicesRepository extends JpaRepository<MedicalServices, Long> {
    MedicalServices findByName(String name);
}
