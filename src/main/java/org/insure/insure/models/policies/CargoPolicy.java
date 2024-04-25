package org.insure.insure.models.policies;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.insure.insure.models.InsuranceCompanies;
import org.insure.insure.models.Users;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
public class CargoPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Users user;
    @Column(length = 14)
    private String inn;
    @Column(unique = true)
    private String policy_num;
    @Column(nullable = false)
    private String cargo_name;
    @Column(columnDefinition = "boolean default false")
    private boolean isnew_cargo;
    @Column(nullable = false)
    private int length;
    @Column(nullable = false)
    private int weight;
    @Column(nullable = false)
    private int height;
    @Column(nullable = false)
    private int cargo_volume;
    @Column(columnDefinition = "boolean default false")
    private boolean is_fragile;
    @Column(nullable = false)
    private int cargo_quantity_amount;
    @Column(nullable = false)
    private int cargo_unit_amount;
    @Column(nullable = false)
    private int actual_price;
    @Column(nullable = false)
    private int insurance_price;
    @Column(length = 8)
    private String tractor_number;
    @Column(length = 8)
    private String trailerNumber;
    @Column(nullable = false)
    private String departurePoint;
    @Column(nullable = false)
    private String destinationPoint;
    @Column(nullable = false)
    private Date date_beginning;
    @Column(nullable = false)
    private Date date_expiration;
    @OneToOne
    private InsuranceCompanies insurance_company;
    @Column(nullable = false)
    private int price;
    private int price_with_commission;
    private int commission_summ;
}
