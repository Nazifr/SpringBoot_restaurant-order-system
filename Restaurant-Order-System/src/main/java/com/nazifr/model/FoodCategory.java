package com.nazifr.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class FoodCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}