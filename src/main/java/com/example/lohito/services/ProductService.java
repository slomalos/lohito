package com.example.lohito.services;

import com.example.lohito.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private long ID = 0;

    private List<Product> products = new ArrayList<>();
    {
        products.add(new Product(++ID, "Playstation 5", "ployka", 65999.99, "Moscow", "AbdulEblan"));
        products.add(new Product(++ID,"Iphone X", "tilibon", 54000, "Moscow", "AbdulEblan"));
    }
    public List<Product> listProducts() {return products;}

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long ID) {
        products.removeIf(product -> product.getId() == (ID));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId() == id) {return product;}
        }
        return null;
    }

}
