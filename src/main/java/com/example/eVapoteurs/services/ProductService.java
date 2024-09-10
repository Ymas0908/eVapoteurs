package com.example.eVapoteurs.services;

import com.example.eVapoteurs.model.Product;
import com.example.eVapoteurs.model.enumeration.InventoryStatus;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Named
@ApplicationScoped
public class ProductService {

    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1000, "f230fh0g3", "Bamboo Watch", "Product Description", "bamboo-watch.jpg", 65,
                "Accessories", 24, InventoryStatus.INSTOCK, 5));
        products.add(new Product(1001, "nvklal433", "Black Watch", "Product Description", "black-watch.jpg", 72,
                "Accessories", 61, InventoryStatus.INSTOCK, 4));
        // Ajoutez le reste des produits ici...
        products.add(new Product(1029, "gwuby345v", "Yoga Set", "Product Description", "yoga-set.jpg", 20,
                "Fitness", 25, InventoryStatus.INSTOCK, 8));
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public List<Product> getProducts(int size) {
        if (size > products.size()) {
            Random rand = new Random();
            List<Product> randomList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int randomIndex = rand.nextInt(products.size());
                randomList.add(products.get(randomIndex));
            }
            return randomList;
        } else {
            return new ArrayList<>(products.subList(0, size));
        }
    }

    public List<Product> getClonedProducts(int size) {
        List<Product> originals = getProducts(size);
        List<Product> clones = new ArrayList<>();
        for (Product original : originals) {
            clones.add((Product) original.clone());
        }
        return clones;
    }
}