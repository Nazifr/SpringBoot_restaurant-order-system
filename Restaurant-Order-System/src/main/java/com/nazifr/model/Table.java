package com.nazifr.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tableNumber;
    private boolean isOccupied;
}