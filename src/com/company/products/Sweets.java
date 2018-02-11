package com.company.products;

import com.company.Product;

public class Sweets extends Product {
    public int quantity = 10;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public Sweets(String name, int quantity, double weight, int capacity, double price) {
        this.quantity = quantity;
        this.weight = weight;
        this.name = name;
        this.capacity = capacity;
        this.category = "sweets";
        this.price = price;

    }

    public void getProduct() {
        System.out.print(
                "Name: " + this.name + System.lineSeparator() + "Category: " + this.category +
                        "Quantity: " + this.quantity + System.lineSeparator() + "Weight: " + this.weight
                        + System.lineSeparator() + "Capacity: " + this.capacity +
                        System.lineSeparator() + "Price: " + this.price
        );
    }
}
