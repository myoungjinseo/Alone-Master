package com.example.alonemaster.domain.user;

import com.example.alonemaster.domain.BaseEntity;
import com.example.alonemaster.domain.image.Image;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Schema(description = "유저")
public class User  extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "유저 아이디")
    private Long id;


    @Schema(description = "업로드 된 파일 이름")
    private String nickname;

    @Schema(description = "프로필 이미지")
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, name = "image_id")
    private Image profile_image;
}
