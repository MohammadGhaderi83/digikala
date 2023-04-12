package org.example.HealthTool;

public class BloodSugarTestMachine extends HealthTool{
    private double minimumBloodRequired;
    private int numberOfTestStrips;

    public BloodSugarTestMachine(String name, String brand, double price, int number, String color, String ID, String supplyPower, String used, double minimumBloodRequired, int numberOfTestStrips) {
        super(name, brand, price, number, color, ID, supplyPower, used);
        this.minimumBloodRequired = minimumBloodRequired;
        this.numberOfTestStrips = numberOfTestStrips;
    }

    public double getMinimumBloodRequired() {
        return minimumBloodRequired;
    }

    public void setMinimumBloodRequired(double minimumBloodRequired) {
        this.minimumBloodRequired = minimumBloodRequired;
    }

    public int getNumberOfTestStrips() {
        return numberOfTestStrips;
    }

    public void setNumberOfTestStrips(int numberOfTestStrips) {
        this.numberOfTestStrips = numberOfTestStrips;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "BloodSugarTestMachine{" +
                "minimumBloodRequired=" + minimumBloodRequired +
                ", numberOfTestStrips=" + numberOfTestStrips +
                "}\n";
    }
}
