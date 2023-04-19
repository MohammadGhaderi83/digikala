package org.example.ElectronicTools;

import org.example.Product.Product;

public abstract class ElectronicTools extends Product {
    private double weight;
    private int powerConsumption;

    public ElectronicTools(String name, String brand, double price, int number, String color, String ID, String companyName, double weight, int powerConsumption) {
        super(name, brand, price, number, color, ID, companyName);
        this.weight = weight;
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
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
