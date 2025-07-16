package com.nazifr.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Table table;

    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    private boolean isActive;
}