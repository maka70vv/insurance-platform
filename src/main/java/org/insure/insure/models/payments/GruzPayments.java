package org.insure.insure.models.payments;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.insure.insure.models.Users;
import org.insure.insure.models.policies.CargoPolicy;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GruzPayments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Users user;
    @Column(nullable = false)
    @OneToOne
    private CargoPolicy policy;
    @Column(nullable = false)
    @Transient
    private MultipartFile image;
    @Column(nullable = false)
    private String accidentPlace;
    @Temporal(TemporalType.DATE)
    private Date dateTime;
    @Column(columnDefinition = "boolean default false")
    private boolean processed;
    @Column(columnDefinition = "boolean default false")
    private boolean approved;
}
