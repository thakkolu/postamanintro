package com.example.product.service.cardinalities.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class wife {
    @Id
    Long id;
    String name;
    @OneToOne
    husband h;

}
