package com.nazifr.FoodOrderingService.dtoNur;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RatingDto {
    private Long id;

    @Min(value = 1, message = "Rating must be at least 1")
    @Max(value = 5, message = "Rating must be at most 5")
    private int rating;

    @Size(max = 500, message = "Comment cannot exceed 500 characters")
    private String comment;

    @NotNull(message = "Order ID is required")
    private Long orderId;

    @PastOrPresent(message = "Submission date cannot be in the future")
    private LocalDateTime submittedAt;
}
