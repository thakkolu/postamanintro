package com.example.product.service.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @Column(length = 500)
    String category;
    @Column(columnDefinition = "TEXT")
    String description;


}
