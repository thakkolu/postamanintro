package com.example.product.service.jointable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Entity(name="jt_instructors")
@Data
@PrimaryKeyJoinColumn(name="user_id")
public class instructor extends user {
     String avg_rating;
     String currcompany;

}
