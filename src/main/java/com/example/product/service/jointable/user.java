package com.example.product.service.jointable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
@Entity(name="jt_users")
@Inheritance(strategy= InheritanceType.JOINED)
public class user {
    @Id
    long id;
    String name;
    String email;
    String password;

}
