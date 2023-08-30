package com.example.alonemaster.domain.menu;

import com.example.alonemaster.domain.BaseEntity;
import com.example.alonemaster.domain.restaurant.Restaurant;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Schema(description = "메뉴")
public class Menu   extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "메뉴 아이디")
    private Long id;

    @Schema(description = "메뉴 이름")
    private String name;

    @Schema(description = "가격")
    private Long price;

    @Schema(description = "음식점")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, name = "restaurant_id")
    private Restaurant restaurant;
}
