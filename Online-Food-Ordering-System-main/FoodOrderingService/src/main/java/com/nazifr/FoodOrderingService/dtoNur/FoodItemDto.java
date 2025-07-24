package com.nazifr.FoodOrderingService.dtoNur;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class FoodItemDto {

    @Positive(message = "ID must be a positive number")
    private Long id;

    @NotBlank(message = "Food name is required")
    @Size(min = 2, max = 100, message = "Food name must be between 2 and 100 characters")
    private String name;

    @NotBlank(message = "Description is required")
    @Size(min = 5, max = 500, message = "Description must be between 5 and 500 characters")
    private String description;

    @NotNull(message = "Price is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
    @Digits(integer = 6, fraction = 2, message = "Price must be a valid monetary amount")
    private BigDecimal price;

    private boolean isAvailable;

    @Size(max = 255, message = "Image URL is too long")
    private String imageUrl;

    @NotNull(message = "Category ID is required")
    @Positive(message = "Category ID must be a positive number")
    private Long categoryId;

    @Size(max = 50, message = "Category name cannot exceed 50 characters")
    private String categoryName;

    private List<@Valid RatingDto> ratings;
}
