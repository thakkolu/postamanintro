package com.example.product.service.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name="msc_tas")
public class tas extends user{
    String college;
    int noque;
}
