package com.example.product.service.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="msc_learners")
public class learner extends user{
    int psp;
    int cuurrcompany;
}
