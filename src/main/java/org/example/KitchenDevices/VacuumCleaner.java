package org.example.KitchenDevices;

public class VacuumCleaner extends KitchenDevices{
    private int enginePower;
    private int powerCableLength;

    public VacuumCleaner(String name, String brand, double price, int number, String color, String ID, double volume, String energyConsumptionChart, int enginePower, int powerCableLength) {
        super(name, brand, price, number, color, ID, volume, energyConsumptionChart);
        this.enginePower = enginePower;
        this.powerCableLength = powerCableLength;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getPowerCableLength() {
        return powerCableLength;
    }

    public void setPowerCableLength(int powerCableLength) {
        this.powerCableLength = powerCableLength;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "enginePower=" + enginePower +
                ", powerCableLength=" + powerCableLength +
                '}';
    }
}
