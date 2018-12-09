package com.company;

public class Car {
    private String model;
    private String brand;
    private double gasoline;
    private double distance;
    private boolean powerOn;
    private double usedGas;
    private double maxGasFill;
    private double fuelEfficiency;

    Car(String model, String brand, double fuelEfficiency) {
        this.model = model;
        this.brand = brand;
        setPowerOn(false);
        setDistance(0.0);
        this.setFuelEfficiency(fuelEfficiency);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getGasoline() {
        return gasoline;
    }

    public void setGasoline(double gasoline) {
        this.gasoline = gasoline;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public void powerOn() {
        setPowerOn(true);
    }

    public void powerOff() {
        setPowerOn(false);
    }

    public double getUsedGas() {
        return usedGas;
    }

    public void setUsedGas(double usedGas) {
        this.usedGas = usedGas;
    }

    public double getMaxGasFill() {
        return maxGasFill;
    }

    public void setMaxGasFill(double maxGasFill) {
        this.maxGasFill = maxGasFill;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public void move(double distance) {
        double dist = 0.0;
        if (canMove()) {
            dist = (getGasoline() * getFuelEfficiency());
            if (dist > distance) {
                dist = distance;
            }
            this.setUsedGas(dist / getFuelEfficiency());
            this.setGasoline((getGasoline() - (dist / getFuelEfficiency())));
            this.setDistance(getDistance() + dist);
        }
        powerOff();
    }

    public boolean canMove() {
        boolean move = false;
        if (getGasoline() > 0 && isPowerOn()) {
            move = true;
        }
        return move;
    }

    public void fillFullGas(double litros) {
        double gas = getMaxGasFill() - getGasoline();
        if (litros <= gas) {
            this.setGasoline((getGasoline() + litros));
        } else {
            System.out.println("The maximum amount to fill full the car is:" + gas);
        }
    }

    public void showCarInformation() {
        if (getGasoline() > 0) {
            System.out.printf("The car " + getBrand() + ", model " + getModel() +
                    " arrived at it destination, traveling a distance of: " + getDistance() + " km, and using a " +
                    "total gasoline of: " + getUsedGas() +
                    " liters, having a total of gas in it tank of: " + getGasoline() + " liters \n");
        } else {
            System.out.printf("The car " + getBrand() + ", model " + getModel() +
                    " not arrived at it destination, traveling a distance of: " + getDistance() + " km, and using " +
                    "a total gasoline of: " + getUsedGas() +
                    " liters, having a total of gas in it tank of: " + getGasoline() + " liters \n");
        }
    }
}
