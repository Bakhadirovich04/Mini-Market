package com.example.entity;

import com.example.entity.enums.ShopState;
import com.example.entity.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String id;
    private String name;
    private String email;
    private String password;
    private UserRole role;
    private Double balance;
    private List<Product> basket;
}
