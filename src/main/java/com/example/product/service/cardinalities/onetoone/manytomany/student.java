package com.example.product.service.cardinalities.onetoone.manytomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class student {
    @Id
    Long id;
    String name;
    @ManyToMany(mappedBy = "s")
    List<courses>c;
}
