package com.nazifr.FoodOrderingService.modelNur;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class PaymentNur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentType; // CASH, CARD

    private BigDecimal amount;

    private LocalDateTime paidAt;

    @OneToOne
    @JoinColumn(name = "table_session_id")
    private TableSessionNur tableSession;
}

