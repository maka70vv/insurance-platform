package org.insure.insure.repositories.payments;

import org.insure.insure.models.payments.VZRServices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VZRServicesInterface extends JpaRepository<VZRServices, Long> {
     VZRServices findByName(String name);
}
