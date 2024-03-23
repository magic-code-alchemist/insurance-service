package com.insuranceservice.company;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "보험 유형")
public enum InsuranceType {
    // 손해보험, 생명보험, 펫보험, 배상책임
    NON_LIFE, LIFE, PET, LIABILITY
}
