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
        User user = new User("username","password","mamad@gmail.com","09153346894","ads", 0);
        Admin admin = new Admin("admin", "password1","nobari@gmail.com");
        Seller seller = new Seller("seller", "password2",12);
        shop.createAccountUser(user);
        shop.addAdmin(admin);
        shop.createAccountSeller(seller);
        runMenu();
    }
    public static void runMenu()
    {
        boolean runFlag = true;
        while (runFlag)
        {
            System.out.println("Please choose(1-5)\n" +
                    "1- Sign in\n" +
                    "2- Sign Up\n" +
                    "3- About shop\n" +
                    "4- View products\n" +
                    "5- Search a product\n" +
                    "6- Exit");
            int choice = input.nextInt();
            if (choice == 1)
            {
                signInMenu();
            } else if (choice == 2) {
                signUpMenu();
            } else if (choice == 3) {
                System.out.println("Name: " + shop.getName());
                System.out.println("Web address: " + shop.getWebAddress());
                System.out.println("Support number: " + shop.getSupportNumber());
            } else if (choice == 4) {
                int counter = 0;
                if (shop.getLaptops().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getLaptops());
                }
                if (shop.getSmartphones().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getSmartphones());
                }
                if (shop.getShoes().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getShoes());
                }
                if (shop.getSocks().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getSocks());
                }
                if (shop.getElectricEngines().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getElectricEngines());
                }
                if (shop.getCarWashes().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getCarWashes());
                }
                if (shop.getBloodSugarTestMachines().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getBloodSugarTestMachines());
                }
                if (shop.getSphygmomanometers().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getSphygmomanometers());
                }
                if (shop.getDishWashers().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getDishWashers());
                }
                if (shop.getVacuumCleaners().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getVacuumCleaners());
                }
                if (shop.getGuitars().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getGuitars());
                }
                if (shop.getViolins().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getViolins());
                }
                if (shop.getHammers().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getHammers());
                }
                if (shop.getSaws().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getSaws());
                }
                if (shop.getBackpacks().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getBackpacks());
                }
                if (shop.getStudyLights().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getStudyLights());
                }
                if (shop.getCars().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getCars());
                }
                if (shop.getTrucks().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getTrucks());
                }
                if (counter == 18)
                {
                    System.out.println("There is no product in the shop as it looks :(");
                }
            } else if (choice == 5) {
                System.out.println("Please enter the product name: ");
                String productName = input.next();
                if (!shop.searchLaptop(productName).isEmpty())
                {
                    System.out.println(shop.searchLaptop(productName));
                } else if (!shop.searchSmartphone(productName).isEmpty()){
                    System.out.println(shop.searchSmartphone(productName));
                } else if (!shop.searchShoe(productName).isEmpty()){
                    System.out.println(shop.searchShoe(productName));
                } else if (!shop.searchSock(productName).isEmpty()){
                    System.out.println(shop.searchSock(productName));
                } else if (!shop.searchBloodSugarTestMachine(productName).isEmpty()){
                    System.out.println(shop.searchBloodSugarTestMachine(productName));
                } else if (!shop.searchSphygmomanometer(productName).isEmpty()){
                    System.out.println(shop.searchSphygmomanometer(productName));
                } else if (!shop.searchElectricEngine(productName).isEmpty()){
                    System.out.println(shop.searchElectricEngine(productName));
                } else if (!shop.searchCarWash(productName).isEmpty()){
                    System.out.println(shop.searchCarWash(productName));
                } else if (!shop.searchDishWasher(productName).isEmpty()){
                    System.out.println(shop.searchDishWasher(productName));
                } else if (!shop.searchSaw(productName).isEmpty()){
                    System.out.println(shop.searchSaw(productName));
                } else if (!shop.searchVacuumCleaner(productName).isEmpty()){
                    System.out.println(shop.searchVacuumCleaner(productName));
                } else if (!shop.searchGuitar(productName).isEmpty()){
                    System.out.println(shop.searchGuitar(productName));
                } else if (!shop.searchViolin(productName).isEmpty()){
                    System.out.println(shop.searchViolin(productName));
                } else if (!shop.searchHammer(productName).isEmpty()){
                    System.out.println(shop.searchHammer(productName));
                } else if (!shop.searchBackpack(productName).isEmpty()){
                    System.out.println(shop.searchBackpack(productName));
                } else if (!shop.searchStudyLight(productName).isEmpty()){
                    System.out.println(shop.searchStudyLight(productName));
                } else if (!shop.searchCar(productName).isEmpty()){
                    System.out.println(shop.searchCar(productName));
                } else if (!shop.searchTruck(productName).isEmpty()){
                    System.out.println(shop.searchTruck(productName));
                } else {
                    System.out.println("There is no product according to your search :((");
                }
            } else if (choice == 6) {
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
            int userChoice = input.nextInt();
            if (userChoice == 1)
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
                    String message =  shop.createAccountUser(user) ? username + "successfully added!" : "there is exist a password same you have entered!";
                    System.out.println(message);
                    userMenu(user);
                } else {
                    System.out.println("Passwords doesn't match! please try again.");
                }
            } else if (userChoice == 2){
                System.out.println("Please enter your company name: ");
                String username = input.next();
                System.out.println("Please enter a password: ");
                String password = input.next();
                System.out.println("Please confirm your password: ");
                String confirmPassword = input.next();
                if (password.equals(confirmPassword))
                {
                    Seller seller = new Seller(username, password);
                    String message = shop.createAccountSeller(seller) ? username + "successfully added!" : "there is exist a password same you have entered!";
                    System.out.println(message);
                    sellerMenu(seller);
                } else {
                    System.out.println("Passwords don't match! please try again.");
                }
            } else if (userChoice == 3){
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
            int userChoice = input.nextInt();
            if (userChoice == 1){
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
            } else if (userChoice == 2){
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
            } else if (userChoice == 3){
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
            }else if(userChoice == 4){
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
                    "7- Back");
            int userChoice = input.nextInt();
            if (userChoice == 1)
            {
                shop.userProfile(user.getPassword());
            } else if (userChoice == 2)
            {
                boolean runFlag1 = true;
                while(runFlag1)
                {
                    System.out.println("What do you want to change?\n" +
                            "1- Change username\n" +
                            "2- Change password\n" +
                            "3- Back");
                    int userChoice1 = input.nextInt();
                    if (userChoice1 == 1)
                    {
                        System.out.println("enter your new username: ");
                        String newUsername = input.next();
                        user.setUsername(newUsername);
                        System.out.println("username changed successfully");
                    } else if (userChoice1 == 2)
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
                    } else if (userChoice1 == 3)
                    {
                        System.out.println("I am glad to have served");
                        runFlag1 = false;
                    } else {
                        System.out.println("Invalid input! please try again.");
                    }
                }

            } else if (userChoice == 3) {
                int counter = 0;
                if (shop.getLaptops().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getLaptops());
                }
                if (shop.getSmartphones().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getSmartphones());
                }
                if (shop.getShoes().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getShoes());
                }
                if (shop.getSocks().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getSocks());
                }
                if (shop.getElectricEngines().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getElectricEngines());
                }
                if (shop.getCarWashes().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getCarWashes());
                }
                if (shop.getBloodSugarTestMachines().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getBloodSugarTestMachines());
                }
                if (shop.getSphygmomanometers().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getSphygmomanometers());
                }
                if (shop.getDishWashers().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getDishWashers());
                }
                if (shop.getVacuumCleaners().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getVacuumCleaners());
                }
                if (shop.getGuitars().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getGuitars());
                }
                if (shop.getViolins().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getViolins());
                }
                if (shop.getHammers().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getHammers());
                }
                if (shop.getSaws().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getSaws());
                }
                if (shop.getBackpacks().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getBackpacks());
                }
                if (shop.getStudyLights().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getStudyLights());
                }
                if (shop.getCars().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getCars());
                }
                if (shop.getTrucks().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(shop.getTrucks());
                }
                if (counter == 18)
                {
                    System.out.println("Dear " + user.getUsername() + " there is no product in the shop as it looks :(");
                }
            } else if (userChoice == 4) {
                String message = shop.userLogout(user.getPassword()) ? "Done!" : "it didn't work";
                System.out.println(message);
                signUpMenu();
            } else if (userChoice == 5) {
                System.out.println("how much do you want to increase?");
                int amount = input.nextInt();
                Request request = new Request(user, amount);
                shop.addRequest(request);
                System.out.println("Wait until admin to confirm it!");
            } else if (userChoice == 6){
                System.out.println("Please enter the product name: ");
                String productName = input.next();
                if (!shop.searchLaptop(productName).isEmpty())
                {
                    System.out.println(shop.searchLaptop(productName));
                } else if (!shop.searchSmartphone(productName).isEmpty()){
                    System.out.println(shop.searchSmartphone(productName));
                } else if (!shop.searchShoe(productName).isEmpty()){
                    System.out.println(shop.searchShoe(productName));
                } else if (!shop.searchSock(productName).isEmpty()){
                    System.out.println(shop.searchSock(productName));
                } else if (!shop.searchBloodSugarTestMachine(productName).isEmpty()){
                    System.out.println(shop.searchBloodSugarTestMachine(productName));
                } else if (!shop.searchSphygmomanometer(productName).isEmpty()){
                    System.out.println(shop.searchSphygmomanometer(productName));
                } else if (!shop.searchElectricEngine(productName).isEmpty()){
                    System.out.println(shop.searchElectricEngine(productName));
                } else if (!shop.searchCarWash(productName).isEmpty()){
                    System.out.println(shop.searchCarWash(productName));
                } else if (!shop.searchDishWasher(productName).isEmpty()){
                    System.out.println(shop.searchDishWasher(productName));
                } else if (!shop.searchSaw(productName).isEmpty()){
                    System.out.println(shop.searchSaw(productName));
                } else if (!shop.searchVacuumCleaner(productName).isEmpty()){
                    System.out.println(shop.searchVacuumCleaner(productName));
                } else if (!shop.searchGuitar(productName).isEmpty()){
                    System.out.println(shop.searchGuitar(productName));
                } else if (!shop.searchViolin(productName).isEmpty()){
                    System.out.println(shop.searchViolin(productName));
                } else if (!shop.searchHammer(productName).isEmpty()){
                    System.out.println(shop.searchHammer(productName));
                } else if (!shop.searchBackpack(productName).isEmpty()){
                    System.out.println(shop.searchBackpack(productName));
                } else if (!shop.searchStudyLight(productName).isEmpty()){
                    System.out.println(shop.searchStudyLight(productName));
                } else if (!shop.searchCar(productName).isEmpty()){
                    System.out.println(shop.searchCar(productName));
                } else if (!shop.searchTruck(productName).isEmpty()){
                    System.out.println(shop.searchTruck(productName));
                } else {
                    System.out.println("There is no product according to your search :((");
                }
            } else if (userChoice == 7){
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
            int choice = input.nextInt();
            if (choice == 1)
            {
                shop.sellerProfile(seller.getPassword());
            } else if(choice == 2)
            {
                System.out.println("What do you want to change?\n" +
                        "1- Change username\n" +
                        "2- Change password\n" +
                        "3- Back");
                int userChoice = input.nextInt();
                if (userChoice == 1)
                {
                    System.out.println("enter your new company name: ");
                    String newUsername = input.next();
                    seller.setUsername(newUsername);
                    System.out.println("company name changed successfully");
                } else if (userChoice == 2)
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
                } else if (userChoice == 3)
                {
                    System.out.println("I am glad to have served");
                    runFlag = false;
                } else {
                    System.out.println("Invalid input! please try again.");
                }
            } else if (choice == 3)
            {
                int counter = 0;
                if (seller.getLaptops().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getLaptops());
                }
                if (seller.getSmartphones().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getSmartphones());
                }
                if (seller.getShoes().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getShoes());
                }
                if (seller.getSocks().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getSocks());
                }
                if (seller.getElectricEngines().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getElectricEngines());
                }
                if (seller.getCarWashes().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getCarWashes());
                }
                if (seller.getBloodSugarTestMachines().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getBloodSugarTestMachines());
                }
                if (seller.getSphygmomanometers().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getSphygmomanometers());
                }
                if (seller.getDishWashers().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getDishWashers());
                }
                if (seller.getVacuumCleaners().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getVacuumCleaners());
                }
                if (seller.getGuitars().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getGuitars());
                }
                if (seller.getViolins().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getViolins());
                }
                if (seller.getHammers().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getHammers());
                }
                if (seller.getSaws().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getSaws());
                }
                if (seller.getBackpacks().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getBackpacks());
                }
                if (shop.getStudyLights().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getStudyLights());
                }
                if (seller.getCars().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getCars());
                }
                if (seller.getTrucks().isEmpty())
                {
                    counter++;
                }
                else
                {
                    System.out.println(seller.getTrucks());
                }
                if (counter == 18)
                {
                    System.out.println("Dear " + seller.getUsername() + "\nThere is no product in the shop as it looks :(");
                }
            } else if (choice == 4)
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
                int sellerChoice1 = input.nextInt();
                if (sellerChoice1 == 1)
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- Shoe\n" +
                            "2- Sock");
                    int sellerChoice2 = input.nextInt();
                    if (sellerChoice2 == 1)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("Please enter it's material: ");
                        String material = input.next();
                        System.out.println("Please enter it's genre: ");
                        String genre = input.next();
                        System.out.println("Is it shoeLace?");
                        boolean isItShoeLace = input.hasNext();
                        Shoe shoe = new Shoe(name, brand, price, number, color, ID, material, genre, isItShoeLace);
                        shop.addSho(shoe);
                        seller.addSho(shoe);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if (sellerChoice2 == 2)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("Please enter it's material: ");
                        String material = input.next();
                        System.out.println("Please enter it's genre: ");
                        String genre = input.next();
                        System.out.println("What it's size?");
                        String size = input.next();
                        Sock sock = new Sock(name, brand, price, number, color, ID, material, genre, size);
                        shop.addSock(sock);
                        seller.addSock(sock);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else if (sellerChoice1 == 2)
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- Laptop\n" +
                            "2- SmartPhone");
                    int sellerChoice2 = input.nextInt();
                    if (sellerChoice2 == 1)
                    {
                        System.out.println("Please enter it's name: ");
                        String name = input.next();
                        System.out.println("Please enter it's brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price(Rial): ");
                        double price = input.nextDouble();
                        System.out.println("How many item you want to add? ");
                        int number = input.nextInt();
                        System.out.println("Please enter it's color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("Please enter it's processor: ");
                        String processor = input.next();
                        System.out.println("Please enter it's storage: ");
                        int storage = input.nextInt();
                        System.out.println("Please enter it's RAM size: ");
                        int RAM = input.nextInt();
                        System.out.println("Please enter it's weight: ");
                        int weight = input.nextInt();
                        Laptop laptop = new Laptop(name, brand, price, number, color, ID, processor, storage, RAM, weight);
                        shop.addLaptop(laptop);
                        seller.addLaptop(laptop);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if (sellerChoice2 == 2)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("Please enter it's processor: ");
                        String processor = input.next();
                        System.out.println("Please enter it's storage: ");
                        int storage = input.nextInt();
                        System.out.println("Please enter it's camera quality: ");
                        int cameraQuality = input.nextInt();
                        System.out.println("Please enter it's number of cameras: ");
                        int numberOfCameras = input.nextInt();
                        Smartphone smartphone = new Smartphone(name, brand, price, number, color, ID, processor, storage, cameraQuality, numberOfCameras);
                        shop.addSmartphones(smartphone);
                        seller.addSmartphones(smartphone);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else if (sellerChoice1 == 3)
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- CarWash\n" +
                            "2- Electric Engine");
                    int sellerChoice2 = input.nextInt();
                    if (sellerChoice2 == 1)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("Please enter it's weight: ");
                        int weight = input.nextInt();
                        System.out.println("Please enter it's power consumption: ");
                        int powerConsumption = input.nextInt();
                        System.out.println("Please enter it's maximum water temperature: ");
                        int maximumEnterTemperature = input.nextInt();
                        System.out.println("please enter it's hose length: ");
                        int hoseLength = input.nextInt();
                        CarWash carWash = new CarWash(name, brand, price, number, color, ID, weight, powerConsumption, maximumEnterTemperature, hoseLength);
                        shop.addCarWash(carWash);
                        seller.addCarWash(carWash);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if (sellerChoice2 == 2)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("Please enter it's weight: ");
                        int weight = input.nextInt();
                        System.out.println("Please enter it's power consumption: ");
                        int powerConsumption = input.nextInt();
                        System.out.println("Please enter it's fuel type: ");
                        String fuelType = input.next();
                        System.out.println("Please enter it's engine power: ");
                        int enginePower = input.nextInt();
                        ElectricEngine electricEngine = new ElectricEngine(name, brand, price, number, color, ID, weight, powerConsumption, fuelType, enginePower);
                        shop.addElectricEngine(electricEngine);
                        seller.addElectricEngine(electricEngine);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else if (sellerChoice1 == 4)
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- BloodSugarTestMachine\n" +
                            "2- Sphygmomanometer");
                    int sellerChoice2 = input.nextInt();
                    if (sellerChoice2 == 1)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("Please enter it's supply power:");
                        String supplyPower = input.next();
                        System.out.println("Please enter it's used: ");
                        String used = input.next();
                        System.out.println("Please it's minimum blood required: ");
                        double minimumBloodRequired = input.nextDouble();
                        System.out.println("Please enter it's number of test strips: ");
                        int numberOfTestStrips = input.nextInt();
                        BloodSugarTestMachine bloodSugarTestMachine = new BloodSugarTestMachine(name, brand, price, number, color, ID,supplyPower, used, minimumBloodRequired, numberOfTestStrips);
                        shop.addBloodSugarTestMachine(bloodSugarTestMachine);
                        seller.addBloodSugarTestMachine(bloodSugarTestMachine);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if (sellerChoice2 == 2)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("Please enter it's supply power:");
                        String supplyPower = input.next();
                        System.out.println("Please enter it's used: ");
                        String used = input.next();
                        System.out.println("Please enter it's suitable arm size: ");
                        String suitableArmSize = input.next();
                        System.out.println("Please enter it's display type: ");
                        String displayType = input.next();
                        Sphygmomanometer sphygmomanometer = new Sphygmomanometer(name, brand, price, number, color, ID,supplyPower, used, suitableArmSize, displayType);
                        shop.addSphygmomanometer(sphygmomanometer);
                        seller.addSphygmomanometer(sphygmomanometer);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else if(sellerChoice1 == 5)
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- Dish Washer\n" +
                            "2- Vacuum Cleaner");
                    int sellerChoice2 = input.nextInt();
                    if (sellerChoice2 == 1)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("PLease enter it's volume: ");
                        double volume = input.nextDouble();;
                        System.out.println("Please enter it's energy consumption chart: ");
                        System.out.println("Please enter it's capacity: ");
                        int capacity = input.nextInt();
                        String energyConsumptionChart = input.next();
                        System.out.println("Please enter it's number of baskets: ");
                        int numOfBaskets = input.nextInt();
                        DishWasher dishWasher = new DishWasher(name, brand, price, number, color, ID, volume, energyConsumptionChart, capacity, numOfBaskets);
                        shop.addDishWasher(dishWasher);
                        seller.addDishWasher(dishWasher);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if(sellerChoice2 == 2)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("PLease enter it's volume: ");
                        double volume = input.nextDouble();;
                        System.out.println("Please enter it's energy consumption chart: ");
                        String energyConsumptionChart = input.next();
                        System.out.println("Please enter it's engine power:");
                        int enginePower = input.nextInt();
                        System.out.println("Please enter it's power cable length: ");
                        int powerCableLength = input.nextInt();;
                        VacuumCleaner vacuumCleaner = new VacuumCleaner(name, brand, price, number, color, ID, volume, energyConsumptionChart, enginePower, powerCableLength);
                        shop.addVacuumCleaner(vacuumCleaner);
                        seller.addVacuumCleaner(vacuumCleaner);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else if (sellerChoice1 == 6)
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- Guitar\n" +
                            "2- Violin");
                    int sellerChoice2 = input.nextInt();
                    if (sellerChoice2 == 1)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("Please enter it's weight: ");
                        int weight = input.nextInt();
                        System.out.println("Please enter it's material: ");
                        String material = input.next();
                        System.out.println("Please enter it's wires number: ");
                        int wiresNumber = input.nextInt();
                        System.out.println("Please enter it's bowl thickness: ");
                        int bowlThickness = input.nextInt();
                        Guitar guitar = new Guitar(name, brand, price, number, color, ID, weight, material, wiresNumber, bowlThickness);
                        shop.addGuitar(guitar);
                        seller.addGuitar(guitar);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if (sellerChoice2 == 2)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("Please enter it's weight: ");
                        int weight = input.nextInt();
                        System.out.println("Please enter it's material: ");
                        String material = input.next();
                        System.out.println("Please enter it's chin material: ");
                        String chinMaterial = input.next();
                        System.out.println("Please enter it's top plate material: ");
                        String topPlateMaterial = input.next();
                        Violin violin = new Violin(name, brand, price, number, color, ID, weight, material, chinMaterial, topPlateMaterial);
                        shop.addViolin(violin);
                        seller.addViolin(violin);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else if (sellerChoice1 == 7)
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- Hammer\n" +
                            "2- Saw");
                    int sellerChoice2 = input.nextInt();
                    if (sellerChoice2 == 1)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("Please enter it's weight: ");
                        int weight = input.nextInt();
                        System.out.println("Please enter it's material: ");
                        String material = input.next();
                        System.out.println("Please enter it's cross sectional size: ");
                        String crossSectionalSize = input.next();
                        Hammer hammer = new Hammer(name, brand, price, number, color, ID, material, weight, crossSectionalSize);
                        shop.addHammer(hammer);
                        seller.addHammer(hammer);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if (sellerChoice2 == 2)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("Please enter it's weight: ");
                        int weight = input.nextInt();
                        System.out.println("Please enter it's material: ");
                        String material = input.next();
                        System.out.println("Please enter it's iron blade length: ");
                        int ironBladeLength = input.nextInt();
                        System.out.println("Please enter it's used: ");
                        String used = input.next();
                        Saw saw = new Saw(name, brand, price, number, color, ID, material, weight,ironBladeLength, used);
                        shop.addSaw(saw);
                        seller.addSaw(saw);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else if (sellerChoice1 == 8)
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- Backpack\n" +
                            "2- Study light");
                    int sellerChoice2 = input.nextInt();
                    if (sellerChoice2 == 1)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("Please enter it's material: ");
                        String material = input.next();
                        System.out.println("Please enter it's used: ");
                        String used = input.next();
                        System.out.println("Please enter it's number of external pockets: ");
                        int numOfExternalPockets = input.nextInt();
                        System.out.println("Please enter it's internal pockets: ");
                        int numOfInternalPockets = input.nextInt();
                        Backpack backpack = new Backpack(name, brand, price, number, color, ID, material, used,numOfExternalPockets,numOfInternalPockets);
                        shop.addBackpack(backpack);
                        seller.addBackpack(backpack);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if (sellerChoice2 == 2)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("Please enter it's material: ");
                        String material = input.next();
                        System.out.println("Please enter it's used: ");
                        String used = input.next();
                        System.out.println("Please enter it's bubble diameter: ");
                        int bubbleDiameter = input.nextInt();
                        System.out.println("Please enter it's number of usable lamps: ");
                        int numOfUsableLamps = input.nextInt();
                        StudyLight studyLight = new StudyLight(name, brand, price, number, color, ID, material, used, bubbleDiameter, numOfUsableLamps);
                        shop.addStudyLight(studyLight);
                        seller.addStudyLight(studyLight);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else if (sellerChoice1 == 9)
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- Car\n" +
                            "2- Truck");
                    int sellerChoice2 = input.nextInt();
                    if (sellerChoice2 == 1)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("Please enter it's horse power: ");
                        int horsePower = input.nextInt();
                        System.out.println("Please enter it's tank volume: ");
                        int tankVolume = input.nextInt();
                        System.out.println("Please enter it's seats number: ");
                        int seatsNumber = input.nextInt();
                        Car car = new Car(name, brand, price, number, color, ID,horsePower, tankVolume, seatsNumber);
                        shop.addCar(car);
                        seller.addCar(car);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    } else if (sellerChoice2 == 2)
                    {
                        System.out.println("Please enter a name: ");
                        String name = input.next();
                        System.out.println("Please enter a brand: ");
                        String brand = input.next();
                        System.out.println("Please enter it's price: ");
                        double price = input.nextDouble();
                        System.out.println("Please enter the amount of it: ");
                        int number = input.nextInt();
                        System.out.println("Please enter the color: ");
                        String color = input.next();
                        System.out.println("Please enter the ID: ");
                        String ID = input.next();
                        System.out.println("Please enter it's horse power: ");
                        int horsePower = input.nextInt();
                        System.out.println("Please enter it's tank volume: ");
                        int tankVolume = input.nextInt();
                        System.out.println("Please enter it's number of wheels: ");
                        float numOfWheels = input.nextFloat();
                        System.out.println("Dose it have any bed?");
                        boolean doseItHaveBed = input.hasNext();
                        Truck truck = new Truck(name, brand, price, number, color, ID,horsePower, tankVolume, numOfWheels, doseItHaveBed);
                        shop.addTrucks(truck);
                        seller.addTrucks(truck);
                        System.out.println(seller.getUsername() + " added " + number + " product of " + name + " by brand " + brand);
                    }
                } else{
                    System.out.println("Invalid input");
                }
            } else if (choice == 5){
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
                    "7- Request list\n" +
                    "8- Back");
            int choice = input.nextInt();
            if (choice == 1)
            {
                shop.adminProfile(admin.getPassword());
            } else if (choice == 2){
                System.out.println("What do you want to change?\n" +
                        "1- Change username\n" +
                        "2- Change password\n" +
                        "3- Back");
                int userChoice = input.nextInt();
                if (userChoice == 1)
                {
                    System.out.println("enter your new username: ");
                    String newUsername = input.next();
                    admin.setUsername(newUsername);
                    System.out.println("username changed successfully");
                } else if (userChoice == 2)
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
                } else if (userChoice == 3)
                {
                    System.out.println("I am glad to have served");
                    runFlag = false;
                } else {
                    System.out.println("Invalid input! please try again.");
                }
            } else if (choice == 3)
            {
                System.out.println("Please enter a password: ");
                String password = input.next();
                shop.userProfile(password);
            } else if (choice == 4)
            {
                System.out.println("Please enter a password: ");
                String password = input.next();
                shop.sellerProfile(password);
            } else if (choice == 5)
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
            } else if (choice == 6)
            {
                System.out.println(shop.getTotalProfit());
            } else if (choice == 7)
            {
                for (Request request : shop.getRequests())
                {
                    System.out.println("Person(User \\ Seller): " + request.getUser());
                    System.out.println("Amount(Rial): " + request.getAmount());
                    System.out.println("Do you want to confirm?(1-Yes/2-No)");
                    int userInput = input.nextInt();
                    if (userInput == 1)
                    {
                        request.isChecked = true;
                    } else if (userInput == 2)
                    {
                        request.isChecked = false;
                    }
                    shop.removeRequest(request);
                    request.increase();
                    break;
                }
            }
            else if (choice == 8)
            {
                System.out.println("I am glad to have served");
                runFlag = false;
            } else {
                System.out.println("Invalid input! please try again.");
            }
        }
    }
}