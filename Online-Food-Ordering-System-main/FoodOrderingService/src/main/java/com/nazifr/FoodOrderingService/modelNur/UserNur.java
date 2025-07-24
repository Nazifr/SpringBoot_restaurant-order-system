package com.nazifr.FoodOrderingService.modelNur;

import com.nazifr.FoodOrderingService.enumsNur.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class UserNur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String username;

    @NotBlank
    private String password;


    @JoinColumn(name = "role_id")
    private Role role;
}
