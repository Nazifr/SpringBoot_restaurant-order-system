package com.nazifr.FoodOrderingService.modelNur;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class RatingNur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(1)
    @Max(5)
    private int rating;

    private String comment;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "food_item_id")
    private FoodItemNur foodItem;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderNur order;

    private LocalDateTime submittedAt = LocalDateTime.now();
}
