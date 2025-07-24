package com.nazifr.FoodOrderingService.service;

import com.nazifr.FoodOrderingService.dto.UserDTO;
import com.nazifr.FoodOrderingService.model.User;

public interface UserService {

    public User registerUser(UserDTO userDTO) throws Exception;

    public User userByToken(String token) throws Exception;

    public User userByEmail(String email) throws Exception;
}
