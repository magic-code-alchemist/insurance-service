package com.insuranceservice.claim;

import com.insuranceservice.client.Client;
import com.insuranceservice.company.Company;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Schema(description = "청구내역")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter @Setter
@Table(name = "CLAIM",
        indexes = {
                @Index(name = "IDX_CLAIM_PROCESSING", columnList = "PROCESSING"),
                @Index(name = "IDX_CLAIM_DATE", columnList = "DATE")})
public class Claim {
    @Schema(description = "청구내역 id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLAIM_ID")
    private Long id;
    @Schema(description = "처리과정")
    @Column(name = "PROCESSING")
    private String processing;
    @Schema(description = "고객")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    private Client client;
    @Schema(description = "보험사 id")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ID")
    private Company company;
    @Schema(description = "날짜")
    @Column(name = "DATE")
    private LocalDateTime date;
}
