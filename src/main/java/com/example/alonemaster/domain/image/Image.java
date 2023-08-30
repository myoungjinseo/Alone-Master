package com.example.alonemaster.domain.image;


import com.example.alonemaster.domain.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Schema(description = "이미지")
public class Image   extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "이미지 아이디")
    private Long id;


    @Schema(description = "업로드 된 파일 이름")
    private String uploadFileName;

    @Schema(description = "저장소에 있는 파일 이름")
    private String storeFileName;

    @Schema(description = "파일 사이즈")
    private long file_size;

}