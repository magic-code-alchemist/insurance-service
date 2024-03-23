package com.insuranceservice.loss;

import com.insuranceservice.company.Company;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(description = "자동차보험처리여부")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter @Setter
@Table(name = "AUTOMOBILE_INSURANCE")
public class AutomobileInsurance {
    @Schema(description = "자동차보험처리여부 id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AUTOMOBILE_INSURANCE_ID")
    private Long id;
    @Schema(description = "자동차보험처리여부")
    @Column(name = "PROCESSING")
    private Boolean Processing;
    @Schema(description = "자동차보험 담당사")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ID")
    private Company company;
    @Schema(description = "자동차보험담당자 연락처")
    @Column(name = "MANAGER_TELEPHONE")
    private String managerTelephone;
    @Schema(description = "차량번호")
    @Column(name = "CAR_NUMBER")
    private String CarNumber;

}
