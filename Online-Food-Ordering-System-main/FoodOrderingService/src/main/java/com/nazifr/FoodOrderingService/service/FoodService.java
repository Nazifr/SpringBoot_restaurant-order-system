package com.nazifr.FoodOrderingService.service;

import com.nazifr.FoodOrderingService.dto.FoodDTO;
import com.nazifr.FoodOrderingService.model.Category;
import com.nazifr.FoodOrderingService.model.Food;
import com.nazifr.FoodOrderingService.model.Restaurant;

import java.util.List;

public interface FoodService {

   public Food createFood(FoodDTO foodDTO, Category category, Restaurant restaurant);

   boolean deleteFood(Long id) throws Exception;

   public List<Food> getAllRestaurantFoods(Long restaurantId, boolean isVegetarian, boolean isNonVeg, boolean isSeasonal, String foodCategory);

   public List<Food> searchFood(String keyword);

   public Food findFoodById(Long id) throws Exception;

   public Food updateAvailability(Long foodId) throws Exception;
}
