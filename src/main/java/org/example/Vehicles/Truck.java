package org.example.Vehicles;

public class Truck extends Vehicle{
    private float numberOfWheels;
    private String doesHaveBed;

    public Truck(String name, String brand, double price, int number, String color, String ID, String companyName, int horsepower, int tankVolume, float numberOfWheels, String doesHaveBed) {
        super(name, brand, price, number, color, ID, companyName, horsepower, tankVolume);
        this.numberOfWheels = numberOfWheels;
        this.doesHaveBed = doesHaveBed;
    }

    public float getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(float numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String isDoesHaveBed() {
        return doesHaveBed;
    }

    public void setDoesHaveBed(String doesHaveBed) {
        this.doesHaveBed = doesHaveBed;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "Truck{" +
                "numberOfWheels=" + numberOfWheels +
                ", doesHaveBed=" + doesHaveBed +
                "}\n";
    }
}
