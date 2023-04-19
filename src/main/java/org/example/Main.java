package org.example;

import org.example.Clothe.Shoe;
import org.example.Clothe.Sock;
import org.example.ElectronicDevices.Laptop;
import org.example.ElectronicDevices.Smartphone;
import org.example.ElectronicTools.CarWash;
import org.example.ElectronicTools.ElectricEngine;
import org.example.HealthTool.BloodSugarTestMachine;
import org.example.HealthTool.Sphygmomanometer;
import org.example.KitchenDevices.DishWasher;
import org.example.KitchenDevices.VacuumCleaner;
import org.example.MusicalInstruments.Guitar;
import org.example.MusicalInstruments.Violin;
import org.example.NonElectronicTools.Hammer;
import org.example.NonElectronicTools.Saw;
import org.example.Stationary.Backpack;
import org.example.Stationary.StudyLight;
import org.example.UserBase.Admin;
import org.example.UserBase.Seller;
import org.example.UserBase.ShoppingCart;
import org.example.UserBase.User;
import org.example.Vehicles.Car;
import org.example.Vehicles.Truck;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Shop shop = new Shop();
    public static void main(String[] args) {
        System.out.println("** Welcome to the online shop **");
        User user = new User("username","password","mamad@gmail.com","09153346894","ads", 600000);
        User user1 = new User("mamad","123","ghader@gmailcom","0912456789","assdsdklf fggjfdlkg fklkf", 0);
        Admin admin = new Admin("admin", "password1","nobari@gmail.com");
        Seller seller = new Seller("seller", "password2",12);
        Laptop laptop = new Laptop("zBook","hp",50000, 5, "silver", "123","seller", "intel", 256, 16, 3);
        shop.addLaptop(laptop);
        shop.createAccountUser(user);
        shop.createAccountUser(user1);
        shop.addAdmin(admin);
        shop.createAccountSeller(seller);
        runMenu();
    }
    public static void runMenu()
    {
        boolean runFlag = true;
        while (runFlag)
        {
            System.out.println("Please choose(1-6)\n" +
                    "1- Sign in\n" +
                    "2- Sign Up\n" +
                    "3- About shop\n" +
                    "4- View products\n" +
                    "5- Search a product\n" +
                    "6- Exit");
            String choice = input.next();
            if (choice.equals("1"))
            {
                signInMenu();
            } else if (choice.equals("2")) {
                signUpMenu();
            } else if (choice.equals("3")) {
                System.out.println("Name: " + shop.getName());
                System.out.println("Web address: " + shop.getWebAddress());
                System.out.println("Support number: " + shop.getSupportNumber());
            } else if (choice.equals("4")) {
                shop.showProducts();
            } else if (choice.equals("5")) {
                System.out.println("Please enter the product name: ");
                String productName = input.next();
                shop.searchProduct(productName);
            } else if (choice.equals("6")) {
                runFlag = false;
                System.out.println("DigiKala is glad to have served");
            } else {
                System.out.println("Invalid Input! please try again.");
            }
        }
    }
    public static void signInMenu()
    {
        boolean runFlag = true;
        while (runFlag)
        {
            System.out.println("What kind of account do you want to make?(1-3)\n" +
                    "1- User account\n" +
                    "2- Seller account\n" +
                    "3- Back to menu");
            String userChoice = input.next();
            if (userChoice.equals("1"))
            {
                System.out.println("Please enter your username: ");
                String username = input.next();
                System.out.println("Please enter a password: ");
                String password = input.next();
                System.out.println("Please confirm your password: ");
                String confirmPassword = input.next();
                System.out.println("Please enter an email address: ");
                String emailAddress = input.next();
                System.out.println("Please enter a phone number: ");
                String phoneNumber = input.next();
                System.out.println("Please enter an address: ");
                String address = input.next();
                if (password.equals(confirmPassword))
                {
                    User user = new User(username, password, emailAddress, phoneNumber, address,0);
                    String message =  shop.createAccountUser(user) ? username + " successfully added!" : "there is exist a password same you have entered!";
                    System.out.println(message);
                    userMenu(user);
                } else {
                    System.out.println("Passwords doesn't match! please try again.");
                }
            } else if (userChoice.equals("2")){
                System.out.println("Please enter your company name: ");
                String username = input.next();
                System.out.println("Please enter a password: ");
                String password = input.next();
                System.out.println("Please confirm your password: ");
                String confirmPassword = input.next();
                if (password.equals(confirmPassword))
                {
                    Seller seller = new Seller(username, password);
                    String message = shop.createAccountSeller(seller) ? username + " successfully added!" : "there is exist a password same you have entered!";
                    System.out.println(message);
                    sellerMenu(seller);
                } else {
                    System.out.println("Passwords don't match! please try again.");
                }
            } else if (userChoice.equals("3")){
                System.out.println("I am glad to have served");
                runFlag = false;
            } else {
                System.out.println("Invalid input! please try again.");
            }

        }
    }
    public static void signUpMenu()
    {
        boolean runFlag = true;
        while(runFlag)
        {
            System.out.println("You want to sign up as a\\an(1-4):\n" +
                    "1- User\n" +
                    "2- Seller\n" +
                    "3- Admin\n" +
                    "4- Back to menu");
            String userChoice = input.next();
            if (userChoice.equals("1")){
                System.out.println("Please enter your username: ");
                String username = input.next();
                System.out.println("Please enter your password: ");
                String password = input.next();
                User user = shop.searchUser(password).get();
                if (user.getUsername().equals(username))
                {
                    userMenu(user);
                } else {
                    System.out.println("Wrong username! Please try again");
                }
            } else if (userChoice.equals("2")){
                System.out.println("Please enter your company name: ");
                String username = input.next();
                System.out.println("Please enter your password: ");
                String password = input.next();
                Seller seller = shop.searchSeller(password).get();
                if (seller.getUsername().equals(username))
                {
                    sellerMenu(seller);
                } else {
                    System.out.println("Wrong company name! Please try again");
                }
            } else if (userChoice.equals("3")){
                System.out.println("Please enter your username: ");
                String username = input.next();
                System.out.println("Please enter your password: ");
                String password = input.next();
                Admin admin = shop.searchAdmin(password).get();
                if (admin.getUsername().equals(username))
                {
                    adminMenu(admin);
                } else {
                    System.out.println("Wrong username! Please try again");
                }
            }else if(userChoice.equals("4")){
                System.out.println("I am glad to have served");
                runFlag = false;
            }else {
                System.out.println("Invalid input! please try again.");
            }
        }
    }
    public static void userMenu(User user)
    {
        System.out.println("Hi " + user.getUsername() + " welcome to your shop");
        boolean runFlag = true;
        while(runFlag)
        {
            System.out.println("1- Show profile\n" +
                    "2- Update profile\n" +
                    "3- Show products\n" +
                    "4- Log out\n" +
                    "5- Increase wallet\n"+
                    "6- Search a product\n"+
                    "7- Show Shopping Cart\n"+
                    "8- Buy a product\n" +
                    "9- Back");
            String userChoice = input.next();
            if (userChoice.equals("1"))
            {
                shop.userProfile(user.getPassword());
            } else if (userChoice.equals("2"))
            {
                boolean runFlag1 = true;
                while(runFlag1)
                {
                    System.out.println("What do you want to change?\n" +
                            "1- Change username\n" +
                            "2- Change password\n" +
                            "3- Back");
                    String userChoice1 = input.next();
                    if (userChoice1.equals("1"))
                    {
                        System.out.println("enter your new username: ");
                        String newUsername = input.next();
                        user.setUsername(newUsername);
                        System.out.println("username changed successfully");
                    } else if (userChoice1.equals("2"))
                    {
                        System.out.println("Please enter a new password");
                        String newPassword = input.next();
                        System.out.println("Please confirm your new password: ");
                        String confirmPassword = input.next();
                        if (newPassword.equals(confirmPassword))
                        {
                            if (shop.userLogin(newPassword))
                            {
                                System.out.println("There is exist a password like this! try again");
                            } else {
                                System.out.println("password changed successfully");
                            }
                        } else {
                            System.out.println("Passwords don't match! please try again.");
                        }
                    } else if (userChoice1.equals("3"))
                    {
                        System.out.println("I am glad to have served");
                        runFlag1 = false;
                    } else {
                        System.out.println("Invalid input! please try again.");
                    }
                }

            } else if (userChoice.equals("3")) {
                shop.showProducts();
            } else if (userChoice.equals("4")) {
                String message = shop.userLogout(user.getPassword()) ? "Done!" : "it didn't work";
                System.out.println(message);
                signUpMenu();
            } else if (userChoice.equals("5")) {
                System.out.println("how much do you want to increase?");
                int amount = input.nextInt();
                WalletRequest request = new WalletRequest(user, amount);
                shop.addRequest(request);
                System.out.println("Wait until admin respond to your request");
            } else if (userChoice.equals("6")){
                ShoppingCart shoppingCart = new ShoppingCart();
                System.out.println("Please enter the product name: ");
                String productName = input.next();
                if (!shop.searchLaptop(productName).isEmpty())
                {
                    System.out.println(shop.searchLaptop(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInLaptop(ID, productName));
                        Laptop temp = shop.searchInLaptop(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Electronic devices", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchSmartphone(productName).isEmpty()){
                    System.out.println(shop.searchSmartphone(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInSmartphone(ID, productName));
                        Smartphone temp = shop.searchInSmartphone(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Electronic devices", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchShoe(productName).isEmpty()){
                    System.out.println(shop.searchShoe(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInShoe(ID, productName));
                        Shoe temp = shop.searchInShoe(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Clothe", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchSock(productName).isEmpty()){
                    System.out.println(shop.searchSock(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInSock(ID, productName));
                        Sock temp = shop.searchInSock(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Clothe", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchBloodSugarTestMachine(productName).isEmpty()){
                    System.out.println(shop.searchBloodSugarTestMachine(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInBloodSugarTest(ID, productName));
                        BloodSugarTestMachine temp = shop.searchInBloodSugarTest(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Health tools", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchSphygmomanometer(productName).isEmpty()){
                    System.out.println(shop.searchSphygmomanometer(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInSphygmomanometer(ID, productName));
                        Sphygmomanometer temp = shop.searchInSphygmomanometer(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Health tools", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchElectricEngine(productName).isEmpty()){
                    System.out.println(shop.searchElectricEngine(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInElectronicEngine(ID, productName));
                        ElectricEngine temp = shop.searchInElectronicEngine(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Electronic Tools", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchCarWash(productName).isEmpty()){
                    System.out.println(shop.searchCarWash(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInCarWash(ID, productName));
                        CarWash temp = shop.searchInCarWash(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Electronic Tools", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchDishWasher(productName).isEmpty()){
                    System.out.println(shop.searchDishWasher(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInDishwasher(ID, productName));
                        DishWasher temp = shop.searchInDishwasher(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Kitchen devices", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchSaw(productName).isEmpty()){
                    System.out.println(shop.searchSaw(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInSaw(ID, productName));
                        Saw temp = shop.searchInSaw(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Non Electronic devices", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchVacuumCleaner(productName).isEmpty()){
                    System.out.println(shop.searchVacuumCleaner(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInVacuumCleaner(ID, productName));
                        VacuumCleaner temp = shop.searchInVacuumCleaner(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Kitchen devices", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchGuitar(productName).isEmpty()){
                    System.out.println(shop.searchGuitar(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInGuitar(ID, productName));
                        Guitar temp = shop.searchInGuitar(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Musical Instruments", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchViolin(productName).isEmpty()){
                    System.out.println(shop.searchViolin(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInViolin(ID, productName));
                        Violin temp = shop.searchInViolin(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Musical Instruments", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchHammer(productName).isEmpty()){
                    System.out.println(shop.searchHammer(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInHammer(ID, productName));
                        Hammer temp = shop.searchInHammer(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Non Electronic devices", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchBackpack(productName).isEmpty()){
                    System.out.println(shop.searchBackpack(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInBackpack(ID, productName));
                        Backpack temp = shop.searchInBackpack(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Stationary", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchStudyLight(productName).isEmpty()){
                    System.out.println(shop.searchStudyLight(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInStudyLight(ID, productName));
                        StudyLight temp = shop.searchInStudyLight(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Stationary", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchCar(productName).isEmpty()){
                    System.out.println(shop.searchCar(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInCar(ID, productName));
                        Car temp = shop.searchInCar(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Vehicle", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else if (!shop.searchTruck(productName).isEmpty()){
                    System.out.println(shop.searchTruck(productName));
                    System.out.println("If you want to add a product to your shopping cart Please enter it's ID(if you want to back enter b): ");
                    String ID = input.next();
                    if (!ID.equalsIgnoreCase("b")){
                        System.out.println(shop.searchInTruck(ID, productName));
                        Truck temp = shop.searchInTruck(ID, productName).get(0);
                        ShoppingCart product = new ShoppingCart(temp.getName(), temp.getBrand(), "Vehicle", temp.getID(), temp.getPrice(), temp.getCompanyName(), temp.getNumber());
                        shoppingCart.addProduct(ID, product);
                        user.addProduct(ID, product);
                    }
                } else {
                    System.out.println("There is no product according to your search :((");
                }
            } else if (userChoice.equals("7")) {
                if (!user.showShoppingCart().isEmpty()){
                    System.out.println(user.showShoppingCart());
                } else {
                    System.out.println("Your shopping cart is empty!");
                }
            } else if (userChoice.equals("8")) {
                System.out.println(user.showShoppingCart());
                System.out.println("If you want to buy any of the products in your list please enter it's ID(if you want to back enter b.):");
                String ID = input.next();
                if (!ID.equals("b")){
                    ShoppingCart product = user.searchInCartByID(ID).get(0);
                    System.out.println("How many item\\items do you want to buy?");
                    int numOfItems = input.nextInt();
                    if (product.getPrice() > user.getWallet()){
                        System.out.println("Your wallet can't support for the amount of order:( please increase your wallet.");
                    } else {
                        Seller seller = shop.searchSellerByUsername(product.getSellerCompanyName()).orElse(null);
                        BuyRequest request = new BuyRequest(user, seller, product.getPrice(), user.getWallet(), product.getNumOfAvailableItems(), numOfItems, shop, product, product.getID());
                        shop.addShoppingCartRequest(request);
                        System.out.println("Yor request sent to our admins wait for their respond!");
                    }
                }
            } else if (userChoice.equals("9")){
                System.out.println("I am glad to have served");
                runFlag = false;
            } else {
                System.out.println("Invalid input! please try again.");
            }
        }
    }
    public static void sellerMenu(@NotNull Seller seller)
    {
        System.out.println("Welcome dear " + seller.getUsername());
        boolean runFlag = true;
        while(runFlag)
        {
            System.out.println("1- My profile\n" +
                    "2- Update profile\n" +
                    "3- List of available products\n" +
                    "4- Add product\n" +
                    "5- Back");
            String choice = input.next();
            if (choice.equals("1"))
            {
                shop.sellerProfile(seller.getPassword());
            } else if(choice.equals("2"))
            {
                System.out.println("What do you want to change?\n" +
                        "1- Change username\n" +
                        "2- Change password\n" +
                        "3- Back");
                String userChoice = input.next();
                if (userChoice.equals("1"))
                {
                    System.out.println("enter your new company name: ");
                    String newUsername = input.next();
                    seller.setUsername(newUsername);
                    System.out.println("company name changed successfully");
                } else if (userChoice.equals("2"))
                {
                    System.out.println("Please enter a new password");
                    String newPassword = input.next();
                    System.out.println("Please confirm your new password: ");
                    String confirmPassword = input.next();
                    if (newPassword.equals(confirmPassword))
                    {
                        if (shop.adminLogin(seller.getPassword()))
                        {
                            System.out.println("There is exist a password like this! try again");
                        } else {
                            System.out.println("password changed successfully");
                        }
                    } else {
                        System.out.println("Passwords don't match! please try again.");
                    }
                } else if (userChoice.equals("3"))
                {
                    System.out.println("I am glad to have served");
                    runFlag = false;
                } else {
                    System.out.println("Invalid input! please try again.");
                }
            } else if (choice.equals("3"))
            {
                shop.showProducts();
            } else if (choice.equals("4"))
            {
                System.out.println("To witch category you want to add:\n" +
                        "1- Clothe\n" +
                        "2- Electronic devices\n" +
                        "3- Electronic tools\n" +
                        "4- Health tool\n" +
                        "5- Kitchen devices\n" +
                        "6- Musical instruments\n" +
                        "7- Non electronic tools\n" +
                        "8- Stationary\n" +
                        "9- Vehicle");
                String sellerChoice1 = input.next();
                if (sellerChoice1.equals("1"))
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- Shoe\n" +
                            "2- Sock");
                    String sellerChoice2 = input.next();
                    if (sellerChoice2.equals("1"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("Please enter it's material: ");
                        String material = input.next();
                        System.out.println("Please enter it's genre: ");
                        String genre = input.next();
                        System.out.println("Is it shoeLace?");
                        String isItShoeLace = input.next();
                        Shoe shoe = new Shoe(name, brand, price, number, color, ID, seller.getUsername(), material, genre, isItShoeLace);
                        shop.addSho(shoe);
                        seller.addSho(shoe);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if (sellerChoice2.equals("2"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("Please enter it's material: ");
                        String material = input.next();
                        System.out.println("Please enter it's genre: ");
                        String genre = input.next();
                        System.out.println("What it's size?");
                        String size = input.next();
                        Sock sock = new Sock(name, brand, price, number, color, ID, seller.getUsername(), material, genre, size);
                        shop.addSock(sock);
                        seller.addSock(sock);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else if (sellerChoice1.equals("2"))
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- Laptop\n" +
                            "2- SmartPhone");
                    String sellerChoice2 = input.next();
                    if (sellerChoice2.equals("1"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter it's color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("Please enter it's processor: ");
                        String processor = input.next();
                        System.out.println("Please enter it's storage: ");
                        int storage = input.nextInt();
                        System.out.println("Please enter it's RAM size: ");
                        int RAM = input.nextInt();
                        System.out.println("Please enter it's weight: ");
                        int weight = input.nextInt();
                        Laptop laptop = new Laptop(name, brand, price, number, color, ID, seller.getUsername(), processor, storage, RAM, weight);
                        shop.addLaptop(laptop);
                        seller.addLaptop(laptop);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if (sellerChoice2.equals("2"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("Please enter it's processor: ");
                        String processor = input.next();
                        System.out.println("Please enter it's storage: ");
                        int storage = input.nextInt();
                        System.out.println("Please enter it's camera quality: ");
                        int cameraQuality = input.nextInt();
                        System.out.println("Please enter it's number of cameras: ");
                        int numberOfCameras = input.nextInt();
                        Smartphone smartphone = new Smartphone(name, brand, price, number, color, ID, seller.getUsername(), processor, storage, cameraQuality, numberOfCameras);
                        shop.addSmartphones(smartphone);
                        seller.addSmartphones(smartphone);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else if (sellerChoice1.equals("3"))
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- CarWash\n" +
                            "2- Electric Engine");
                    String sellerChoice2 = input.next();
                    if (sellerChoice2.equals("1"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("Please enter it's weight: ");
                        double weight = input.nextInt();
                        System.out.println("Please enter it's power consumption: ");
                        int powerConsumption = input.nextInt();
                        System.out.println("Please enter it's maximum water temperature: ");
                        int maximumEnterTemperature = input.nextInt();
                        System.out.println("please enter it's hose length: ");
                        int hoseLength = input.nextInt();
                        CarWash carWash = new CarWash(name, brand, price, number, color, ID, seller.getUsername(), weight, powerConsumption, maximumEnterTemperature, hoseLength);
                        shop.addCarWash(carWash);
                        seller.addCarWash(carWash);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if (sellerChoice2.equals("2"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("Please enter it's weight: ");
                        double weight = input.nextInt();
                        System.out.println("Please enter it's power consumption: ");
                        int powerConsumption = input.nextInt();
                        System.out.println("Please enter it's fuel type: ");
                        String fuelType = input.next();
                        System.out.println("Please enter it's engine power: ");
                        int enginePower = input.nextInt();
                        ElectricEngine electricEngine = new ElectricEngine(name, brand, price, number, color, ID, seller.getUsername(), weight, powerConsumption, fuelType, enginePower);
                        shop.addElectricEngine(electricEngine);
                        seller.addElectricEngine(electricEngine);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else if (sellerChoice1.equals("4"))
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- BloodSugarTestMachine\n" +
                            "2- Sphygmomanometer");
                    String sellerChoice2 = input.next();
                    if (sellerChoice2.equals("1"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("Please enter it's supply power:");
                        String supplyPower = input.next();
                        System.out.println("Please enter it's used: ");
                        String used = input.next();
                        System.out.println("Please it's minimum blood required: ");
                        double minimumBloodRequired = input.nextDouble();
                        System.out.println("Please enter it's number of test strips: ");
                        int numberOfTestStrips = input.nextInt();
                        BloodSugarTestMachine bloodSugarTestMachine = new BloodSugarTestMachine(name, brand, price, number, color, ID, seller.getUsername(), supplyPower, used, minimumBloodRequired, numberOfTestStrips);
                        shop.addBloodSugarTestMachine(bloodSugarTestMachine);
                        seller.addBloodSugarTestMachine(bloodSugarTestMachine);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if (sellerChoice2.equals("2"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("Please enter it's supply power:");
                        String supplyPower = input.next();
                        System.out.println("Please enter it's used: ");
                        String used = input.next();
                        System.out.println("Please enter it's suitable arm size: ");
                        String suitableArmSize = input.next();
                        System.out.println("Please enter it's display type: ");
                        String displayType = input.next();
                        Sphygmomanometer sphygmomanometer = new Sphygmomanometer(name, brand, price, number, color, ID, seller.getUsername(), supplyPower, used, suitableArmSize, displayType);
                        shop.addSphygmomanometer(sphygmomanometer);
                        seller.addSphygmomanometer(sphygmomanometer);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else if(sellerChoice1.equals("5"))
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- Dish Washer\n" +
                            "2- Vacuum Cleaner");
                    String sellerChoice2 = input.next();
                    if (sellerChoice2.equals("1"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("PLease enter it's volume: ");
                        double volume = input.nextDouble();;
                        System.out.println("Please enter it's energy consumption chart: ");
                        System.out.println("Please enter it's capacity: ");
                        int capacity = input.nextInt();
                        String energyConsumptionChart = input.next();
                        System.out.println("Please enter it's number of baskets: ");
                        int numOfBaskets = input.nextInt();
                        DishWasher dishWasher = new DishWasher(name, brand, price, number, color, ID, seller.getUsername(), volume, energyConsumptionChart, capacity, numOfBaskets);
                        shop.addDishWasher(dishWasher);
                        seller.addDishWasher(dishWasher);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if(sellerChoice2.equals("2"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("PLease enter it's volume: ");
                        double volume = input.nextDouble();;
                        System.out.println("Please enter it's energy consumption chart: ");
                        String energyConsumptionChart = input.next();
                        System.out.println("Please enter it's engine power:");
                        int enginePower = input.nextInt();
                        System.out.println("Please enter it's power cable length: ");
                        int powerCableLength = input.nextInt();;
                        VacuumCleaner vacuumCleaner = new VacuumCleaner(name, brand, price, number, color, ID, seller.getUsername(), volume, energyConsumptionChart, enginePower, powerCableLength);
                        shop.addVacuumCleaner(vacuumCleaner);
                        seller.addVacuumCleaner(vacuumCleaner);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else if (sellerChoice1.equals("6"))
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- Guitar\n" +
                            "2- Violin");
                    String sellerChoice2 = input.next();
                    if (sellerChoice2.equals("1"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("Please enter it's weight: ");
                        double weight = input.nextInt();
                        System.out.println("Please enter it's material: ");
                        String material = input.next();
                        System.out.println("Please enter it's wires number: ");
                        int wiresNumber = input.nextInt();
                        System.out.println("Please enter it's bowl thickness: ");
                        int bowlThickness = input.nextInt();
                        Guitar guitar = new Guitar(name, brand, price, number, color, ID, seller.getUsername(), weight, material, wiresNumber, bowlThickness);
                        shop.addGuitar(guitar);
                        seller.addGuitar(guitar);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if (sellerChoice2.equals("2"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("Please enter it's weight: ");
                        double weight = input.nextInt();
                        System.out.println("Please enter it's material: ");
                        String material = input.next();
                        System.out.println("Please enter it's chin material: ");
                        String chinMaterial = input.next();
                        System.out.println("Please enter it's top plate material: ");
                        String topPlateMaterial = input.next();
                        Violin violin = new Violin(name, brand, price, number, color, ID, seller.getUsername(), weight, material, chinMaterial, topPlateMaterial);
                        shop.addViolin(violin);
                        seller.addViolin(violin);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else if (sellerChoice1.equals("7"))
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- Hammer\n" +
                            "2- Saw");
                    String sellerChoice2 = input.next();
                    if (sellerChoice2.equals("1"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("Please enter it's weight: ");
                        double weight = input.nextInt();
                        System.out.println("Please enter it's material: ");
                        String material = input.next();
                        System.out.println("Please enter it's cross sectional size: ");
                        String crossSectionalSize = input.next();
                        Hammer hammer = new Hammer(name, brand, price, number, color, ID, seller.getUsername(), material, weight, crossSectionalSize);
                        shop.addHammer(hammer);
                        seller.addHammer(hammer);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if (sellerChoice2.equals("2"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("Please enter it's weight: ");
                        double weight = input.nextInt();
                        System.out.println("Please enter it's material: ");
                        String material = input.next();
                        System.out.println("Please enter it's iron blade length: ");
                        int ironBladeLength = input.nextInt();
                        System.out.println("Please enter it's used: ");
                        String used = input.next();
                        Saw saw = new Saw(name, brand, price, number, color, ID, seller.getUsername(), material, weight,ironBladeLength, used);
                        shop.addSaw(saw);
                        seller.addSaw(saw);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else if (sellerChoice1.equals("8"))
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- Backpack\n" +
                            "2- Study light");
                    String sellerChoice2 = input.next();
                    if (sellerChoice2.equals("1"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("Please enter it's material: ");
                        String material = input.next();
                        System.out.println("Please enter it's used: ");
                        String used = input.next();
                        System.out.println("Please enter it's number of external pockets: ");
                        int numOfExternalPockets = input.nextInt();
                        System.out.println("Please enter it's internal pockets: ");
                        int numOfInternalPockets = input.nextInt();
                        Backpack backpack = new Backpack(name, brand, price, number, color, ID, seller.getUsername(), material, used,numOfExternalPockets,numOfInternalPockets);
                        shop.addBackpack(backpack);
                        seller.addBackpack(backpack);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if (sellerChoice2.equals("2"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("Please enter it's material: ");
                        String material = input.next();
                        System.out.println("Please enter it's used: ");
                        String used = input.next();
                        System.out.println("Please enter it's bubble diameter: ");
                        int bubbleDiameter = input.nextInt();
                        System.out.println("Please enter it's number of usable lamps: ");
                        int numOfUsableLamps = input.nextInt();
                        StudyLight studyLight = new StudyLight(name, brand, price, number, color, ID, seller.getUsername(), material, used, bubbleDiameter, numOfUsableLamps);
                        shop.addStudyLight(studyLight);
                        seller.addStudyLight(studyLight);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else if (sellerChoice1.equals("9"))
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- Car\n" +
                            "2- Truck");
                    String sellerChoice2 = input.next();
                    if (sellerChoice2.equals("1"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("Please enter it's horse power: ");
                        int horsePower = input.nextInt();
                        System.out.println("Please enter it's tank volume: ");
                        int tankVolume = input.nextInt();
                        System.out.println("Please enter it's seats number: ");
                        int seatsNumber = input.nextInt();
                        Car car = new Car(name, brand, price, number, color, ID, seller.getUsername(), horsePower, tankVolume, seatsNumber);
                        shop.addCar(car);
                        seller.addCar(car);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if (sellerChoice2.equals("2"))
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
//                        System.out.println("Please enter the ID: ");
                        String ID = String.valueOf(shop.IDGenerator());
                        System.out.println("Please enter it's horse power: ");
                        int horsePower = input.nextInt();
                        System.out.println("Please enter it's tank volume: ");
                        int tankVolume = input.nextInt();
                        System.out.println("Please enter it's number of wheels: ");
                        float numOfWheels = input.nextFloat();
                        System.out.println("Dose it have any bed?");
                        String doseItHaveBed = input.next();
                        Truck truck = new Truck(name, brand, price, number, color,ID , seller.getUsername(), horsePower, tankVolume, numOfWheels, doseItHaveBed);
                        shop.addTrucks(truck);
                        seller.addTrucks(truck);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else{
                    System.out.println("Invalid input");
                }
            } else if (choice.equals("4")){
                System.out.println("I am glad to have served");
                runFlag = false;
            } else {
                System.out.println("Invalid input! please try again.");
            }
        }

    }
    public static void adminMenu(Admin admin)
    {
        System.out.println("Welcome dear " + admin.getUsername());
        boolean runFlag = true;
        while(runFlag)
        {
            System.out.println("1- My profile\n" +
                    "2- Update profile\n" +
                    "3- view users profile\n" +
                    "4- view sellers profile\n" +
                    "5- Add a new admin\n" +
                    "6- Total profit\n" +
                    "7- Wallet Request list\n" +
                    "8- Buy request list\n" +
                    "9- Back");
            String choice = input.next();
            if (choice.equals("1"))
            {
                shop.adminProfile(admin.getPassword());
            } else if (choice.equals("2")){
                System.out.println("What do you want to change?\n" +
                        "1- Change username\n" +
                        "2- Change password\n" +
                        "3- Back");
                String userChoice = input.next();
                if (userChoice.equals("1"))
                {
                    System.out.println("enter your new username: ");
                    String newUsername = input.next();
                    admin.setUsername(newUsername);
                    System.out.println("username changed successfully");
                } else if (userChoice.equals("2"))
                {
                    System.out.println("Please enter a new password");
                    String newPassword = input.next();
                    System.out.println("Please confirm your new password: ");
                    String confirmPassword = input.next();
                    if (newPassword.equals(confirmPassword))
                    {
                        if (shop.adminLogin(admin.getPassword()))
                        {
                            System.out.println("There is exist a password like this! try again");
                        } else {
                            System.out.println("password changed successfully");
                        }
                    } else {
                        System.out.println("Passwords don't match! please try again.");
                    }
                } else if (userChoice.equals("3"))
                {
                    System.out.println("I am glad to have served");
                    runFlag = false;
                } else {
                    System.out.println("Invalid input! please try again.");
                }
            } else if (choice.equals("3"))
            {
                System.out.println("Please enter a password: ");
                String password = input.next();
                shop.userProfile(password);
            } else if (choice.equals("4"))
            {
                System.out.println("Please enter a password: ");
                String password = input.next();
                shop.sellerProfile(password);
            } else if (choice.equals("5"))
            {
                System.out.println("Enter a username: ");
                String username = input.next();
                System.out.println("Please enter a password: ");
                String password = input.next();
                System.out.println("PLease confirm your password: ");
                String confirmPassword = input.next();
                System.out.println("PLease entre an email address: ");
                String emailAddress = input.next();
                if (password.equals(confirmPassword))
                {
                    Admin admin1 = new Admin(username, password, emailAddress);
                    shop.addAdmin(admin1);
                } else {
                    System.out.println("Passwords don't match! PLease try again.");
                }
            } else if (choice.equals("6"))
            {
                System.out.println(shop.getTotalProfit());
            } else if (choice.equals("7"))
            {
                for (WalletRequest request : shop.getRequests())
                {
                    System.out.println("Person(User \\ Seller): " + request.getUser());
                    System.out.println("Amount(Rial): " + request.getAmount());
                    System.out.println("Do you want to confirm?(1-Yes/2-No)");
                    int userInput = input.nextInt();
                    if (userInput == 1)
                    {
                        request.isChecked = true;
                        System.out.println(request.getAmount() + " rial" + " added to " + request.getUsername());
                    } else if (userInput == 2)
                    {
                        request.isChecked = false;
                        System.out.println("You are disagree to confirm therefore " + request.getUsername() + "'s wallet won't change!");
                    }
                    request.increase();
                    shop.removeRequest(request);
                    break;
                }
            } else if (choice.equals("8")){
                for (BuyRequest request : shop.getShoppingCart()){
                    System.out.println("User: " + request.getUser());
                    System.out.println("Seller: " + request.getSeller());
                    System.out.println("Price of the product: " + request.getProductPrice());
                    System.out.println("User's wallet amount: " + request.getUserWallet());
                    System.out.println("Product's ID: " + request.getID());
                    System.out.println("Number of orders by user: " + request.getNumOfOrders());
                    System.out.println("Number of available products: " + request.getNumOfAvaItems());
                    System.out.println("Do you want to confirm this order(1-Yes/2-No?");
                    int adminInput = input.nextInt();
                    if (adminInput == 1){
                        request.setChecked(true);
                        System.out.println(request.getSeller().getUsername() + " sold a product with " + request.getID() + " ID to the " + request.getUser().getUsername());
                    } else if (adminInput == 2){
                        request.setChecked(false);
                        System.out.println("You didn't approve this request therefore this order won't be done!");
                    }
                    request.increase();
                    request.getUser().removeFromShoppingCart(request.getShoppingCart());
                    shop.removeShoppingCartRequest(request.getShoppingCart());
                    break;
                }
            } else if (choice.equals("p"))
            {
                System.out.println("I am glad to have served");
                runFlag = false;
            } else {
                System.out.println("Invalid input! please try again.");
            }
        }
    }
}
