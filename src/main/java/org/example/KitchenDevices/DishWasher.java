package org.example.KitchenDevices;

public class DishWasher extends KitchenDevices{
    private int capacity;
    private int numberOfBaskets;

    public DishWasher(String name, String brand, double price, int number, String color, String ID, String companyName, double volume, String energyConsumptionChart, int capacity, int numberOfBaskets) {
        super(name, brand, price, number, color, ID, companyName, volume, energyConsumptionChart);
        this.capacity = capacity;
        this.numberOfBaskets = numberOfBaskets;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfBaskets() {
        return numberOfBaskets;
    }

    public void setNumberOfBaskets(int numberOfBaskets) {
        this.numberOfBaskets = numberOfBaskets;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "DishWasher{" +
                "capacity=" + capacity +
                ", numberOfBaskets=" + numberOfBaskets +
                "}\n";
    }
}
