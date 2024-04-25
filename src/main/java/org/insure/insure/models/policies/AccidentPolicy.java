package org.insure.insure.models.policies;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.insure.insure.models.InsuranceCompanies;
import org.insure.insure.models.Users;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccidentPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Users user;
    @Column(length = 14)
    private String inn;
    @Column(unique = true)
    private String policy_num;
    @Temporal(TemporalType.DATE)
    private Date date_beginning;
    @Temporal(TemporalType.DATE)
    private Date date_expiration;
    @Column(nullable = false)
    private String insured_territory;
    @Column(columnDefinition = "boolean default false")
    private Boolean insured_elsewhere;
    @OneToOne
    private InsuranceCompanies insurance_company;
    @Column(nullable = false)
    private int price;
    private int price_with_commission;
    private int commission_summ;
}
