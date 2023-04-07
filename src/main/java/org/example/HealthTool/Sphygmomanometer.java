package org.example.HealthTool;

public class Sphygmomanometer extends HealthTool{
    private String suitableArmSize;
    private String displayType;

    public Sphygmomanometer(String name, String brand, double price, int number, String color, String ID, String supplyPower, String used, String suitableArmSize, String displayType) {
        super(name, brand, price, number, color, ID, supplyPower, used);
        this.suitableArmSize = suitableArmSize;
        this.displayType = displayType;
    }

    public String getSuitableArmSize() {
        return suitableArmSize;
    }

    public void setSuitableArmSize(String suitableArmSize) {
        this.suitableArmSize = suitableArmSize;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "Sphygmomanometer{" +
                "suitableArmSize='" + suitableArmSize + '\'' +
                ", displayType='" + displayType + '\'' +
                '}';
    }
}
