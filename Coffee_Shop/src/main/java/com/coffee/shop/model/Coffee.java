package com.coffee.shop.model;

public class Coffee {
    //Variables
    private int id;
    private String name;
    private String brew = "original";
    private String size;
    private double price;
    private final double SMALL_PRICE = 2.94;
    private final double MEDIUM_PRICE = 3.14;
    private final double LARGE_PRICE = 3.29;
    private final double X_LARGE_PRICE = 3.49;

    //Constructors
    public Coffee() {
    }

    public Coffee(int id, String name, String size) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = getPriceBySize(size);
    }

    public Coffee(int id, String name, String brew, String size) {
        this.id = id;
        this.name = name;
        this.brew = brew;
        this.size = size;
        this.price = getPriceBySize(size);
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrew() {
        return brew;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrew(String brew) {
        this.brew = brew;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //Function_Helper method

    @Override
    public String toString() {
        return "id: " + this.getId() + ",\n" +
                "name: " + this.getName() + ",\n" +
                "brew: " + this.getBrew() + ",\n" +
                "size: " + this.getSize() + ",\n" +
                "price: " + this.getPrice();
    }

    public double getPriceBySize(String size) {
        if (size.toLowerCase().startsWith("s")) {
            price = SMALL_PRICE;
        } else if (size.toLowerCase().startsWith("m")) {
            price = MEDIUM_PRICE;
        } else if (size.toLowerCase().startsWith("l")) {
            price = LARGE_PRICE;
        } else if (size.toLowerCase().startsWith("x")) {
            price = X_LARGE_PRICE;
        }
        return price;
    }
}
