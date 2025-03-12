package com.example.entity;

import com.example.entity.enums.ProductState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product{
    private String id= UUID.randomUUID().toString();
    private String name;
    private Double price;
    private ProductState productState=ProductState.ONSALE;
    private String totalProduct;
    private String availableProduct;

}
