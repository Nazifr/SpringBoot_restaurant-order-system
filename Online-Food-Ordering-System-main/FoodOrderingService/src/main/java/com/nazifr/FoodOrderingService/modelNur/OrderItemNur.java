package com.nazifr.FoodOrderingService.modelNur;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Entity
@Data
public class OrderItemNur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(1)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderNur order;

    @ManyToOne
    @JoinColumn(name = "food_item_id")
    private FoodItemNur foodItem;
}
