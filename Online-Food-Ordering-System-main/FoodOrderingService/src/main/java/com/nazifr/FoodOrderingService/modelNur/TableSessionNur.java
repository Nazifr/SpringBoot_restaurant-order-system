package com.nazifr.FoodOrderingService.modelNur;

import com.nazifr.FoodOrderingService.enumsNur.SessionStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Entity
@Data
public class TableSessionNur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String tableId;

    @Enumerated(EnumType.STRING)
    private SessionStatus status = SessionStatus.ACTIVE;

    private String startedBy;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @DecimalMin("0.0")
    private BigDecimal totalAmount;

    private boolean feedbackGiven;

    @OneToMany(mappedBy = "tableSession", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderNur> orders = new ArrayList<>();

    @OneToOne(mappedBy = "tableSession", cascade = CascadeType.ALL)
    private PaymentNur payment;

    @OneToMany(mappedBy = "tableSession", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<NotificationNur> notifications = new ArrayList<>();
}
