package com.example.product.service.jointable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Entity(name="jt_learners")
@Data
@PrimaryKeyJoinColumn(name="user_id")

public class learner extends user {
    int psp;
    int cuurrcompany;
}
