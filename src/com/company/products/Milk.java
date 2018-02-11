package com.company.products;


import com.company.Product;

public class Milk extends Product {
    public double fatty = 2.5;

    public double getFatty() {
        return fatty;
    }

    public void setFatty(double fatty) {
        this.fatty = fatty;
    }


    public Milk(String name, double fatty, double weight, int capacity, double price) {
        this.fatty = fatty;
        this.weight = weight;
        this.name = name;
        this.capacity = capacity;
        this.category = "milk";
        this.price = price;

    }

    public void getProduct() {
        System.out.print(
                "Name: " + this.name + System.lineSeparator() + "Category: " + this.category +
                        "Fatty: " + this.fatty + System.lineSeparator() + "Weight: " + this.weight
                        + System.lineSeparator() + "Capacity: " + this.capacity +
                        System.lineSeparator() + "Price: " + this.price
        );
    }


}
