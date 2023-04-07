package org.example.UserBase;

import org.example.Product.Product;

import java.util.ArrayList;

public class User extends UserBase{
    private String emailAddress;
    private String phoneNumber;
    private String address;
    private double wallet;
    private ArrayList<Product> shoppingCart;
    private ArrayList<Product> listOfOrders;
    private ArrayList<Product> listOfPurchasedProducts;

    public User(String username, String password, String emailAddress, String phoneNumber, String address, double wallet) {
        super(username, password);
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.wallet = wallet;
    }

    public User(String username, String password) {
        super(username, password);
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return super.toString() + "->" + "User{" +
                "emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", wallet=" + wallet +
                ", shoppingCart=" + shoppingCart +
                ", listOfOrders=" + listOfOrders +
                ", listOfPurchasedProducts=" + listOfPurchasedProducts +
                '}';
    }
}
