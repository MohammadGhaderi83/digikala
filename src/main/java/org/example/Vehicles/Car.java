package org.example.Vehicles;

public class Car extends Vehicle{
    private int seatsNumber;

    public Car(String name, String brand, double price, int number, String color, String ID, int horsepower, int tankVolume, int seatsNumber) {
        super(name, brand, price, number, color, ID, horsepower, tankVolume);
        this.seatsNumber = seatsNumber;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "Car{" +
                "seatsNumber=" + seatsNumber +
                "}\n";
    }
}
