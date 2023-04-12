package org.example.MusicalInstruments;

public class Guitar extends MusicalInstruments{
    private int wiresNumber;
    private int bowlThickness;

    public Guitar(String name, String brand, double price, int number, String color, String ID, int weight, String material, int wiresNumber, int bowlThickness) {
        super(name, brand, price, number, color, ID, weight, material);
        this.wiresNumber = wiresNumber;
        this.bowlThickness = bowlThickness;
    }

    public int getWiresNumber() {
        return wiresNumber;
    }

    public void setWiresNumber(int wiresNumber) {
        this.wiresNumber = wiresNumber;
    }

    public int getBowlThickness() {
        return bowlThickness;
    }

    public void setBowlThickness(int bowlThickness) {
        this.bowlThickness = bowlThickness;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "Guitar{" +
                "wiresNumber=" + wiresNumber +
                ", bowlThickness=" + bowlThickness +
                "}\n";
    }
}
