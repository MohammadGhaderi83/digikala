package org.example.ElectronicDevices;

public class Laptop extends ElectronicDevices{
    private int RAM;
    private double weight;

    public Laptop(String name, String brand, double price, int number, String color, String ID, String companyName, String processor, int storage, int RAM, double weight) {
        super(name, brand, price, number, color, ID, companyName, processor, storage);
        this.RAM = RAM;
        this.weight = weight;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "Laptop{" +
                "RAM=" + RAM +
                ", weight=" + weight +
                "}\n";
    }
}
