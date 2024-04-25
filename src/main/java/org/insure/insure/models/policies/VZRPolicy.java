package org.insure.insure.models.policies;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.insure.insure.models.Enums.Places;
import org.insure.insure.models.Enums.TravelGoal;
import org.insure.insure.models.InsuranceCompanies;
import org.insure.insure.models.Users;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class VZRPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Users user;
    @Column(length = 14)
    private String inn;
    @Column(unique = true)
    private String policy_num;
    private Date date_beginning;
    @Column(nullable = false)
    private Date date_expiration;
    @Enumerated(value = EnumType.STRING)
    private Places place;
    @Enumerated(value = EnumType.STRING)
    private TravelGoal travelGoal;
    @OneToOne
    private InsuranceCompanies insurance_company;
    @Column(nullable = false)
    private int price;
    private int price_with_commission;
    private int commission_summ;
}
