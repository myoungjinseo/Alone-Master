package com.example.alonemaster.domain.follow;

import com.example.alonemaster.domain.BaseEntity;
import com.example.alonemaster.domain.user.User;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Schema(description = "팔로우")
public class Follow  extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "팔로우 아이디")
    private Long id;

    @Schema(description = "팔로워")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, name = "user_id")
    private User follower;

    @Column(nullable = false)
    private Long guestId;
}
