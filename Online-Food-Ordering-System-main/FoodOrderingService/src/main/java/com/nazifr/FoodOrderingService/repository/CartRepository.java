package com.nazifr.FoodOrderingService.repository;

import com.nazifr.FoodOrderingService.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Cart findByCustomerId(Long userId);
}
