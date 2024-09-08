package com.example.product.service.tableperclass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="tpc_instructors")

public class instructor extends user {
     String avg_rating;
     String currcompany;

}
