package com.insuranceservice.contractualDocument;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "정보 수신자 유형")
public enum InformationRecipientType {
    // 설계사, 청구인
    BROKER, CLAIMANT
}
