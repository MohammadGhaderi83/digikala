package org.example.NonElectronicTools;

import org.example.Product.Product;

public abstract class NonElectronicTools extends Product {
    private String material;
    private double weight;

    public NonElectronicTools(String name, String brand, double price, int number, String color, String ID, String companyName, String material, double weight) {
        super(name, brand, price, number, color, ID, companyName);
        this.material = material;
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "NonElectronicTools{" +
                "material='" + material + '\'' +
                ", weight=" + weight +
                '}';
    }
}
