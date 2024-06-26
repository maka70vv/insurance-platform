package org.insure.insure.models.payments;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.insure.insure.models.Users;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedicalPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Users user;
    @OneToOne
    private MedicalServices service;
    @OneToOne
    private LimitsByUser limit;
    @Transient
    private MultipartFile kkmCheck;
    @Transient
    private MultipartFile referral;
    @Transient
    private MultipartFile invoice;
    @Transient
    private MultipartFile opinions_on_medications;
    @Column(nullable = false)
    private int sum;
    private int final_summ;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateTime;
    private String inn;
    @Column(columnDefinition = "boolean default false")
    private boolean processed;
    @Column(columnDefinition = "boolean default false")
    private boolean approved;
}
