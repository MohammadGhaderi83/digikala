package org.example.HealthTool;

import org.example.Product.Product;

public abstract class HealthTool extends Product {
    private String supplyPower;
    private String used;

    public HealthTool(String name, String brand, double price, int number, String color, String supplyPower, String used) {
        super(name, brand, price, number, color);
        this.supplyPower = supplyPower;
        this.used = used;
    }

    public String getSupplyPower() {
        return supplyPower;
    }

    public void setSupplyPower(String supplyPower) {
        this.supplyPower = supplyPower;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    @Override
    public String toString() {
        return "HealthTool{" +
                "supplyPower='" + supplyPower + '\'' +
                ", used='" + used + '\'' +
                '}';
    }
}
