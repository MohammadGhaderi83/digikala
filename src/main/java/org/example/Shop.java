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

import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    private String name = "digikala";
    private String webAddress = "www.digikala.com";
    private String supportNumber = "021-61930000";
    private ArrayList<Admin> admins = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<BuyRequest> shoppingCart = new ArrayList<>();
    private double totalProfit;
    private ArrayList<Seller> sellers = new ArrayList<>();
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
    private ArrayList<WalletRequest> requests = new ArrayList<WalletRequest>();


    public double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(double totalProfit) {
        this.totalProfit = totalProfit;
    }

    public String getName() {
        return name;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public String getSupportNumber() {
        return supportNumber;
    }

    public ArrayList<BuyRequest> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<BuyRequest> shoppingCart) {
        this.shoppingCart = shoppingCart;
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
    public void removeRequest(WalletRequest request)
    {
        requests.remove(request);
    }

    public ArrayList<WalletRequest> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<WalletRequest> requests) {
        this.requests = requests;
    }
    public void addRequest(WalletRequest request)
    {
        requests.add(request);
    }
    public List<Laptop> searchLaptop(String name){
        return laptops.stream().
                filter(laptop -> laptop.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<Laptop> searchInLaptop(String ID, String name){
        List<Laptop> findLaptop = searchLaptop(name);
        return  findLaptop.stream().
                filter(laptop -> laptop.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<Smartphone> searchSmartphone(String name){
        return smartphones.stream().
                filter(smartphone -> smartphone.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<Smartphone> searchInSmartphone(String ID, String name){
        List<Smartphone> smartphoneList = searchSmartphone(name);
        return  smartphoneList.stream().
                filter(smartphone -> smartphone.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<Shoe> searchShoe(String name){
        return shoes.stream().
                filter(shoe -> shoe.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<Shoe> searchInShoe(String ID, String name){
        List<Shoe> shoeList = searchShoe(name);
        return  shoeList.stream().
                filter(shoe -> shoe.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<Sock> searchSock(String name){
        return socks.stream().
                filter(sock -> sock.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<Sock> searchInSock(String ID, String name){
        List<Sock> sockList = searchSock(name);
        return  sockList.stream().
                filter(sock -> sock.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<ElectricEngine> searchElectricEngine(String name){
        return electricEngines.stream().
                filter(electricEngine -> electricEngine.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<ElectricEngine> searchInElectronicEngine(String ID, String name){
        List<ElectricEngine> electricEngineList = searchElectricEngine(name);
        return  electricEngineList.stream().
                filter(electricEngine -> electricEngine.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<CarWash> searchCarWash(String name){
        return carWashes.stream().
                filter(carWash -> carWash.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<CarWash> searchInCarWash(String ID, String name){
        List<CarWash> carWashList = searchCarWash(name);
        return  carWashList.stream().
                filter(carWash -> carWash.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<BloodSugarTestMachine> searchBloodSugarTestMachine(String name){
        return bloodSugarTestMachines.stream().
                filter(bloodSugarTestMachine -> bloodSugarTestMachine.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<BloodSugarTestMachine> searchInBloodSugarTest(String ID, String name){
        List<BloodSugarTestMachine> bloodSugarTestMachineList = searchBloodSugarTestMachine(name);
        return  bloodSugarTestMachineList.stream().
                filter(bloodSugarTestMachine -> bloodSugarTestMachine.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<Sphygmomanometer> searchSphygmomanometer(String name){
        return sphygmomanometers.stream().
                filter(sphygmomanometer -> sphygmomanometer.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<Sphygmomanometer> searchInSphygmomanometer(String ID, String name){
        List<Sphygmomanometer> sphygmomanometerList = searchSphygmomanometer(name);
        return  sphygmomanometerList.stream().
                filter(sphygmomanometer -> sphygmomanometer.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<DishWasher> searchDishWasher(String name){
        return dishWashers.stream().
                filter(dishWasher -> dishWasher.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<DishWasher> searchInDishwasher(String ID, String name){
        List<DishWasher> dishWasherList = searchDishWasher(name);
        return  dishWasherList.stream().
                filter(dishWasher -> dishWasher.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<VacuumCleaner> searchVacuumCleaner(String name){
        return vacuumCleaners.stream().
                filter(vacuumCleaner -> vacuumCleaner.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<VacuumCleaner> searchInVacuumCleaner(String ID, String name){
        List<VacuumCleaner> vacuumCleanerList = searchVacuumCleaner(name);
        return  vacuumCleanerList.stream().
                filter(vacuumCleaner -> vacuumCleaner.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<Guitar> searchGuitar(String name){
        return guitars.stream().
                filter(guitar -> guitar.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<Guitar> searchInGuitar(String ID, String name){
        List<Guitar> guitarList = searchGuitar(name);
        return  guitarList.stream().
                filter(guitar -> guitar.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<Violin> searchViolin(String name){
        return violins.stream().
                filter(violin -> violin.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<Violin> searchInViolin(String ID, String name){
        List<Violin> violinList = searchViolin(name);
        return  violinList.stream().
                filter(violin -> violin.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<Hammer> searchHammer(String name){
        return hammers.stream().
                filter(hammer -> hammer.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<Hammer> searchInHammer(String ID, String name){
        List<Hammer> hammerList = searchHammer(name);
        return  hammerList.stream().
                filter(hammer -> hammer.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<Saw> searchSaw(String name){
        return saws.stream().
                filter(saw -> saw.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<Saw> searchInSaw(String ID, String name){
        List<Saw> sawList = searchSaw(name);
        return  sawList.stream().
                filter(saw -> saw.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<Backpack> searchBackpack(String name){
        return backpacks.stream().
                filter(backpack -> backpack.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<Backpack> searchInBackpack(String ID, String name){
        List<Backpack> backpackList = searchBackpack(name);
        return  backpackList.stream().
                filter(backpack -> backpack.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<StudyLight> searchStudyLight(String name){
        return studyLights.stream().
                filter(studyLight -> studyLight.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<StudyLight> searchInStudyLight(String ID, String name){
        List<StudyLight> studyLightList = searchStudyLight(name);
        return  studyLightList.stream().
                filter(studyLight -> studyLight.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<Car> searchCar(String name){
        return cars.stream().
                filter(car -> car.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<Car> searchInCar(String ID, String name){
        List<Car> carList = searchCar(name);
        return  carList.stream().
                filter(car -> car.getID().equals(ID)).collect(Collectors.toList());
    }
    public List<Truck> searchTruck(String name){
        return trucks.stream().
                filter(truck -> truck.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }
    public List<Truck> searchInTruck(String ID, String name){
        List<Truck> truckList = searchTruck(name);
        return  truckList.stream().
                filter(truck -> truck.getID().equals(ID)).collect(Collectors.toList());
    }
    static Set<Integer> IDRandomSaver = new HashSet<>();
    public int IDGenerator(){
        Random random = new Random();
        int IDNumber = random.nextInt(9000) + 1000 ;
        if (IDRandomSaver.contains(IDNumber)){
            return IDGenerator();
        } else {
            IDRandomSaver.add(IDNumber);
            return IDNumber;
        }
    }
    public void addOrder(Order order){
        orders.add(order);
    }
    public void showProducts(){
        int counter = 0;
        if (getLaptops().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getLaptops());
        }
        if (getSmartphones().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getSmartphones());
        }
        if (getShoes().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getShoes());
        }
        if (getSocks().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getSocks());
        }
        if (getElectricEngines().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getElectricEngines());
        }
        if (getCarWashes().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getCarWashes());
        }
        if (getBloodSugarTestMachines().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getBloodSugarTestMachines());
        }
        if (getSphygmomanometers().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getSphygmomanometers());
        }
        if (getDishWashers().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getDishWashers());
        }
        if (getVacuumCleaners().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getVacuumCleaners());
        }
        if (getGuitars().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getGuitars());
        }
        if (getViolins().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getViolins());
        }
        if (getHammers().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getHammers());
        }
        if (getSaws().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getSaws());
        }
        if (getBackpacks().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getBackpacks());
        }
        if (getStudyLights().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getStudyLights());
        }
        if (getCars().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getCars());
        }
        if (getTrucks().isEmpty())
        {
            counter++;
        }
        else
        {
            System.out.println(getTrucks());
        }
        if (counter == 18)
        {
            System.out.println("There is no product in the shop as it looks :(");
        }
    }
    public void searchProduct(String productName){
        if (!searchLaptop(productName).isEmpty())
        {
            System.out.println(searchLaptop(productName));
        } else if (!searchSmartphone(productName).isEmpty()){
            System.out.println(searchSmartphone(productName));
        } else if (!searchShoe(productName).isEmpty()){
            System.out.println(searchShoe(productName));
        } else if (!searchSock(productName).isEmpty()){
            System.out.println(searchSock(productName));
        } else if (!searchBloodSugarTestMachine(productName).isEmpty()){
            System.out.println(searchBloodSugarTestMachine(productName));
        } else if (!searchSphygmomanometer(productName).isEmpty()){
            System.out.println(searchSphygmomanometer(productName));
        } else if (!searchElectricEngine(productName).isEmpty()){
            System.out.println(searchElectricEngine(productName));
        } else if (!searchCarWash(productName).isEmpty()){
            System.out.println(searchCarWash(productName));
        } else if (!searchDishWasher(productName).isEmpty()){
            System.out.println(searchDishWasher(productName));
        } else if (!searchSaw(productName).isEmpty()){
            System.out.println(searchSaw(productName));
        } else if (!searchVacuumCleaner(productName).isEmpty()){
            System.out.println(searchVacuumCleaner(productName));
        } else if (!searchGuitar(productName).isEmpty()){
            System.out.println(searchGuitar(productName));
        } else if (!searchViolin(productName).isEmpty()){
            System.out.println(searchViolin(productName));
        } else if (!searchHammer(productName).isEmpty()){
            System.out.println(searchHammer(productName));
        } else if (!searchBackpack(productName).isEmpty()){
            System.out.println(searchBackpack(productName));
        } else if (!searchStudyLight(productName).isEmpty()){
            System.out.println(searchStudyLight(productName));
        } else if (!searchCar(productName).isEmpty()){
            System.out.println(searchCar(productName));
        } else if (!searchTruck(productName).isEmpty()){
            System.out.println(searchTruck(productName));
        } else {
            System.out.println("There is no product according to your search :((");
        }
    }
    public void searchByIDInSearchedListAndDecrease(String ID, String productName, int numOfOrders){
        if (!searchInLaptop(ID, productName).isEmpty()){
            Laptop temp = searchInLaptop(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInSmartphone(ID, productName).isEmpty()){
            Smartphone temp = searchInSmartphone(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInShoe(ID, productName).isEmpty()){
            Shoe temp = searchInShoe(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInSock(ID, productName).isEmpty()){
            Sock temp = searchInSock(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInBloodSugarTest(ID, productName).isEmpty()){
            BloodSugarTestMachine temp = searchInBloodSugarTest(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInSphygmomanometer(ID, productName).isEmpty()){
            Sphygmomanometer temp = searchInSphygmomanometer(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInElectronicEngine(ID, productName).isEmpty()){
            ElectricEngine temp = searchInElectronicEngine(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInCarWash(ID, productName).isEmpty()){
            CarWash temp = searchInCarWash(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInDishwasher(ID, productName).isEmpty()){
            DishWasher temp = searchInDishwasher(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInSaw(ID, productName).isEmpty()){
            Saw temp = searchInSaw(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInVacuumCleaner(ID, productName).isEmpty()){
            VacuumCleaner temp = searchInVacuumCleaner(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInGuitar(ID, productName).isEmpty()){
            Guitar temp = searchInGuitar(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInViolin(ID, productName).isEmpty()){
            Violin temp = searchInViolin(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInHammer(ID, productName).isEmpty()){
            Hammer temp = searchInHammer(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInBackpack(ID, productName).isEmpty()){
            Backpack temp = searchInBackpack(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInStudyLight(ID, productName).isEmpty()){
            StudyLight temp = searchInStudyLight(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInCar(ID, productName).isEmpty()){
            Car temp = searchInCar(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        } else if (!searchInTruck(ID, productName).isEmpty()){
            Truck temp = searchInTruck(ID, productName).get(0);
            temp.setNumber(temp.getNumber()- numOfOrders);
        }
    }
    public void addShoppingCartRequest(BuyRequest request){
        shoppingCart.add(request);
    }
    public Optional<Seller> searchSellerByUsername(String username){
        return sellers.stream().
                filter(seller -> seller.getUsername().equals(username)).findFirst();
    }
    public void removeShoppingCartRequest(ShoppingCart shoppingCart){
        getShoppingCart().remove(shoppingCart);
    }
}
