package com.example.product.service.mappedsuperclass;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class user {
    @Id
    long id;
    String name;
    String email;
    String password;

}
