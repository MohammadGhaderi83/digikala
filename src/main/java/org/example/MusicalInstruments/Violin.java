package org.example.MusicalInstruments;

public class Violin extends MusicalInstruments{
    private String chinMaterial;
    private String topPlateMaterial;

    public Violin(String name, String brand, double price, int number, String color, String ID, String companyName, int weight, String material, String chinMaterial, String topPlateMaterial) {
        super(name, brand, price, number, color, ID, companyName, weight, material);
        this.chinMaterial = chinMaterial;
        this.topPlateMaterial = topPlateMaterial;
    }

    public String getChinMaterial() {
        return chinMaterial;
    }

    public void setChinMaterial(String chinMaterial) {
        this.chinMaterial = chinMaterial;
    }

    public String getTopPlateMaterial() {
        return topPlateMaterial;
    }

    public void setTopPlateMaterial(String topPlateMaterial) {
        this.topPlateMaterial = topPlateMaterial;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "Violin{" +
                "chinMaterial='" + chinMaterial + '\'' +
                ", topPlateMaterial='" + topPlateMaterial + '\'' +
                "}\n";
    }
}
