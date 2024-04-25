package org.insure.insure.models.policies;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.insure.insure.models.Enums.Places;
import org.insure.insure.models.Enums.TravelGoal;
import org.insure.insure.models.InsuranceCompanies;
import org.insure.insure.models.Tariff;
import org.insure.insure.models.Users;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class DMSPolicy {
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
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date_expiration;
    @OneToOne
    private Tariff tariff;
    @Column(length = 14)
    private String fam_member1_inn;
    @Column(length = 14)
    private String fam_member2_inn;
    @OneToOne
    private InsuranceCompanies insurance_company;
    @Column(nullable = false)
    private int price;
    private int price_with_commission;
    private int commission_summ;
}
