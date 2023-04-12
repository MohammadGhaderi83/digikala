package org.example.ElectronicDevices;

public class Smartphone extends ElectronicDevices{
    private int cameraQuality;
    private int numOfCameras;

    public Smartphone(String name, String brand, double price, int number, String color, String ID, String processor, int storage, int cameraQuality, int numOfCameras) {
        super(name, brand, price, number, color, ID, processor, storage);
        this.cameraQuality = cameraQuality;
        this.numOfCameras = numOfCameras;
    }

    public int getCameraQuality() {
        return cameraQuality;
    }

    public void setCameraQuality(int cameraQuality) {
        this.cameraQuality = cameraQuality;
    }

    public int getNumOfCameras() {
        return numOfCameras;
    }

    public void setNumOfCameras(int numOfCameras) {
        this.numOfCameras = numOfCameras;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "Smartphone{" +
                "cameraQuality=" + cameraQuality +
                ", numOfCameras=" + numOfCameras +
                "}\n";
    }
}
