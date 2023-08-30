package com.example.alonemaster.domain.critic;


import com.example.alonemaster.domain.BaseEntity;
import com.example.alonemaster.domain.image.Image;
import com.example.alonemaster.domain.menu.Menu;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Schema(description = "메뉴 평가")
public class Critic extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "메뉴 평가 아이디")
    private Long id;

    @Schema(description = "메뉴 별점 ")
    private String scope;

    @Schema(description = "평가 내용")
    private String content;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, name = "image_id")
    @Schema(description = "메뉴 이미지")
    private Image image;

    @Schema(description = "음식점")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, name = "menu_id")
    private Menu menu;
}
