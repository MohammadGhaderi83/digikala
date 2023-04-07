package org.example.ElectronicDevices;

import org.example.Product.Product;

public abstract class ElectronicDevices extends Product {
    private String processor;
    private int storage;

    public ElectronicDevices(String name, String brand, double price, int number, String color, String ID, String processor, int storage) {
        super(name, brand, price, number, color, ID);
        this.processor = processor;
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "ElectronicDevices{" +
                "processor='" + processor + '\'' +
                ", storage=" + storage +
                '}';
    }
}
