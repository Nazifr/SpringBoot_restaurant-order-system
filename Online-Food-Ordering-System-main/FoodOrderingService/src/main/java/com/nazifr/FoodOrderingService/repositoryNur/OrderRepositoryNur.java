package com.nazifr.FoodOrderingService.repositoryNur;

import com.nazifr.FoodOrderingService.modelNur.OrderNur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositoryNur extends JpaRepository<OrderNur, Long> {
}
