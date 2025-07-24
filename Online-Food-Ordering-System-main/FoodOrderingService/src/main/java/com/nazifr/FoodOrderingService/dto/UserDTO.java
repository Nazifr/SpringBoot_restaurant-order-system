package com.nazifr.FoodOrderingService.dto;

import com.nazifr.FoodOrderingService.enums.UserRole;
import com.nazifr.FoodOrderingService.model.Address;
import com.nazifr.FoodOrderingService.model.Order;
import com.nazifr.FoodOrderingService.model.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;

    private String fullName;

    private String email;

    private String password;

    private UserRole role;

    private List<Order> orders;

    private List<RestaurantDTO> favorites;

    private List<Address> addresses;

    private Restaurant restaurant;
}
