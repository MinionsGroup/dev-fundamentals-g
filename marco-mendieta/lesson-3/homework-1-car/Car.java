import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Car {

    private double gas;
    private double mileage;
    private boolean isPoweredOn;
    private double gasConsumption;
    private double gasCapacity;

    public Car(){
        this.gas = 0;
        this.mileage = 0;
        this.isPoweredOn = false;
        // kilometer per liter
        this.gasConsumption = 10;
        this.gasCapacity = 600;
    }

    public Car(double gasCapacity, double performance) {
        this.gas = 0;
        this.mileage = 0;
        this.isPoweredOn = false;
        this.gasCapacity = gasCapacity;
        this.gasConsumption = performance;
    }

	// getters and setters
    public boolean getIsPoweredOn(){
        return this.isPoweredOn;
    }

    public void setIsPoweredOn(boolean isPoweredOn){
        this.isPoweredOn = true;
    }

    public double getGas(){
        return this.gas;
    }

    public void setGas(double gas){
        this.gas = gas;
    }

    public double getMileage(){
        return this.mileage;
    }

    public void setMileage(double mileage){
        this.mileage = mileage;
    }

    public double getGasConsumption(){
        return this.gasConsumption;
    }

    public void setGasConsumption(double gasConsumption){
        this.gasConsumption = gasConsumption;
    }

    public double getGasCapacity(){
        return this.gasCapacity;
    }

    public void setGasCapacity(double gasCapacity){
        this.gasCapacity = gasCapacity;
    }

    // power on power off
    public void powerOn(){
        if (!getIsPoweredOn()){
            setIsPoweredOn(true);
            System.out.println("The car is powered on ");
        }
    }

    public void powerOff(){
        if (getIsPoweredOn()){
            setIsPoweredOn(false);
            System.out.println("The car is powered off ");
        }
    }

	// move the car
    public void move(double distance){
        powerOn();
        // gasConsumption = mileage/gas
        // mileage = gasConsumption * gas
        if (distance <= getGasConsumption()*getGas()){
            setMileage(getMileage() + distance);
            System.out.println("The car is moving for " + getMileage() + " kilometers");
        }
        else{
            setMileage(getMileage() + getGasConsumption()*getGas());
            System.out.println("The car is moving just for " + getGasConsumption()*getGas() + " kilometers");
        }
    }

    public void loadGas(double gas){
        if(getGas() + gas <= getGasCapacity()){
            setGas(getGas() + gas);
            System.out.println("The car has " + getGas() + " liter");
        }
        else{
            double freeGasSpace = getGasCapacity() - getGas();
            System.out.println("The car gas capacity is full you have" + freeGasSpace + " of free space");
        }
    }

    // Read the mileage from the console
    public void setDistanceFromConsoleInput(){
        System.out.println("Please enter the mileage you want to move:");
        setMileage(getMileage() + getDoubleFromConsoleInput());
        System.out.println("The total distane that the car is going to move is: " + getMileage());
    }

    // Read the gasConsumption from the console
    public void setPerformanceFromConsoleInput(){
        System.out.println("Please enter the gasConsumption of the car km/l:");
        setGasConsumption(getDoubleFromConsoleInput());
        System.out.println("The gasConsumption of the car is: " + getGasConsumption());
    }
    // Read gas from file
    public void getGasFromFile(String path) {
        try {
            File file = new File(path);
            Scanner fileScanner = new Scanner(file);
            loadGas(fileScanner.nextDouble());
        }catch (FileNotFoundException e) {
            System.out.println("Error: File was not found!!" + new File(".").getAbsolutePath() + path);
        }
    }

    // Read a number from the console
    private double getDoubleFromConsoleInput(){
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public static void main(String [] args){
        Car carWithoutGas = new Car();
        carWithoutGas.move(10);
        carWithoutGas.loadGas(50);
        carWithoutGas.move(10);
        carWithoutGas.loadGas(500);
        carWithoutGas.move(10);
        carWithoutGas.move(6000);
        Car firstCar = new Car(1000, 50);
        //Read mileage from console.
        firstCar.setDistanceFromConsoleInput();
        //Read Gas from file
        firstCar.getGasFromFile("file.txt");
        // Read car gasConsumption from console.
        Car secondCar = new Car(1000, 50);
        carWithoutGas.setPerformanceFromConsoleInput();
    }
}
