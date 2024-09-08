package com.example.product.service.cardinalities.onetoone.oneTomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.nio.MappedByteBuffer;

@Entity
public class students {
    @Id
    Long id;
    String name;
    @ManyToOne
    batch b;
}
