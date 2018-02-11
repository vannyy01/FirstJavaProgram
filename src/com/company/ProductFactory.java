package com.company;

import com.company.products.DefaultProduct;
import com.company.products.Drink;
import com.company.products.Milk;
import com.company.products.Sweets;

public final class ProductFactory {

    private double fatty;
    private int quantity;
    private double alcohol;
    private double weight;
    private String name;
    private int capacity;
    private String category;
    private double price;

    public ProductFactory() {
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private static final ProductFactory instance = new ProductFactory();

    public static ProductFactory getInstance() {
        return instance;
    }

    public void setFatty(double fatty) {
        this.fatty = fatty;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    public void setAlcohol(double alcohol) {

        this.alcohol = alcohol;
    }

    public void setCapacity(int capacity) {

        this.capacity = capacity;
    }


    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }


    public Product getMerchandise() {
        switch (this.category) {
            case "milk":
                return new Milk(this.name, this.fatty, this.weight, this.capacity, this.price);
            case "sweets":
                return new Sweets(this.name, this.quantity, this.weight, this.capacity, this.price);
            case "drink":
                return new Drink(this.name, this.alcohol, this.weight, this.capacity, this.price);
            default:
                System.out.print("Sorry you input invalid category");
        }
        return new DefaultProduct();
    }
}