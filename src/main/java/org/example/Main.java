package org.example;

import org.example.UserBase.Admin;
import org.example.UserBase.Seller;
import org.example.UserBase.User;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Shop shop = new Shop();
    public static void main(String[] args) {
        System.out.println("** Welcome to the online shop **");
        User user = new User("username","password","mamad@gmail.com","09153346894","ads", 0);
        Admin admin = new Admin("admin", "password1","nobari@gmail.com");
        shop.createAccountUser(user);
        shop.addAdmin(admin);
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
                    sellerMenu();
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
    public static void sellerMenu()
    {

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