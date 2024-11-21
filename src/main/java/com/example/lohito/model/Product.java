package com.example.lohito.model;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private long id;
    private String title;
    private String description;
    private double price;
    private String city;
    private String seller;
}
