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
public class VZRPayments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Users user;
    @OneToOne
    private VZRServices service;
    @OneToOne
    private LimitsByUser limit;
    @Temporal(TemporalType.DATE)
    private Date dateTime;
    @Column(nullable = false)
    private int summ;
    private int final_summ;
    @Column(nullable = false)
    @Transient
    private MultipartFile medical_docs;
    @Column(nullable = false)
    @Transient
    private MultipartFile travel_docs;
    @Column(nullable = false)
    @Transient
    private MultipartFile invoices;
    @Column(columnDefinition = "boolean default false")
    private boolean processed;
    @Column(columnDefinition = "boolean default false")
    private boolean approved;
}
