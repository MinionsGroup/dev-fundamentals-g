package cars_app;

import java.util.Random;

/**
 * This class is create a Car
 *
 * @author Omar Limbert Huanca Sanchez
 * @version 1.0.
 */
public class Car {
    private String name;
    private double distance;
    private double gasoline;
    private double maxGasoline;
    private double gasConsume;
    private boolean isPowerOn;


    /**
     * Constructor for Car.
     * This method is for initialize contact attributes
     *
     * @param name, This is a name of the car
     */
    public Car(String name) {
        this.name = name;
        this.isPowerOn = false;
        this.distance = 0;
        this.gasoline = 0;

        // gasConsume with Random number between 1-3
        // with formula: nextInt((max - min) + 1) + min;
        this.gasConsume = new Random().nextInt(3) + 1;

        // maxGasoline with Random number between 30-60
        this.maxGasoline = new Random().nextInt(31) + 30;

    }

    /**
     * This method is to get Max Gasoline of Car
     *
     * @return maxGasoline
     */
    public double getMaxGasoline() {
        return maxGasoline;
    }

    /**
     * This method is to set the distance of the car
     *
     * @param distance, double distance of the car
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * This method is to get Gasoline of the car
     *
     * @return gasoline
     */
    public double getGasoline() {
        return gasoline;
    }

    /**
     * This method is to set the gasoline of the car
     *
     * @param gasoline double gasoline of the car
     */
    public void setGasoline(double gasoline) {
        this.gasoline = gasoline;
    }

    /**
     * This method is to get Gas Consume variable
     *
     * @return gasConsume
     */
    public double getGasConsume() {
        return gasConsume;
    }

    /**
     * This method is to set Gas Consume variable
     *
     * @param newGasConsume, This is a new gas consume
     */
    public void setGasConsume(double newGasConsume) {
        this.gasConsume = newGasConsume;
    }

    /**
     * This method is to set the state of car
     *
     * @param powerOn boolean True or False
     */
    public void setPowerOn(boolean powerOn) {
        this.isPowerOn = powerOn;
    }

    /**
     * This method is to get Name of the car
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This method is to power on the car
     */
    public void powerOnTheCar() {
        System.out.println(String.format("Turning ON the car [ %s ]", this.getName()));
        this.setPowerOn(true);
    }

    /**
     * This method is to power off the car
     */
    public void powerOffTheCar() {
        System.out.println(String.format("Turning OFF the car [ %s ]", this.getName()));
        this.setPowerOn(false);
    }

    /**
     * This method is to return if the car is able to charge gasoline
     *
     * @param gasoline double value of gasoline
     * @return Boolean, True if the car is able to charge gasoline, False if not
     */
    private boolean isTankOfGasolineFull(double gasoline) {
        return maxGasoline < this.gasoline + gasoline;

    }

    /**
     * This method is to return actual gasoline according distance
     *
     * @param distance is distance to move
     * @return double, negative or positive double gasoline reference
     */
    public double moveADistanceWithCar(double distance) {
        this.setDistance(distance);
        this.powerOnTheCar();
        gasoline = this.getGasoline()-this.calculateGasolineRequired(distance);
        this.powerOffTheCar();
        return gasoline;
    }

    /**
     * This method is to calculate gasoline required
     *
     * @param distance is distance to move
     * @return double, gasoline required
     */
    private double calculateGasolineRequired(double distance) {
        return this.distance * this.getGasConsume();
    }
}
