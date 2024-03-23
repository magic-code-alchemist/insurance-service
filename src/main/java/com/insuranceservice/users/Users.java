package com.insuranceservice.users;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter @Setter
@Table(name = "USERS")
public class Users {
    @Schema(description = "사용자 id")
    @Id @GeneratedValue
    @Column(name = "USER_ID")
    private Long id;
    @Schema(description = "사용자 로그인 id")
    @Column(unique = true, nullable = false, name = "LOGIN_ID")
    private String loginId;
    @Schema(description = "사용자 명")
    @Column(nullable = false, name = "USERS_NAME")
    private String name;
    @Schema(description = "사용자 로그인 비밀번호")
    @Column(nullable = false, name = "PASSWORD")
    private String password;
//    private Role role;
}