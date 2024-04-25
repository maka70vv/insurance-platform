package org.insure.insure.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InsuranceCompanies {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(length = 14, unique = true)
    private String inn;
    @Column(columnDefinition = "TEXT", length = 500)
    private String description;
    @Column
    private String email;
    @Column
    private Integer commission;
}
