package com.nazifr.FoodOrderingService.dtoNur;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PaymentDto {
    private Long id;

    @NotBlank(message = "Payment method is required")
    @Pattern(regexp = "CARD|CASH", message = "Payment method must be either 'CARD' or 'CASH'")
    private String method; // "CARD" or "CASH"

    @NotNull(message = "Payment amount is required")
    @DecimalMin(value = "0.01", message = "Amount must be greater than 0")
    private BigDecimal amount;

    @PastOrPresent(message = "Paid date cannot be in the future")
    private LocalDateTime paidAt;
}
