package org.example.ElectronicTools;

import org.example.Product.Product;

public abstract class ElectronicTools extends Product {
    private int weight;
    private int powerConsumption;

    public ElectronicTools(String name, String brand, double price, int number, String color, String ID, String companyName, int weight, int powerConsumption) {
        super(name, brand, price, number, color, ID, companyName);
        this.weight = weight;
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "ElectronicTools{" +
                "weight=" + weight +
                ", powerConsumption=" + powerConsumption +
                '}';
    }
}
