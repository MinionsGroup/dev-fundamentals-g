package cars_app;

import java.util.Random;

/**
 * This class is create a Car
 *
 * @author Omar Limbert Huanca Sanchez
 * @version 1.0.
 */
public class Car {

    private double mileage;
    private double gasoline;
    private double gasCapacity;
    private double gasComsumption;
    private boolean isPowerOn;
    private String carName;

    /**
     * Constructor for Car.
     * This method is for initialize contact attributes
     *
     */
    public Car() {
        this.carName = "";
        this.isPowerOn = false;
        this.mileage = 0;
        this.gasoline = 0;
        // gasComsumption with Random number between 1-3
        // with formula: nextInt((max - min) + 1) + min;
        this.gasComsumption = new Random().nextInt(3) + 1;

        // gasCapacity with Random number between 30-60
        this.gasCapacity = new Random().nextInt(31) + 30;

    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    /**
     * This method is to get Max Gasoline of Car
     *
     * @return gasCapacity
     */
    public double getGasCapacity() {
        return gasCapacity;
    }

    /**
     * This method is to set the mileage of the car
     *
     * @param mileage, double mileage of the car
     */
    public void setMileage(double mileage) {
        this.mileage = mileage;
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
     * @return gasComsumption
     */
    public double getGasComsumption() {
        return gasComsumption;
    }

    /**
     * This method is to power on the car
     */
    public void powerOn() {
        this.isPowerOn = true;
    }

    /**
     * This method is to power off the car
     */
    public void powerOff() {
        this.isPowerOn = false;
    }


    /**
     * This method is to return actual gasoline according mileage
     *
     * @param distance is mileage to move
     * @return double, negative or positive double gasoline reference
     */
    public double move(double distance) {
        this.setMileage(distance);
        this.powerOn();
        this.setGasoline(this.getGasoline()-this.calculateGasolineRequired(distance));
        this.powerOff();
        return gasoline;
    }

    /**
     * This method is to calculate gasoline required
     *
     * @param distance is mileage to move
     * @return double, gasoline required
     */
    private double calculateGasolineRequired(double distance) {
        return this.mileage * this.getGasComsumption();
    }
}
