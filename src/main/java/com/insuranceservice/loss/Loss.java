package com.insuranceservice.loss;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(description = "사고")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter @Setter
@Table(name = "LOSS")
public class Loss {

    @Schema(description = "보험 id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LOSS_ID")
    private Long id;
    @Schema(description = "사고 유형")
    @Enumerated(EnumType.STRING)
    @Column(name = "LOSS_TYPE")
    private LossType lossType;
    @Schema(description = "사고 세부 내용")
    @Column(name = "LOSS_DETAILS")
    private String lossDetails;
    @Schema(description = "자동차보험처리여부")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTOMOBILE_INSURANCE_ID")
    private AutomobileInsurance automobileInsurance;
}
