package org.example.Stationary;

import org.example.Product.Product;

public abstract class Stationary extends Product {
    private String material;
    private String suitableFor;

    public Stationary(String name, String brand, double price, int number, String color, String ID, String material, String suitableFor) {
        super(name, brand, price, number, color, ID);
        this.material = material;
        this.suitableFor = suitableFor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSuitableFor() {
        return suitableFor;
    }

    public void setSuitableFor(String suitableFor) {
        this.suitableFor = suitableFor;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "Stationary{" +
                "material='" + material + '\'' +
                ", suitableFor='" + suitableFor + '\'' +
                '}';
    }
}
