package com.nazifr.FoodOrderingService.dto;

import com.nazifr.FoodOrderingService.model.Address;
import lombok.Data;

@Data
public class OrderDTO {

    private Long restaurantId;
    private Address deliveryAddress;

}
