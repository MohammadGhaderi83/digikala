package org.example.ElectronicTools;

public class CarWash extends ElectronicTools{
    private int maximumEaterTemperature;
    private int hoseLength;

    public CarWash(String name, String brand, double price, int number, String color, String ID, int weight, int powerConsumption, int maximumEaterTemperature, int hoseLength) {
        super(name, brand, price, number, color, ID, weight, powerConsumption);
        this.maximumEaterTemperature = maximumEaterTemperature;
        this.hoseLength = hoseLength;
    }

    public int getMaximumEaterTemperature() {
        return maximumEaterTemperature;
    }

    public void setMaximumEaterTemperature(int maximumEaterTemperature) {
        this.maximumEaterTemperature = maximumEaterTemperature;
    }

    public int getHoseLength() {
        return hoseLength;
    }

    public void setHoseLength(int hoseLength) {
        this.hoseLength = hoseLength;
    }

    @Override
    public String toString() {
        return "CarWash{" +
                "maximumEaterTemperature=" + maximumEaterTemperature +
                ", hoseLength=" + hoseLength +
                '}';
    }
}
