package org.example.MusicalInstruments;

import org.example.Product.Product;

public class MusicalInstruments extends Product {
    private int weight;
    private String material;

    public MusicalInstruments(String name, String brand, double price, int number, String color, int weight, String material) {
        super(name, brand, price, number, color);
        this.weight = weight;
        this.material = material;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "MusicalInstruments{" +
                "weight=" + weight +
                ", material='" + material + '\'' +
                '}';
    }
}
