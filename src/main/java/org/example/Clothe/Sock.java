package org.example.Clothe;

public class Sock extends Clothe {
    private String size;

    public Sock(String name, String brand, double price, int number, String color, String ID, String material, String genre, String size) {
        super(name, brand, price, number, color, ID, material, genre);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "Sock{" +
                "size='" + size + '\'' +
                '}';
    }
}
