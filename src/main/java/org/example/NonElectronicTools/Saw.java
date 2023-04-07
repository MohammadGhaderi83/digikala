package org.example.NonElectronicTools;

public class Saw extends NonElectronicTools{
    private int ironBladeLength;
    private String used;

    public Saw(String name, String brand, double price, int number, String color, String material, int weight, int ironBladeLength, String used) {
        super(name, brand, price, number, color, material, weight);
        this.ironBladeLength = ironBladeLength;
        this.used = used;
    }

    public int getIronBladeLength() {
        return ironBladeLength;
    }

    public void setIronBladeLength(int ironBladeLength) {
        this.ironBladeLength = ironBladeLength;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    @Override
    public String toString() {
        return "Saw{" +
                "ironBladeLength=" + ironBladeLength +
                ", used='" + used + '\'' +
                '}';
    }
}
