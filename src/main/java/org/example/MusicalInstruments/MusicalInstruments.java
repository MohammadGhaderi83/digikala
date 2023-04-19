package org.example.MusicalInstruments;

import org.example.Product.Product;

public abstract class MusicalInstruments extends Product {
    private double weight;
    private String material;

    public MusicalInstruments(String name, String brand, double price, int number, String color, String ID, String companyName, double weight, String material) {
        super(name, brand, price, number, color, ID, companyName);
        this.weight = weight;
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
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
        return super.toString() + "->" + "MusicalInstruments{" +
                "weight=" + weight +
                ", material='" + material + '\'' +
                '}';
    }
}
