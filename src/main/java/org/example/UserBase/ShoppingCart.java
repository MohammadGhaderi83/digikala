package org.example.UserBase;
import org.example.CurrentDate;
import java.util.ArrayList;
import java.util.Optional;

public class ShoppingCart {
    private String name;
    private String brand;
    private String category;
    private String ID;
    private double price;
    ArrayList<ShoppingCart> products = new ArrayList<>();
    private String sellerCompanyName;
    private int numOfAvailableItems;
    private String date;

    public ShoppingCart() {
    }
    public ShoppingCart(String name, String brand, String category, String ID, double price, String sellerCompanyName, int numOfAvailableItems, String date) {
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.ID = ID;
        this.price = price;
        this.sellerCompanyName = sellerCompanyName;
        this.numOfAvailableItems = numOfAvailableItems;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(CurrentDate date) {
        this.date = date.getNow();
    }

    public int getNumOfAvailableItems() {
        return numOfAvailableItems;
    }

    public void setNumOfAvailableItems(int numOfAvailableItems) {
        this.numOfAvailableItems = numOfAvailableItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getSellerCompanyName() {
        return sellerCompanyName;
    }

    public void setSellerCompanyName(String sellerCompanyName) {
        this.sellerCompanyName = sellerCompanyName;
    }
    public boolean addProduct(String ID, ShoppingCart shoppingCart){
        if (searchByID(ID).isEmpty()){
            products.add(shoppingCart);
            return true;
        } else {
            return false;
        }
    }
    public Optional<ShoppingCart> searchByID(String ID){
        return products.stream().
                filter(shoppingCart -> shoppingCart.getID().equals(ID)).findFirst();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", ID='" + ID + '\'' +
                ", price=" + price +
                ", products=" + products +
                ", sellerCompanyName='" + sellerCompanyName + '\'' +
                ", date=" + date +
                "}\n";
    }
}
