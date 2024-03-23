package com.insuranceservice.bank;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(description = "계좌정보")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter @Setter
@Table(name = "BANK",
        indexes = {
                @Index(name = "IDX_BANK_CODE", columnList = "BANK_CODE"),
                @Index(name = "IDX_ACCOUNT", columnList = "ACCOUNT_HOLDER")})
public class Bank {
    @Schema(description = "은행 id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BANK_ID")
    private Long id;
    @Schema(description = "은행 명")
    @Column(name = "BANK_CODE")
    @Enumerated(EnumType.STRING)
    private BankType BankCode;
    @Schema(description = "계좌번호")
    @Column(name = "ACCOUNT")
    private String account;
    @Schema(description = "예금주")
    @Column(name = "ACCOUNT_HOLDER")
    private String accountHolder;
}
