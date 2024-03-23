package com.insuranceservice.loss;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "사고 유형")
public enum LossType {
    // 질병, 상해, 교통사고
    SICKNESS, ACCIDENT, CAR
}
