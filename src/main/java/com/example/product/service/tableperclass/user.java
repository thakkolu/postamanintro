package com.example.product.service.tableperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
@Entity(name="tpc_users")
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public class user {
    @Id
    long id;
    String name;
    String email;
    String password;

}
