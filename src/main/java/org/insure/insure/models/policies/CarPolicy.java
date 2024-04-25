package org.insure.insure.models.policies;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.insure.insure.models.Enums.TypeControl;
import org.insure.insure.models.InsuranceCompanies;
import org.insure.insure.models.Users;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class CarPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Users user;
    @Column(length = 14)
    private String inn;
    @Column(unique = true)
    private String policy_num;
    @Column(columnDefinition = "boolean default true")
    private boolean user_is_owner;
    @Column(columnDefinition = "boolean default false")
    private boolean insured_elsewhere;
    @Column(nullable = false)
    private String car_mark;
    @Column(nullable = false)
    private String car_model;
    @Column(nullable = false)
    private String car_date_release;
    @Column(nullable = false)
    private Date date_beginning;
    @Column(nullable = false)
    private Date date_expiration;
    @Column(nullable = false)
    private String insurance_territory;
    @Enumerated(value = EnumType.STRING)
    private TypeControl type_control;
    @OneToOne
    private InsuranceCompanies insurance_company;
    @Column(nullable = false)
    private int price;
    private int price_with_commission;
    private int commission_summ;
}
