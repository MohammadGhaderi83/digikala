package org.example.KitchenDevices;

import org.example.Product.Product;

public abstract class KitchenDevices extends Product {
    private double volume;
    private String energyConsumptionChart;

    public KitchenDevices(String name, String brand, double price, int number, String color, String ID, String companyName, double volume, String energyConsumptionChart) {
        super(name, brand, price, number, color, ID, companyName);
        this.volume = volume;
        this.energyConsumptionChart = energyConsumptionChart;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getEnergyConsumptionChart() {
        return energyConsumptionChart;
    }

    public void setEnergyConsumptionChart(String energyConsumptionChart) {
        this.energyConsumptionChart = energyConsumptionChart;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "KitchenDevices{" +
                "volume=" + volume +
                ", energyConsumptionChart='" + energyConsumptionChart + '\'' +
                '}';
    }
}
