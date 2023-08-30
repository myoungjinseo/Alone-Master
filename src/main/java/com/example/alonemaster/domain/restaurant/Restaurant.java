package com.example.alonemaster.domain.restaurant;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Schema(description = "음식점")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "음식점 아이디")
    private Long id;

    @Schema(description = "음식점 이름")
    private String name;

    @Schema(description = "음식점 주소")
    private String address;

    @Schema(description = "음식점 카테고리")
    private String category;

    @Schema(description = "음식점 이미지")
    private String image;
}
