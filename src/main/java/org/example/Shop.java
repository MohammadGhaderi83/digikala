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
import org.example.Product.Product;
import org.example.Stationary.Backpack;
import org.example.Stationary.StudyLight;
import org.example.UserBase.Admin;
import org.example.UserBase.Seller;
import org.example.UserBase.User;
import org.example.Vehicles.Car;
import org.example.Vehicles.Truck;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Optional;

public class Shop {
    private String name = "digikala";
    private String webAddress = "www.digikala.com";
    private String supportNumber = "021-61930000";
    private ArrayList<Admin> admins = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(double totalProfit) {
        this.totalProfit = totalProfit;
    }

    private ArrayList<Seller> sellers = new ArrayList<>();
    private double totalProfit;
    private ArrayList<Product> orders;
    private ArrayList<Laptop> laptops = new ArrayList<>();
    private ArrayList<Smartphone> smartphones = new ArrayList<>();
    private ArrayList<Shoe> shoes = new ArrayList<>();
    private ArrayList<Sock> socks = new ArrayList<>();
    private ArrayList<ElectricEngine> electricEngines = new ArrayList<>();
    private ArrayList<CarWash> carWashes = new ArrayList<>();
    private ArrayList<BloodSugarTestMachine> bloodSugarTestMachines = new ArrayList<>();
    private ArrayList<Sphygmomanometer> sphygmomanometers = new ArrayList<>();
    private ArrayList<DishWasher> dishWashers = new ArrayList<>();
    private ArrayList<VacuumCleaner> vacuumCleaners = new ArrayList<>();
    private ArrayList<Guitar> guitars = new ArrayList<>();
    private ArrayList<Violin> violins = new ArrayList<>();
    private ArrayList<Hammer> hammers = new ArrayList<>();
    private ArrayList<Saw> saws = new ArrayList<>();
    private ArrayList<Backpack> backpacks = new ArrayList<>();
    private ArrayList<StudyLight> studyLights = new ArrayList<>();
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Truck> trucks = new ArrayList<>();
    private ArrayList<Request> requests = new ArrayList<Request>();

    public String getName() {
        return name;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public String getSupportNumber() {
        return supportNumber;
    }

    public boolean createAccountUser(@NotNull User user)
    {
        if (userLogin(user.getPassword()))
        {
            return false;
        }
        users.add(user);
        return true;
    }
    public boolean createAccountSeller(@NotNull Seller seller)
    {
        if (sellerLogin(seller.getPassword()))
        {
            return false;
        }
        sellers.add(seller);
        return true;
    }

    public boolean userLogin(String password)
    {
        return users.stream().anyMatch(user -> user.getPassword().equals(password));
    }

    public boolean sellerLogin(String password)
    {
        return sellers.stream().anyMatch(seller -> seller.getPassword().equals(password));
    }
    public Optional<User> searchUser(String password)
    {
        return users.stream().
                filter(user -> user.getPassword().equals(password)).findFirst();
    }
    public Optional<Seller> searchSeller(String password)
    {
        return sellers.stream().
                filter(seller -> seller.getPassword().equals(password)).findFirst();
    }
    public boolean userLogout(String password) {
        if (!userLogin(password))
        {
            return false;
        }
        User user = users.stream().filter(user1 -> user1.getPassword().equals(password))
                .findFirst().get();
        users.remove(user);
        return true;
    }
    public boolean sellerLogout(String password) {
        if (!sellerLogin(password))
        {
            return false;
        }
        Seller seller = sellers.stream().filter(user1 -> user1.getPassword().equals(password))
                .findFirst().get();
        users.remove(seller);
        return true;
    }
    public boolean adminLogin(String password)
    {
        return admins.stream().anyMatch(admin -> admin.getPassword().equals(password));
    }
    public boolean addAdmin(Admin admin)
    {
        if (!adminLogin(admin.getPassword()))
        {
            admins.add(admin);
            return true;
        }
        return false;
    }
    public Optional<Admin> searchAdmin(String password)
    {
        return admins.stream().
                filter(admin -> admin.getPassword().equals(password)).findFirst();
    }
    public boolean addLaptop(Laptop laptop)
    {
        if (laptops.stream().anyMatch(laptop1 -> laptop1.getID().equals(laptop.getID())))
        {
            laptop.setNumber(laptop.getNumber()+1);
            return false;
        }
        laptops.add(laptop);
        return true;
    }
    public boolean addSmartphones(Smartphone smartphone)
    {
        if (smartphones.stream().anyMatch(laptop1 -> laptop1.getID().equals(smartphone.getID())))
        {
            smartphone.setNumber(smartphone.getNumber()+1);
            return false;
        }
        smartphones.add(smartphone);
        return true;
    }
    public boolean addSho(Shoe shoe)
    {
        if (shoes.stream().anyMatch(laptop1 -> laptop1.getID().equals(shoe.getID())))
        {
            shoe.setNumber(shoe.getNumber()+1);
            return false;
        }
        shoes.add(shoe);
        return true;
    }
    public boolean addSock(Sock sock)
    {
        if (socks.stream().anyMatch(laptop1 -> laptop1.getID().equals(sock.getID())))
        {
            sock.setNumber(sock.getNumber()+1);
            return false;
        }
        socks.add(sock);
        return true;
    }
    public boolean addElectricEngine(ElectricEngine electricEngine)
    {
        if (electricEngines.stream().anyMatch(laptop1 -> laptop1.getID().equals(electricEngine.getID())))
        {
            electricEngine.setNumber(electricEngine.getNumber()+1);
            return false;
        }
        electricEngines.add(electricEngine);
        return true;
    }
    public boolean addCarWash(CarWash carWash)
    {
        if (carWashes.stream().anyMatch(laptop1 -> laptop1.getID().equals(carWash.getID())))
        {
            carWash.setNumber(carWash.getNumber()+1);
            return false;
        }
        carWashes.add(carWash);
        return true;
    }
    public boolean addBloodSugarTestMachine(BloodSugarTestMachine bloodSugarTestMachine)
    {
        if (bloodSugarTestMachines.stream().anyMatch(laptop1 -> laptop1.getID().equals(bloodSugarTestMachine.getID())))
        {
            bloodSugarTestMachine.setNumber(bloodSugarTestMachine.getNumber()+1);
            return false;
        }
        bloodSugarTestMachines.add(bloodSugarTestMachine);
        return true;
    }
    public boolean addSphygmomanometer(Sphygmomanometer sphygmomanometer )
    {
        if (sphygmomanometers.stream().anyMatch(laptop1 -> laptop1.getID().equals(sphygmomanometer.getID())))
        {
            sphygmomanometer.setNumber(sphygmomanometer.getNumber()+1);
            return false;
        }
        sphygmomanometers.add(sphygmomanometer);
        return true;
    }
    public boolean addDishWasher(DishWasher dishWasher)
    {
        if (dishWashers.stream().anyMatch(laptop1 -> laptop1.getID().equals(dishWasher.getID())))
        {
            dishWasher.setNumber(dishWasher.getNumber()+1);
            return false;
        }
        dishWashers.add(dishWasher);
        return true;
    }
    public boolean addVacuumCleaner(VacuumCleaner vacuumCleaner)
    {
        if (vacuumCleaners.stream().anyMatch(laptop1 -> laptop1.getID().equals(vacuumCleaner.getID())))
        {
            vacuumCleaner.setNumber(vacuumCleaner.getNumber()+1);
            return false;
        }
        vacuumCleaners.add(vacuumCleaner);
        return true;
    }
    public boolean addGuitar(Guitar guitar)
    {
        if (guitars.stream().anyMatch(laptop1 -> laptop1.getID().equals(guitar.getID())))
        {
            guitar.setNumber(guitar.getNumber()+1);
            return false;
        }
        guitars.add(guitar);
        return true;
    }
    public boolean addViolin(Violin violin)
    {
        if (violins.stream().anyMatch(laptop1 -> laptop1.getID().equals(violin.getID())))
        {
            violin.setNumber(violin.getNumber()+1);
            return false;
        }
        violins.add(violin);
        return true;
    }
    public boolean addHammer(Hammer hammer)
    {
        if (hammers.stream().anyMatch(laptop1 -> laptop1.getID().equals(hammer.getID())))
        {
            hammer.setNumber(hammer.getNumber()+1);
            return false;
        }
        hammers.add(hammer);
        return true;
    }
    public boolean addSaw(Saw saw)
    {
        if (saws.stream().anyMatch(laptop1 -> laptop1.getID().equals(saw.getID())))
        {
            saw.setNumber(saw.getNumber()+1);
            return false;
        }
        saws.add(saw);
        return true;
    }
    public boolean addBackpack(Backpack backpack)
    {
        if (backpacks.stream().anyMatch(laptop1 -> laptop1.getID().equals(backpack.getID())))
        {
            backpack.setNumber(backpack.getNumber()+1);
            return false;
        }
        backpacks.add(backpack);
        return true;
    }
    public boolean addStudyLight(StudyLight studyLight)
    {
        if (studyLights.stream().anyMatch(laptop1 -> laptop1.getID().equals(studyLight.getID())))
        {
            studyLight.setNumber(studyLight.getNumber()+1);
            return false;
        }
        studyLights.add(studyLight);
        return true;
    }
    public boolean addCar(Car car)
    {
        if (cars.stream().anyMatch(laptop1 -> laptop1.getID().equals(car.getID())))
        {
            car.setNumber(car.getNumber()+1);
            return false;
        }
        cars.add(car);
        return true;
    }
    public boolean addTrucks(Truck truck)
    {
        if (trucks.stream().anyMatch(laptop1 -> laptop1.getID().equals(truck.getID())))
        {
            truck.setNumber(truck.getNumber()+1);
            return false;
        }
        trucks.add(truck);
        return true;
    }
    public void userProfile(String password)
    {
        if (userLogin(password))
        {
            System.out.println(searchUser(password).get());
        }
    }
    public void increaseWallet(int amount, String password)
    {
        User user = users.stream().filter(user1 -> user1.getPassword().equals(password))
                .findFirst().get();
        user.setWallet(user.getWallet() + amount);
    }

    public ArrayList<Laptop> getLaptops() {
        return laptops;
    }

    public ArrayList<Smartphone> getSmartphones() {
        return smartphones;
    }

    public ArrayList<Shoe> getShoes() {
        return shoes;
    }

    public ArrayList<Sock> getSocks() {
        return socks;
    }

    public ArrayList<ElectricEngine> getElectricEngines() {
        return electricEngines;
    }

    public ArrayList<CarWash> getCarWashes() {
        return carWashes;
    }

    public ArrayList<BloodSugarTestMachine> getBloodSugarTestMachines() {
        return bloodSugarTestMachines;
    }

    public ArrayList<Sphygmomanometer> getSphygmomanometers() {
        return sphygmomanometers;
    }

    public ArrayList<DishWasher> getDishWashers() {
        return dishWashers;
    }

    public ArrayList<VacuumCleaner> getVacuumCleaners() {
        return vacuumCleaners;
    }

    public ArrayList<Guitar> getGuitars() {
        return guitars;
    }

    public ArrayList<Violin> getViolins() {
        return violins;
    }

    public ArrayList<Hammer> getHammers() {
        return hammers;
    }

    public ArrayList<Saw> getSaws() {
        return saws;
    }

    public ArrayList<Backpack> getBackpacks() {
        return backpacks;
    }

    public ArrayList<StudyLight> getStudyLights() {
        return studyLights;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public ArrayList<Truck> getTrucks() {
        return trucks;
    }
    public void adminProfile(String password)
    {
        Admin admin = admins.stream().filter(user1 -> user1.getPassword().equals(password))
                .findFirst().get();
        System.out.println(admin);
    }
    public void sellerProfile(String password)
    {
        System.out.println(searchSeller(password).get());
    }
    public void removeRequest(Request request)
    {
        requests.remove(request);
    }

    public ArrayList<Request> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Request> requests) {
        this.requests = requests;
    }
    public void addRequest(Request request)
    {
        requests.add(request);
    }
    public Optional<Laptop> searchLaptop(String name){
        return laptops.stream().
                filter(laptop -> laptop.getName().equals(name)).findFirst();
    }
    public Optional<Smartphone> searchSmartphone(String name){
        return smartphones.stream().
                filter(smartphone -> smartphone.getName().equals(name)).findFirst();
    }
    public Optional<Shoe> searchShoe(String name){
        return shoes.stream().
                filter(shoe -> shoe.getName().equals(name)).findFirst();
    }
    public Optional<Sock> searchSock(String name){
        return socks.stream().
                filter(sock -> sock.getName().equals(name)).findFirst();
    }
    public Optional<ElectricEngine> searchElectricEngine(String name){
        return electricEngines.stream().
                filter(electricEngine -> electricEngine.getName().equals(name)).findFirst();
    }
    public Optional<CarWash> searchCarWash(String name){
        return carWashes.stream().
                filter(carWash -> carWash.getName().equals(name)).findFirst();
    }
    public Optional<BloodSugarTestMachine> searchBloodSugarTestMachine(String name){
        return bloodSugarTestMachines.stream().
                filter(bloodSugarTestMachine -> bloodSugarTestMachine.getName().equals(name)).findFirst();
    }
    public Optional<Sphygmomanometer> searchSphygmomanometer(String name){
        return sphygmomanometers.stream().
                filter(sphygmomanometer -> sphygmomanometer.getName().equals(name)).findFirst();
    }
    public Optional<DishWasher> searchDishWasher(String name){
        return dishWashers.stream().
                filter(dishWasher -> dishWasher.getName().equals(name)).findFirst();
    }
    public Optional<VacuumCleaner> searchVacuumCleaner(String name){
        return vacuumCleaners.stream().
                filter(vacuumCleaner -> vacuumCleaner.getName().equals(name)).findFirst();
    }
    public Optional<Guitar> searchGuitar(String name){
        return guitars.stream().
                filter(guitar -> guitar.getName().equals(name)).findFirst();
    }
    public Optional<Violin> searchViolin(String name){
        return violins.stream().
                filter(violin -> violin.getName().equals(name)).findFirst();
    }
    public Optional<Hammer> searchHammer(String name){
        return hammers.stream().
                filter(hammer -> hammer.getName().equals(name)).findFirst();
    }
    public Optional<Saw> searchSaw(String name){
        return saws.stream().
                filter(saw -> saw.getName().equals(name)).findFirst();
    }
    public Optional<Backpack> searchBackpack(String name){
        return backpacks.stream().
                filter(backpack -> backpack.getName().equals(name)).findFirst();
    }
    public Optional<StudyLight> searchStudyLight(String name){
        return studyLights.stream().
                filter(studyLight -> studyLight.getName().equals(name)).findFirst();
    }
    public Optional<Car> searchCar(String name){
        return cars.stream().
                filter(car -> car.getName().equals(name)).findFirst();
    }
    public Optional<Truck> searchTruck(String name){
        return trucks.stream().
                filter(truck -> truck.getName().equals(name)).findFirst();
    }
}
