package com.nazifr.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class AdminUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private String password;
    private String role; // "ADMIN"
}