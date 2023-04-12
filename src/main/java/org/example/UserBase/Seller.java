package org.example.UserBase;

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
import org.example.Vehicles.Car;
import org.example.Vehicles.Truck;

import java.util.ArrayList;

public class Seller extends UserBase{
    private double wallet;
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

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(ArrayList<Laptop> laptops) {
        this.laptops = laptops;
    }

    public ArrayList<Smartphone> getSmartphones() {
        return smartphones;
    }

    public void setSmartphones(ArrayList<Smartphone> smartphones) {
        this.smartphones = smartphones;
    }

    public ArrayList<Shoe> getShoes() {
        return shoes;
    }

    public void setShoes(ArrayList<Shoe> shoes) {
        this.shoes = shoes;
    }

    public ArrayList<Sock> getSocks() {
        return socks;
    }

    public void setSocks(ArrayList<Sock> socks) {
        this.socks = socks;
    }

    public ArrayList<ElectricEngine> getElectricEngines() {
        return electricEngines;
    }

    public void setElectricEngines(ArrayList<ElectricEngine> electricEngines) {
        this.electricEngines = electricEngines;
    }

    public ArrayList<CarWash> getCarWashes() {
        return carWashes;
    }

    public void setCarWashes(ArrayList<CarWash> carWashes) {
        this.carWashes = carWashes;
    }

    public ArrayList<BloodSugarTestMachine> getBloodSugarTestMachines() {
        return bloodSugarTestMachines;
    }

    public void setBloodSugarTestMachines(ArrayList<BloodSugarTestMachine> bloodSugarTestMachines) {
        this.bloodSugarTestMachines = bloodSugarTestMachines;
    }

    public ArrayList<Sphygmomanometer> getSphygmomanometers() {
        return sphygmomanometers;
    }

    public void setSphygmomanometers(ArrayList<Sphygmomanometer> sphygmomanometers) {
        this.sphygmomanometers = sphygmomanometers;
    }

    public ArrayList<DishWasher> getDishWashers() {
        return dishWashers;
    }

    public void setDishWashers(ArrayList<DishWasher> dishWashers) {
        this.dishWashers = dishWashers;
    }

    public ArrayList<VacuumCleaner> getVacuumCleaners() {
        return vacuumCleaners;
    }

    public void setVacuumCleaners(ArrayList<VacuumCleaner> vacuumCleaners) {
        this.vacuumCleaners = vacuumCleaners;
    }

    public ArrayList<Guitar> getGuitars() {
        return guitars;
    }

    public void setGuitars(ArrayList<Guitar> guitars) {
        this.guitars = guitars;
    }

    public ArrayList<Violin> getViolins() {
        return violins;
    }

    public void setViolins(ArrayList<Violin> violins) {
        this.violins = violins;
    }

    public ArrayList<Hammer> getHammers() {
        return hammers;
    }

    public void setHammers(ArrayList<Hammer> hammers) {
        this.hammers = hammers;
    }

    public ArrayList<Saw> getSaws() {
        return saws;
    }

    public void setSaws(ArrayList<Saw> saws) {
        this.saws = saws;
    }

    public ArrayList<Backpack> getBackpacks() {
        return backpacks;
    }

    public void setBackpacks(ArrayList<Backpack> backpacks) {
        this.backpacks = backpacks;
    }

    public ArrayList<StudyLight> getStudyLights() {
        return studyLights;
    }

    public void setStudyLights(ArrayList<StudyLight> studyLights) {
        this.studyLights = studyLights;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Truck> getTrucks() {
        return trucks;
    }

    public void setTrucks(ArrayList<Truck> trucks) {
        this.trucks = trucks;
    }

    public Seller(String username, String password, double wallet) {
        super(username, password);
        this.wallet = wallet;
    }

    public Seller(String username, String password) {
        super(username, password);
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

    @Override
    public String toString() {
        return super.toString() + "->" + "Seller{" +
                "wallet=" + wallet +
                '}';
    }
}
