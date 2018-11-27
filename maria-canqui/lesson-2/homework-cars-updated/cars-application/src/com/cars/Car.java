package com.cars;

import com.sun.prism.shader.Solid_ImagePattern_Loader;

public class Car {
    private double mileage;
    private double gas;
    private double gasCapacity;
    private double gasConsumption;
    private boolean isPowerOn;

    /**
     * This method changes the Car PowerOn status
     * @param gasoline gasoline cosumed per km
     * @param gasCapacity
     * @param gasConsumption
     */
    public Car(double gasoline, double gasCapacity, double gasConsumption) {
        this.isPowerOn = false;
        this.mileage = 0;
        this.gasCapacity = gasCapacity;
        this.gasConsumption = gasConsumption;
        this.gas = gasoline;
    }

    /**
     * This method changes the Car PowerOn status
     * @param powerOn
     */
    public void setPowerOn (boolean powerOn) {
        String status = powerOn ? "Turn On": "Turn Off";
        System.out.println("Changing the status car to: " + status);
        this.isPowerOn = powerOn;
    }

    /**
     * This method changes the Car PowerOn status
     * @param gas
     */
    public void loadGas (double gas) {
        System.out.println("Charging gas: " + gas);
        if (this.gasCapacity < gas) {
            this.gas = this.gasCapacity;
        } else {
            this.gas += gas;
        }
    }

    /**
     * This method changes the Car PowerOn status
     * @param mileage
     */
    public void move (double mileage) {
        double gasConsumed = mileage * this.gasConsumption;
        if (this.gas - gasConsumed >= 0) {
            System.out.println("The cas pass the test");
        } else {
            System.out.println("The cas lost the test");
        }
    }
}
