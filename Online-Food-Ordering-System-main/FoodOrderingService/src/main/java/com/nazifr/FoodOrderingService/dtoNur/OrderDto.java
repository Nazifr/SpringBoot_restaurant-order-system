package com.nazifr.FoodOrderingService.dtoNur;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderDto {
    private Long id;

    @NotNull(message = "Order creation time is required")
    private LocalDateTime createdAt;

    @NotNull(message = "Total price must be provided")
    @DecimalMin(value = "0.0", inclusive = true, message = "Total price cannot be negative")
    private BigDecimal totalPrice;

    @NotEmpty(message = "Order must contain at least one item")
    private List<@Valid OrderItemDto> orderItems;
}
