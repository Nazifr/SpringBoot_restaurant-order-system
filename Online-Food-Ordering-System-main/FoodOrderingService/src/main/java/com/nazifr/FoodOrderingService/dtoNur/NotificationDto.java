package com.nazifr.FoodOrderingService.dtoNur;

import jakarta.validation.constraints.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class NotificationDto {
    private Long id;

    @NotBlank(message = "Message content is required")
    @Size(max = 255, message = "Message cannot exceed 255 characters")
    private String message;

    @NotNull(message = "Waiter ID must be provided")
    @Positive(message = "Waiter ID must be a positive number")
    private Long waiterId;

    @NotNull(message = "Timestamp is required")
    private LocalDateTime timestamp;
}
