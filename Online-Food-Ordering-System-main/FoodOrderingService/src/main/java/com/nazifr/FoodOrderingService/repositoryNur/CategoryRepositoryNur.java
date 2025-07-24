package com.nazifr.FoodOrderingService.repositoryNur;

import com.nazifr.FoodOrderingService.modelNur.CategoryNur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositoryNur extends JpaRepository<CategoryNur, Long> {
}
