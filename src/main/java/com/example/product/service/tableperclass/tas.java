package com.example.product.service.tableperclass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="tpc_tas")

public class tas extends user {
    String college;
    int noque;
}
