package org.example.Stationary;

public class Backpack extends Stationary{
    private int numberOfExternalPockets;
    private int numberOfInternalPockets;

    public Backpack(String name, String brand, double price, int number, String color, String ID, String material, String suitableFor, int numberOfExternalPockets, int numberOfInternalPockets) {
        super(name, brand, price, number, color, ID, material, suitableFor);
        this.numberOfExternalPockets = numberOfExternalPockets;
        this.numberOfInternalPockets = numberOfInternalPockets;
    }

    public int getNumberOfExternalPockets() {
        return numberOfExternalPockets;
    }

    public void setNumberOfExternalPockets(int numberOfExternalPockets) {
        this.numberOfExternalPockets = numberOfExternalPockets;
    }

    public int getNumberOfInternalPockets() {
        return numberOfInternalPockets;
    }

    public void setNumberOfInternalPockets(int numberOfInternalPockets) {
        this.numberOfInternalPockets = numberOfInternalPockets;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "Backpack{" +
                "numberOfExternalPockets=" + numberOfExternalPockets +
                ", numberOfInternalPockets=" + numberOfInternalPockets +
                '}';
    }
}
