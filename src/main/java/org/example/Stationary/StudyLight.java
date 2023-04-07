package org.example.Stationary;

public class StudyLight extends Stationary{
    private int bubbleDiameter;
    private int numberOfUsableLamps;

    public StudyLight(String name, String brand, double price, int number, String color, String material, String suitableFor, int bubbleDiameter, int numberOfUsableLamps) {
        super(name, brand, price, number, color, material, suitableFor);
        this.bubbleDiameter = bubbleDiameter;
        this.numberOfUsableLamps = numberOfUsableLamps;
    }

    public int getBubbleDiameter() {
        return bubbleDiameter;
    }

    public void setBubbleDiameter(int bubbleDiameter) {
        this.bubbleDiameter = bubbleDiameter;
    }

    public int getNumberOfUsableLamps() {
        return numberOfUsableLamps;
    }

    public void setNumberOfUsableLamps(int numberOfUsableLamps) {
        this.numberOfUsableLamps = numberOfUsableLamps;
    }

    @Override
    public String toString() {
        return "StudyLight{" +
                "bubbleDiameter=" + bubbleDiameter +
                ", numberOfUsableLamps=" + numberOfUsableLamps +
                '}';
    }
}
