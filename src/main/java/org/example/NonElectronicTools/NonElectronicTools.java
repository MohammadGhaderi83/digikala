package org.example.NonElectronicTools;

import org.example.Product.Product;

public abstract class NonElectronicTools extends Product {
    private String material;
    private int weight;

    public NonElectronicTools(String name, String brand, double price, int number, String color, String ID, String material, int weight) {
        super(name, brand, price, number, color, ID);
        this.material = material;
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
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
