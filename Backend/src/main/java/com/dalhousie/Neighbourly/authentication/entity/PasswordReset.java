package com.dalhousie.Neighbourly.authentication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "password_reset_token")
public class PasswordReset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String token;

    @Column(name = "user_id", nullable = false, unique = true)
    private Integer userId;

    private Instant expiryDate;


    public PasswordReset(String token) {
        this.token = token;
    }
}
