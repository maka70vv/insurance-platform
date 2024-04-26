package org.insure.insure.repositories.payments;

import org.insure.insure.models.payments.VZRServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VZRServicesRepository extends JpaRepository<VZRServices, Long> {
     VZRServices findByName(String name);
}
