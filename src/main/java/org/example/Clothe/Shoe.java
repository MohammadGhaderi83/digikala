package org.example.Clothe;

public class Shoe extends Clothe{
    private String isItShoeLace;

    public Shoe(String name, String brand, double price, int number, String color, String ID, String companyName, String material, String genre, String isItShoeLace) {
        super(name, brand, price, number, color, ID, companyName, material, genre);
        this.isItShoeLace = isItShoeLace;
    }

    public String isItShoeLace() {
        return isItShoeLace;
    }

    public void setItShoeLace(String itShoeLace) {
        isItShoeLace = itShoeLace;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "Shoe{" +
                "isItShoeLace=" + isItShoeLace +
                "}\n";
    }
}
