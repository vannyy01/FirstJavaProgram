package com.company.products;

import com.company.Product;

public class Drink extends Product {
    public double alcohol = 0.5;

    public double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(double alcohol) {
        this.alcohol = alcohol;
    }

    public Drink(String name, double alcohol, double weight, int capacity, double price) {
        this.alcohol = alcohol;
        this.weight = weight;
        this.name = name;
        this.capacity = capacity;
        this.category = "drink";
        this.price = price;
    }

    public void getProduct() {
        System.out.print(
                "Name: " + this.name + System.lineSeparator() + "Category: " + this.category +
                        "Alcohol: " + this.alcohol + System.lineSeparator() + "Weight: " + this.weight
                        + System.lineSeparator() + "Capacity: " + this.capacity +
                        System.lineSeparator() + "Price: " + this.price
        );
    }
}
