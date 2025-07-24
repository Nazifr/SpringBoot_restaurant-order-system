package com.nazifr.FoodOrderingService.service;

import com.nazifr.FoodOrderingService.dto.OrderDTO;
import com.nazifr.FoodOrderingService.model.Order;
import com.nazifr.FoodOrderingService.model.User;

import java.util.List;

public interface OrderService {

    public Order createOrder(OrderDTO orderDTO, User user) throws Exception;

    public Order updateOrder(Long orderId, String orderStatus) throws Exception;

    public boolean canselOrder(Long orderId) throws Exception;

    public List<Order> getUserOrders(Long userId) throws Exception ;

    public List<Order> getRestaurantOrders(Long restaurantId, String orderStatus) throws Exception;

    public Order findOrderById(Long orderId) throws Exception;
}
