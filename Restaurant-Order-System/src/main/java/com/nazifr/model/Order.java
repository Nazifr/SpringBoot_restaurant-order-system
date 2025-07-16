package com.nazifr.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Session session;

    private LocalDateTime createdAt;
    private boolean isPaid;
    private boolean isClosed;
    private BigDecimal totalPrice;
}