package com.example.entity;

import com.example.entity.enums.ShopState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
    private String id = UUID.randomUUID().toString();
    private String name;
    private String ownerId;
    private ShopState shopState=ShopState.ACTIVE;
    private List<Product> products;
}
