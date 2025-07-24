package com.nazifr.FoodOrderingService.repositoryNur;

import com.nazifr.FoodOrderingService.modelNur.UserNur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositoryNur extends JpaRepository<UserNur, Long> {
    Optional<UserNur> findByUsername(String username);
}
