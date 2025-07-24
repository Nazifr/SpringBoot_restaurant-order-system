package com.nazifr.FoodOrderingService.service;

import com.nazifr.FoodOrderingService.dto.CartItemDTO;
import com.nazifr.FoodOrderingService.model.Cart;
import com.nazifr.FoodOrderingService.model.CartItem;

public interface CartService {

    public CartItem addItemToCart(CartItemDTO cartItemDTO, String jwt) throws Exception;

    public CartItem updateCartItemQuantity(Long cartItemId, int quantity) throws Exception;

    public Cart removeItemFromCart(Long cartItemId, String jwt) throws Exception;

    public Long calculateTotal(Cart cart) throws Exception;

    public Cart findCartById(Long id) throws Exception;

    public Cart findCartByUserId(Long userId) throws Exception;

    public Cart clearCart(Long userId) throws Exception;
}
