package org.insure.insure.models.payments;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.insure.insure.models.Users;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LimitsByUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Limits limit;
    @OneToOne
    private Users user;
    private String limitName;
    private int summ;
    private String policy_num;
}
