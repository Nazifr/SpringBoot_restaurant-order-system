package com.nazifr.FoodOrderingService.dtoNur;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CategoryDto {

    @NotNull(message = "Category ID is required for updates")
    @Positive(message = "Category ID must be a positive number")
    private Long id;

    @NotBlank(message = "Category name is required")
    @Size(min = 2, max = 50, message = "Category name must be between 2 and 50 characters")
    private String name;
}
