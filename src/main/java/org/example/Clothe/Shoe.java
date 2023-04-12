package org.example.Clothe;

public class Shoe extends Clothe{
    private boolean isItShoeLace;

    public Shoe(String name, String brand, double price, int number, String color, String ID, String material, String genre, boolean isItShoeLace) {
        super(name, brand, price, number, color, ID, material, genre);
        this.isItShoeLace = isItShoeLace;
    }

    public boolean isItShoeLace() {
        return isItShoeLace;
    }

    public void setItShoeLace(boolean itShoeLace) {
        isItShoeLace = itShoeLace;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "Shoe{" +
                "isItShoeLace=" + isItShoeLace +
                "}\n";
    }
}
