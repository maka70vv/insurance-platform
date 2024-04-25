package org.insure.insure.models.payments;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.insure.insure.models.Users;
import org.insure.insure.models.policies.CarPolicy;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    @OneToOne
    private CarPolicy policy;
    @OneToOne
    private Users user;
    @Temporal(TemporalType.DATE)
    private Date dateTime;
    @Column(nullable = false)
    @Transient
    private MultipartFile image;
    @Column(columnDefinition = "boolean default false")
    private boolean processed;
    @Column(columnDefinition = "boolean default false")
    private boolean approved;
}
