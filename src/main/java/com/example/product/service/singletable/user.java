package com.example.product.service.singletable;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public class user {
    long id;
    String name;
    String email;
    String password;

}
