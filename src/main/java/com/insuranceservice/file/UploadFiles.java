package com.insuranceservice.file;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(description = "첨부파일")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter @Setter
@Table(name = "UPLOAD_FILES")
public class UploadFiles {
    @Schema(description = "첨부파일 id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UPLOAD_FILES_ID")
    private Long id;
    @Schema(description = "첨부파일 경로")
    @Column(name = "FILE_PATH")
    private String filePath;
}