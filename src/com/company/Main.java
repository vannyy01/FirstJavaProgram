package com.company;

//My first program on Java
public class Main {

    private static void product() {
        ProductFactory productFactory = new ProductFactory();
        productFactory.setCategory("drink");
        productFactory.setName("Guiness");
        productFactory.setAlcohol(2.3);
        productFactory.setCapacity(1);
        productFactory.setWeight(1.1);
        productFactory.setPrice(11);
        productFactory.getMerchandise().getProduct();
    }

    public static void main(String[] args) {
        product();
    }
}

