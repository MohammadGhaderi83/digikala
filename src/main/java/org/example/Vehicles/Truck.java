package org.example.Vehicles;

public class Truck extends Vehicle{
    private float numberOfWheels;
    private boolean doesHaveBed;

    public Truck(String name, String brand, double price, int number, String color, int horsepower, int tankVolume, float numberOfWheels, boolean doesHaveBed) {
        super(name, brand, price, number, color, horsepower, tankVolume);
        this.numberOfWheels = numberOfWheels;
        this.doesHaveBed = doesHaveBed;
    }

    public float getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(float numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isDoesHaveBed() {
        return doesHaveBed;
    }

    public void setDoesHaveBed(boolean doesHaveBed) {
        this.doesHaveBed = doesHaveBed;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "numberOfWheels=" + numberOfWheels +
                ", doesHaveBed=" + doesHaveBed +
                '}';
    }
}
