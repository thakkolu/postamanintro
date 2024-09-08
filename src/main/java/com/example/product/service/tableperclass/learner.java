package com.example.product.service.tableperclass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="tpc_learners")

public class learner extends user {
    int psp;
    int cuurrcompany;
}
