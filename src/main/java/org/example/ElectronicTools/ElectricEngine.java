package org.example.ElectronicTools;

public class ElectricEngine extends ElectronicTools{
    private String fuelType;
    private int enginePower;

    public ElectricEngine(String name, String brand, double price, int number, String color, int weight, int powerConsumption, String fuelType, int enginePower) {
        super(name, brand, price, number, color, weight, powerConsumption);
        this.fuelType = fuelType;
        this.enginePower = enginePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "ElectricEngine{" +
                "fuelType='" + fuelType + '\'' +
                ", enginePower=" + enginePower +
                '}';
    }
}
