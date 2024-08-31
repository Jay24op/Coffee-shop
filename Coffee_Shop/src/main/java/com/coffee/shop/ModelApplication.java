package com.coffee.shop;

import com.coffee.shop.model.Coffee;

public class ModelApplication {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(1, "Hot", "Large");

        System.out.println(coffee);
    }
}
