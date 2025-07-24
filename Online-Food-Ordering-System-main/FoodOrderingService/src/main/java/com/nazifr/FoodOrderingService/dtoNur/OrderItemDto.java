package com.nazifr.FoodOrderingService.dtoNur;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemDto {
    private Long id;

    @NotNull(message = "Food item ID is required")
    private Long foodItemId;

    @NotBlank(message = "Food item name is required")
    @Size(max = 100, message = "Food item name cannot exceed 100 characters")
    private String foodItemName;

    @Min(value = 1, message = "Quantity must be at least 1")
    @Max(value = 100, message = "Quantity cannot exceed 100")
    private int quantity;

    @NotNull(message = "Total price is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Total price must be greater than 0")
    private BigDecimal totalPrice;

    @Size(max = 200, message = "Customization text cannot exceed 200 characters")
    private String customization;
}
