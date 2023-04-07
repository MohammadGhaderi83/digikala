package org.example.Product;

public abstract class Product {
    private String name;
    private String brand;
    private double price;
    private int number;
    private String color;
    private String ID;

    public Product(String name, String brand, double price, int number, String color, String ID) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.number = number;
        this.color = color;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", color='" + color + '\'' +
                ", ID=" + ID +
                '}';
    }
}
