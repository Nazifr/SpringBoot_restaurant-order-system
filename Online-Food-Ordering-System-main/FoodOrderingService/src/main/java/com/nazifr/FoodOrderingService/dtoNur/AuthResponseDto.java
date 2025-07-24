package com.nazifr.FoodOrderingService.dtoNur;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AuthResponseDto {

    @NotBlank(message = "Token must not be blank")
    @Size(min = 20, max = 512, message = "Token must be between 20 and 512 characters")
    private String token;

    @NotBlank(message = "Username must not be blank")
    @Size(min = 2, max = 50, message = "Username must be between 2 and 50 characters")
    private String username;

    @NotBlank(message = "Role must not be blank")
    @Pattern(
            regexp = "^(ADMIN|OWNER|WAITER)$",
            message = "Role must be one of: ADMIN, OWNER, or WAITER"
    )
    private String role;
}
