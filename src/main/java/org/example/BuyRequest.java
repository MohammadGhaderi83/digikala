package org.example;

import org.example.UserBase.Seller;
import org.example.UserBase.ShoppingCart;
import org.example.UserBase.User;

public class BuyRequest {
    private User user;
    private Seller seller;
    private double productPrice;
    private double userWallet;
    private boolean isChecked;
    private int numOfAvaItems;
    private int numOfOrders;
    private Shop shop;
    private ShoppingCart shoppingCart;
    private String ID;

    public BuyRequest(User user, Seller seller, double productPrice, double userWallet, int numOfAvaItems, int numOfOrders, Shop shop, ShoppingCart shoppingCart, String ID) {
        this.user = user;
        this.seller = seller;
        this.productPrice = productPrice;
        this.userWallet = userWallet;
        this.numOfAvaItems = numOfAvaItems;
        this.numOfOrders = numOfOrders;
        this.shop = shop;
        this.shoppingCart = shoppingCart;
        this.ID = ID;
    }
    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public int getNumOfOrders() {
        return numOfOrders;
    }

    public void setNumOfOrders(int numOfOrders) {
        this.numOfOrders = numOfOrders;
    }

    public int getNumOfAvaItems() {
        return numOfAvaItems;
    }

    public void setNumOfAvaItems(int numOfAvaItems) {
        this.numOfAvaItems = numOfAvaItems;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getUserWallet() {
        return userWallet;
    }

    public void setUserWallet(double userWallet) {
        this.userWallet = userWallet;
    }
    public void increase(){
        if (isChecked){
            decreaseUserWallet(productPrice);
            increaseSellerWallet(productPrice * 0.9);
            profitOfShop(productPrice * 0.1);
            user.addToPurchasedProducts(shoppingCart);
            getShoppingCart().setNumOfAvailableItems(shoppingCart.getNumOfAvailableItems()- numOfOrders);
        }
    }
    public void decreaseUserWallet(double price){
        user.setWallet(user.getWallet()- price);
    }
    public void increaseSellerWallet(double sellerProfit){
        seller.setWallet(seller.getWallet() + sellerProfit);
    }
    public void profitOfShop(double shopProfit){
        shop.setTotalProfit(shopProfit);
    }
    @Override
    public String toString() {
        return "BuyRequest{" +
                "user=" + user +
                ", seller=" + seller +
                ", productPrice=" + productPrice +
                ", userWallet=" + userWallet +
                '}';
    }
}
