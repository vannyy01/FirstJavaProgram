package com.company;

public abstract class Product {

    public String name = "Box";
    public double weight = 10;
    public double capacity = 20;
    public String category = "Basic";
    public  double price = 10;

    public abstract void getProduct();
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }


    /**
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }


    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public Double getWeight() {
        return weight;
    }

    public void setWeigth(float weight) {
        this.weight = weight;
    }


}