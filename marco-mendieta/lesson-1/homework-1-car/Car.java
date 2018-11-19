import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Car {

    private double gas;
    private double distance;
    private boolean isPoweredOn;
    private double performance;
    private double gasCapacity;

    public Car(){
        this.gas = 0;
        this.distance = 0;
        this.isPoweredOn = false;
        // kilometer per liter
        this.performance = 10;
        this.gasCapacity = 600;
    }

    public Car(double gasCapacity, double performance) {
        this.gas = 0;
        this.distance = 0;
        this.isPoweredOn = false;
        this.gasCapacity = gasCapacity;
        this.performance = performance;
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

    public double getDistance(){
        return this.distance;
    }

    public void setDistance(double distance){
        this.distance = distance;
    }

    public double getPerformance(){
        return this.performance;
    }

    public void setPerformance(double performance){
        this.performance = performance;
    }

    public double getGasCapacity(){
        return this.gasCapacity;
    }

    public void setGasCapacity(double gasCapacity){
        this.gasCapacity = gasCapacity;
    }

	// move the car
    public void move(double distance){
        if (!getIsPoweredOn()){
            setIsPoweredOn(true);
            System.out.println("The car is powered on ");
        }
        if (canMove(distance)){
            setDistance(getDistance() + distance);
            System.out.println("The car is moving for " + getDistance() + " kilometers");
            setGas(getGas() - getGasWasted(distance));
        }
        else System.out.println("The car does not have enough gas");
    }

    public void refillGas(double gas){
        if(getGas() + gas <= getGasCapacity()){
            setGas(getGas() + gas);
            System.out.println("The car has " + getGas() + " liter");
        }
        else{
            double freeGasSpace = getGasCapacity() - getGas();
            System.out.println("The car gas capacity is full you have" + freeGasSpace + " of free space");
        }
    }

    public boolean canMove(double distance){
        if (getGas() > 0 && isGasEnoughForDistance(distance)){
            System.out.println("The car can move for " + distance + " kilometers");
            return true;
        }else {
            System.out.println("The car cannot move for " + distance + " kilometers");
            return false;
        }
    }

    // Read the distance from the console
    public void setDistanceFromConsoleInput(){
        System.out.println("Please enter the distance you want to move:");
        setDistance(getDistance() + getDoubleFromConsoleInput());
        System.out.println("The total distane that the car is going to move is: " + getDistance());
    }

    // Read the performance from the console
    public void setPerformanceFromConsoleInput(){
        System.out.println("Please enter the performance of the car km/l:");
        setPerformance(getDoubleFromConsoleInput());
        System.out.println("The performance of the car is: " + getPerformance());
    }
    // Read gas from file
    public void getGasFromFile(String path) {
        try {
            File file = new File(path);
            Scanner fileScanner = new Scanner(file);
            refillGas(fileScanner.nextDouble());
        }catch (FileNotFoundException e) {
            System.out.println("Error: File was not found!!" + new File(".").getAbsolutePath() + path);
        }
    }

    private boolean isGasEnoughForDistance(double distance){
        // performance = distance/gas
        // distance = performance * gas
        if (distance <= getPerformance()*gas){
            System.out.println("The distance: " + distance + " can be finished with " + getGas() + " liter");
            return true;
        }
        else{
            System.out.println("The distance: " + distance + " can not be finished with " + getGas() + " liter");
            return false;
        }
    }

    private double getGasWasted(double distance){
        // performance = distance/gas
        // gas = distance/performance
        return distance/getPerformance();
    }

    // Read a number from the console
    private double getDoubleFromConsoleInput(){
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public static void main(String [] args){
        Car carWithoutGas = new Car();
        carWithoutGas.move(10);
        carWithoutGas.refillGas(50);
        carWithoutGas.move(10);
        carWithoutGas.refillGas(500);
        carWithoutGas.move(10);
        carWithoutGas.canMove(50);
        carWithoutGas.canMove(6000);
        carWithoutGas.move(6000);
        Car firstCar = new Car(1000, 50);
        //Read distance from console.
        firstCar.setDistanceFromConsoleInput();
        //Read Gas from file
        firstCar.getGasFromFile("marco-mendieta//lesson-1/homework-1-car/file.txt");
        // Read car performance from console.
        Car secondCar = new Car(1000, 50);
        carWithoutGas.setPerformanceFromConsoleInput();
    }
}
