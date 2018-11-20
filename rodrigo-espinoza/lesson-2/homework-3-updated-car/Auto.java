package com.company;

public class Auto {
    /**
     * Fields
     */
    private double gas;
    private double distance;
    private double gasConsume;
    private boolean isPowerOn;
    private double capacity;

    /**
     * Default Constructor
     */

    public Auto() {
//        this.gas = 0.0;
////        this.distance = 0.0;
////        this.gasConsume = 0.0;
////        this.isPowerOn = false;
////        this.capacity = 20.0;

        this(0, 0, 0, false, 0);
    }

    /**
     * Constructor q inicia los atributos con los valores recibidos q le daremos (new).
     *
     * @param gas        double
     * @param gasConsume double
     * @param isPowerOn  boolean
     * @param capacity   double
     */
    public Auto(double gas, double distance, double gasConsume, boolean isPowerOn, double capacity) {
        this.gas = gas;
        this.distance = distance;
        this.gasConsume = gasConsume;
        this.isPowerOn = isPowerOn;
        this.capacity = capacity;
    }

    public void powerOn() {
        this.isPowerOn = true;
    }

    public void powerOff() {
        this.isPowerOn = false;
    }

    public void fillGas(double gas) {
        if (this.gas + gas <= this.capacity)
            this.gas += gas;
    }

    private double maxDistance() {
        return gasConsume * gas;
    }

    public void move(double distance) {
        if (distance < maxDistance()) {
            this.distance = distance;
        } else {
            this.distance = maxDistance();
        }
        this.gas -= this.distance / this.gasConsume;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getGasConsume() {
        return gasConsume;
    }

    public void setGasConsume(double gasConsume) {
        this.gasConsume = gasConsume;
    }

    public double distanceTraveled() {
        return distance;
    }

    public double getGas() {
        return gas;
    }
}