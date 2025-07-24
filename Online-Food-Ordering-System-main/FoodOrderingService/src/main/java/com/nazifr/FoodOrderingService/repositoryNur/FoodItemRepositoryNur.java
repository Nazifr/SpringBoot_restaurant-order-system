package com.nazifr.FoodOrderingService.repositoryNur;

import com.nazifr.FoodOrderingService.modelNur.FoodItemNur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepositoryNur extends JpaRepository<FoodItemNur, Long> {
}
