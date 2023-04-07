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
            System.out.println("Please choose(1-3)\n" +
                    "1- Sign in\n" +
                    "2- Sign Up\n" +
                    "3- About shop\n" +
                    "4- exit");
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
            }else if (choice == 4) {
                runFlag = false;
                System.out.println("I am glad to have served");
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
                    "1- As a User\n" +
                    "2- As a Seller\n" +
                    "3- Exit");
            int userChoice = input.nextInt();
            if (userChoice == 1)
            {
                System.out.println("Please enter your username: ");
                String username = input.next();
                System.out.println("Please enter a password: ");
                String password = input.next();
                System.out.println("Please enter an email address: ");
                String emailAddress = input.next();
                System.out.println("Please enter a phone number: ");
                String phoneNumber = input.next();
                System.out.println("Please enter an address: ");
                String address = input.next();
                User user = new User(username, password, emailAddress, phoneNumber, address,0);
                String message =  shop.createAccountUser(user) ? username + "successfully added!" : "there is exist a password same you have entered!";
            } else if (userChoice == 2){
                System.out.println("Please enter your company name: ");
                String username = input.next();
                System.out.println("Please enter a password: ");
                String password = input.next();
                Seller seller = new Seller(username, password);
                String message = shop.createAccountSeller(seller) ? username + "successfully added!" : "there is exist a password same you have entered!";
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
            System.out.println("You want to sign up as a(1-4):\n" +
                    "1- User\n" +
                    "2- Seller\n" +
                    "3- Admin\n" +
                    "4- Exit");
            int userChoice = input.nextInt();
            if (userChoice == 1){
                System.out.println("Please enter your username: ");
                String username = input.next();
                System.out.println("Please enter a password: ");
                String password = input.next();
                User user = shop.searchUser(password).get();
                if (user.getUsername().equals(username))
                {
                    userMenu(user);
                } else {
                    System.out.println("Wrong username!");
                }
            } else if (userChoice == 2){
                System.out.println("Please enter your company name: ");
                String username = input.next();
                System.out.println("Please enter a password: ");
                String password = input.next();
                Seller seller = shop.searchSeller(password).get();
                if (seller.getUsername().equals(username))
                {
                    sellerMenu(seller);
                } else {
                    System.out.println("Wrong company name!");
                }
            } else if (userChoice == 3){
                System.out.println("Please enter your username: ");
                String username = input.next();
                System.out.println("Please enter a password: ");
                String password = input.next();
                Admin admin = shop.searchAdmin(password).get();
                if (admin.getUsername().equals(username))
                {
                    adminMenu(admin);
                } else {
                    System.out.println("Wrong username!");
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
        boolean runFlag = true;
        while(runFlag)
        {
            System.out.println("1- Show profile\n" +
                    "2- Update profile\n" +
                    "3- Show products\n" +
                    "4- Log out\n" +
                    "5- Increase wallet\n"+
                    "6- Exit");
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
                            "3- Exit");
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
                        if (shop.userLogin(newPassword))
                        {
                            System.out.println("There is exist a password like this! try again");
                        } else {
                            System.out.println("password changed successfully");
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
                System.out.println(shop.getLaptops()+"\n"+
                        shop.getSmartphones()+"\n"+
                        shop.getShoes()+"\n"+
                        shop.getSocks()+"\n"+
                        shop.getElectricEngines()+"\n"+
                        shop.getCarWashes()+"\n"+
                        shop.getBloodSugarTestMachines()+"\n"+
                        shop.getSphygmomanometers()+"\n"+
                        shop.getDishWashers()+"\n"+
                        shop.getVacuumCleaners()+"\n"+
                        shop.getGuitars()+"\n"+
                        shop.getViolins()+"\n"+
                        shop.getHammers()+"\n"+
                        shop.getSaws()+"\n"+
                        shop.getBackpacks()+"\n"+
                        shop.getStudyLights()+"\n"+
                        shop.getCars()+"\n"+
                        shop.getCars()+"\n"+
                        shop.getTrucks()+"\n");
            } else if (userChoice == 4) {
                String message = shop.userLogout(user.getPassword()) ? "Done!" : "it didn't work";
                System.out.println(message);
                signUpMenu();
            } else if (userChoice == 5) {
                System.out.println("how much do you want to increase?");
                int amount = input.nextInt();
                shop.increaseWallet(amount, user.getPassword());
            }else if (userChoice == 6){
                System.out.println("I am glad to have served");
                runFlag = false;
            } else {
                System.out.println("Invalid input! please try again.");
            }
        }
    }
    public static void sellerMenu(Seller seller)
    {
        System.out.println("Welcome dear " + seller.getUsername());
        boolean runFlag = true;
        while(runFlag)
        {
            System.out.println("1- My profile\n" +
                    "2- update profile\n" +
                    "3- view products(myself)\n" +
                    "4- add product\n" +
                    "5- exit");
            int choice = input.nextInt();
            if (choice == 1)
            {
                shop.sellerProfile(seller.getPassword());
            } else if(choice == 2)
            {
                System.out.println("What do you want to change?\n" +
                        "1- Change username\n" +
                        "2- Change password\n" +
                        "3- Exit");
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
                    if (shop.adminLogin(seller.getPassword()))
                    {
                        System.out.println("There is exist a password like this! try again");
                    } else {
                        System.out.println("password changed successfully");
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
                System.out.println(shop.getLaptops()+"\n"+
                        shop.getSmartphones()+"\n"+
                        shop.getShoes()+"\n"+
                        shop.getSocks()+"\n"+
                        shop.getElectricEngines()+"\n"+
                        shop.getCarWashes()+"\n"+
                        shop.getBloodSugarTestMachines()+"\n"+
                        shop.getSphygmomanometers()+"\n"+
                        shop.getDishWashers()+"\n"+
                        shop.getVacuumCleaners()+"\n"+
                        shop.getGuitars()+"\n"+
                        shop.getViolins()+"\n"+
                        shop.getHammers()+"\n"+
                        shop.getSaws()+"\n"+
                        shop.getBackpacks()+"\n"+
                        shop.getStudyLights()+"\n"+
                        shop.getCars()+"\n"+
                        shop.getCars()+"\n"+
                        shop.getTrucks()+"\n");
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
                        "9- Vehicle\n");
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
                    }
                } else if (sellerChoice1 == 2)
                {
                    System.out.println("To witch type you want to add:\n" +
                            "1- Laptop\n" +
                            "2- SmartPhone");
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
                    "5- Exit");
            int choice = input.nextInt();
            if (choice == 1)
            {
                shop.adminProfile(admin.getPassword());
            } else if (choice == 2){
                System.out.println("What do you want to change?\n" +
                        "1- Change username\n" +
                        "2- Change password\n" +
                        "3- Exit");
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
                    if (shop.adminLogin(admin.getPassword()))
                    {
                        System.out.println("There is exist a password like this! try again");
                    } else {
                        System.out.println("password changed successfully");
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
                System.out.println("I am glad to have served");
                runFlag = false;
            } else {
                System.out.println("Invalid input! please try again.");
            }
        }
    }
}