package com.nazifr.FoodOrderingService.modelNur;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class NotificationNur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String type; // e.g. "CALL_WAITER", "NEED_WATER", "BILL_REQUEST"

    private String message; // optional explanation from user

    private boolean resolved = false;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime resolvedAt;

    @ManyToOne
    @JoinColumn(name = "table_session_id")
    private TableSessionNur tableSession;
}

