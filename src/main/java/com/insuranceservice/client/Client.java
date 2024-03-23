package com.insuranceservice.client;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(description = "클라이언트")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter @Setter
@Table(name = "CLIENT",
        indexes = {
                @Index(name = "IDX_CLIENT_TYPE", columnList = "CLIENT_TYPE")})
public class Client {
    @Schema(description = "클라이언트 id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLIENT_ID")
    private Long id;
    @Schema(description = "클라이언트 타입")
    @Enumerated(EnumType.STRING)
    @Column(name = "CLIENT_TYPE")
    private ClientType type;
    @Schema(description = "클라이언트 이름")
    @Column(name = "NAME")
    private String name;
    @Schema(description = "클라이언트 주민번호")
    @Column(name = "RESIDENT_REGISTRATION_NO")
    private String residentRegistrationNo;
    @Schema(description = "클라이언트 연락처")
    @Column(name = "TELEPHONE")
    private String telephone;
    @Schema(description = "서명")
    @Column(name = "SIGN")
    private String sign;
}
