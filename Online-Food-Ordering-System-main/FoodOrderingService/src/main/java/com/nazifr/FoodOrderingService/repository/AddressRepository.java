package com.nazifr.FoodOrderingService.repository;

import com.nazifr.FoodOrderingService.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
