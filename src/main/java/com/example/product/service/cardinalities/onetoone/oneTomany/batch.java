package com.example.product.service.cardinalities.onetoone.oneTomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class batch {
    @Id
    Long id;
    String name;
    String description;
@OneToMany(mappedBy = "b")
List<students> s;
}
