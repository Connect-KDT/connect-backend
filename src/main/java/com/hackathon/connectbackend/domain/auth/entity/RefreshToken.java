package com.hackathon.connectbackend.domain.auth.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "refresh_tokens")
public class RefreshToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(updatable = false)
    private Long id;

    @Column(updatable = false)
    private Long userId;

    @Column(updatable = false)
    private String refreshToken;

    @Column(updatable = false)
    private LocalDateTime exp;

}
