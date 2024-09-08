package com.example.product.service.jointable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Entity(name="jt_tas")
@Data
@PrimaryKeyJoinColumn(name="user_id")

public class tas extends user {
    String college;
    int noque;
}
