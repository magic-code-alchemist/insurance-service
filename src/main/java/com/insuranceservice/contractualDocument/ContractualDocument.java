package com.insuranceservice.contractualDocument;

import com.insuranceservice.company.Company;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(description = "보험")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter @Setter
@Table(name = "CONTRACTUAL_DOCUMENT")
public class ContractualDocument {

    @Schema(description = "보험 id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONTRACTUAL_DOCUMENT_ID")
    private Long id;
    @Schema(description = "보험사 id")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ID")
    private Company company;
}
