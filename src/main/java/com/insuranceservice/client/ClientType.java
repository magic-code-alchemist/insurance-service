package com.insuranceservice.client;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Client 유형")
public enum ClientType {
    // 피보험자, 계약자, 수익자
    INSURED, POLICYHOLDER, BENEFICIARY

}
