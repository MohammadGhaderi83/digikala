package org.example.ElectronicTools;

public class ElectricEngine extends ElectronicTools{
    private String fuelType;
    private int enginePower;

    public ElectricEngine(String name, String brand, double price, int number, String color, String ID, String companyName, double weight, int powerConsumption, String fuelType, int enginePower) {
        super(name, brand, price, number, color, ID, companyName, weight, powerConsumption);
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
        return super.toString() + "->" + "ElectricEngine{" +
                "fuelType='" + fuelType + '\'' +
                ", enginePower=" + enginePower +
                "}\n";
    }
}
