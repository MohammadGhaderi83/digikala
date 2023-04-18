package org.example.Vehicles;

import org.example.Product.Product;

public abstract class Vehicle extends Product {
    private int horsepower;
    private int tankVolume;

    public Vehicle(String name, String brand, double price, int number, String color, String ID, String companyName, int horsepower, int tankVolume) {
        super(name, brand, price, number, color, ID, companyName);
        this.horsepower = horsepower;
        this.tankVolume = tankVolume;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "Vehicle{" +
                "horsepower=" + horsepower +
                ", tankVolume=" + tankVolume +
                '}';
    }
}