package org.example.Clothe;

import org.example.Product.Product;

public abstract class Clothe extends Product {
    private String material;
    private String genre;

    public Clothe(String name, String brand, double price, int number, String color, String ID, String material, String genre) {
        super(name, brand, price, number, color, ID);
        this.material = material;
        this.genre = genre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Clothe{" +
                "material='" + material + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

}
