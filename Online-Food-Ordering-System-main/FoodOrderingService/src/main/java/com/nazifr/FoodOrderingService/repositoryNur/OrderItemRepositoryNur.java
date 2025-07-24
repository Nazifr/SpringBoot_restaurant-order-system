package com.nazifr.FoodOrderingService.repositoryNur;

import com.nazifr.FoodOrderingService.modelNur.OrderItemNur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepositoryNur extends JpaRepository<OrderItemNur, Long> {
}
