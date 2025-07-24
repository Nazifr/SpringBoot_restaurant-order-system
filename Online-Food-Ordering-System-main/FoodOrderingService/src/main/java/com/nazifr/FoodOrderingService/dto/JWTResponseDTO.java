package com.nazifr.FoodOrderingService.dto;

import com.nazifr.FoodOrderingService.enums.UserRole;
import lombok.Data;

@Data
public class JWTResponseDTO {

    private String jwt;

    private String email;

    private String userName;

    private UserRole role;
}
