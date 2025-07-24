package com.nazifr.FoodOrderingService.repositoryNur;

import com.nazifr.FoodOrderingService.modelNur.PaymentNur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepositoryNur extends JpaRepository<PaymentNur, Long> {
}
