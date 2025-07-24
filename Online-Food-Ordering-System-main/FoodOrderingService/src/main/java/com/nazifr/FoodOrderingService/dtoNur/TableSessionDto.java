package com.nazifr.FoodOrderingService.dtoNur;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class TableSessionDto {
    private Long id;

    @NotBlank(message = "Table ID is required")
    private String tableId;

    private boolean isActive;

    @PastOrPresent(message = "Start time cannot be in the future")
    private LocalDateTime startTime;

    @PastOrPresent(message = "End time cannot be in the future")
    private LocalDateTime endTime;

    @DecimalMin(value = "0.0", inclusive = true, message = "Total amount must be non-negative")
    private BigDecimal totalAmount;

    private boolean feedbackGiven;

    @NotNull(message = "Orders list is required")
    @Size(min = 1, message = "At least one order must be present")
    private List<@Valid OrderDto> orders;
}
