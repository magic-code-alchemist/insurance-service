package com.insuranceservice.contractualDocument;

import com.insuranceservice.bank.Bank;
import com.insuranceservice.client.Client;
import com.insuranceservice.file.UploadFiles;
import com.insuranceservice.loss.Loss;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(description = "보험 세부 내용")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter @Setter
@Table(name = "CONTRACTUAL_DOCUMENT_DETAILS")
public class ContractualDocumentDetails {

    @Schema(description = "보험 세부 내용 id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONTRACTUAL_DOCUMENT_DETAILS_ID")
    private Long id;
    @Schema(description = "피보험자")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INSURED_ID")
    private Client insured;
    @Schema(description = "계약자")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POLICYHOLDER_ID")
    private Client policyholder;
    @Schema(description = "수익자")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BENEFICIARY_ID")
    private Client beneficiary;
    @Schema(description = "보상안내 받으실 분")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RECEIVING_INFORMATION_ID")
    private Client receivingInformationId;
    @Schema(description = "사고 정보")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LOSS_ID")
    private Loss loss;
    @Schema(description = "계좌정보")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BANK_ID")
    private Bank bank;
    @Schema(description = "서명")
    @Column(name = "SIGN")
    private String sign;
    @Schema(description = "첨부파일")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UPLOAD_FILES_ID")
    private UploadFiles uploadFiles;
}
