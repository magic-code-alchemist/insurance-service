package com.insuranceservice.company;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(description = "보험사")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter @Setter
@Table(name = "COMPANY",
        indexes = {
                @Index(name = "IDX_COMPANY_CODE", columnList = "COMPANY_CODE"),
                @Index(name = "IDX_COMPANY_INSURANCE_TYPE", columnList = "INSURANCE_TYPE"),
                @Index(name = "IDX_COMPANY_GROUP_INDEMNITY", columnList = "GROUP_INDEMNITY")})
public class Company {
    @Schema(description = "보험사 id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COMPANY_ID")
    private Long id;
    @Schema(description = "보험사 명")
    @Column(name = "COMPANY_CODE")
    @Enumerated(EnumType.STRING)
    private CompanyType companyCode;
    @Schema(description = "보험 유형") // 손해보험, 생명보험, 펫보험, 배상책임
    @Column(name = "INSURANCE_TYPE")
    @Enumerated(EnumType.STRING)
    private InsuranceType InsuranceType;
    @Schema(description = "팩스 타입")
    @Column(name = "COMPANY_FAX_TYPE")
    @Enumerated(EnumType.STRING)
    private CompanyFaxType companyFaxType;
    @Schema(description = "팩스 번호")
    @Column(name = "COMPANY_FAX_NUM")
    private String companyFaxNum;
    @Schema(description = "단체 실손 가능 여부")
    @Column(name = "GROUP_INDEMNITY")
    private String groupIndemnity;
}
