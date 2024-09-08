package com.example.product.service.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="msk_instructors")
public class instructor extends user{
     String avg_rating;
     String currcompany;

}
