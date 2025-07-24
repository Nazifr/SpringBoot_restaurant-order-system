package com.nazifr.FoodOrderingService.repositoryNur;

import com.nazifr.FoodOrderingService.enumsNur.SessionStatus;
import com.nazifr.FoodOrderingService.modelNur.TableSessionNur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TableSessionRepositoryNur extends JpaRepository<TableSessionNur, Long> {
    Optional<TableSessionNur> findByTableIdAndStatus(String tableId, SessionStatus status);
}
