package org.example.UserBase;

import org.example.Order;
import org.example.Product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class User extends UserBase{
    private String emailAddress;
    private String phoneNumber;
    private String address;
    private double wallet;
    private ArrayList<ShoppingCart> products = new ArrayList<>();
    private ArrayList<Order> listOfOrders = new ArrayList<>();
    private ArrayList<ShoppingCart> listOfPurchasedProducts = new ArrayList<>();

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
    public void addOrder(Order order){
        listOfOrders.add(order);
    }
    public boolean addProduct(String ID, ShoppingCart shoppingCart){
        if (searchByID(ID).isEmpty()){
            products.add(shoppingCart);
            return true;
        } else {
            return false;
        }
    }
    public List<ShoppingCart> searchInCartByID(String ID){
        return products.stream().
                filter(shoppingCart -> shoppingCart.getID().equals(ID)).collect(Collectors.toList());
    }
    public Optional<ShoppingCart> searchByID(String ID){
        return products.stream().
                filter(shoppingCart -> shoppingCart.getID().equals(ID)).findFirst();
    }
    public ArrayList<ShoppingCart> showShoppingCart(){
        return products;
    }
    public void addToPurchasedProducts(ShoppingCart shoppingCart){
        listOfPurchasedProducts.add(shoppingCart);
    }
    public void removeFromShoppingCart(ShoppingCart shoppingCart){
        products.remove(shoppingCart);
    }
    @Override
    public String toString() {
        return super.toString() + "->" + "User{" +
                "emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", wallet=" + wallet +
                ", products=" + products +
                ", listOfOrders=" + listOfOrders +
                ", listOfPurchasedProducts=" + listOfPurchasedProducts +
                '}';
    }
}
