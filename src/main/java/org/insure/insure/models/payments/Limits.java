package org.insure.insure.models.payments;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.insure.insure.models.Industry;
import org.insure.insure.models.InsuranceCompanies;
import org.insure.insure.models.Tariff;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Limits {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String limitName;
    private String limitSumm;
    @OneToOne
    private Industry verboseIndustry;
    @OneToOne
    private Tariff tariff;
    @OneToOne
    private InsuranceCompanies company;
}
