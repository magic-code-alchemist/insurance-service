package com.insuranceservice.company;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "팩스 유형")
public enum CompanyFaxType {
    // 팩스 번호 존재O, 가상 팩스 번호, 팩스 번호 존재X
    EXISTING, VIRTUAL, NONE
}
