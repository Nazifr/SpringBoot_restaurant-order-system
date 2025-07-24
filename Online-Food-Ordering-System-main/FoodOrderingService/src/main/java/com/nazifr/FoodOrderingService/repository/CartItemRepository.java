package com.nazifr.FoodOrderingService.repository;

import com.nazifr.FoodOrderingService.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
