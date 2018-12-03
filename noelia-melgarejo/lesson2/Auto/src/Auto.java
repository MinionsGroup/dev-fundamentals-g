public class Auto {
    private double gasCapacity;
    private double gasConsumption;
    private double gas;
    private double mileage;
    private boolean isPowerOn;

    /**
     * The constructor method
     * @param gasConsumption in Litre/KM
     */
    public Auto(double gasConsumption) {
        this.gasConsumption = gasConsumption;
        mileage = 0;
        isPowerOn = false;
        gas = 0;

    }
    /**
     * gets amount of Gasoline
     * @return
     */
    public double getGas() {
        return gas;
    }

    /**
     * Sets a amount the gas
     * @param gas
     */
    public void setGas(double gas) {
        this.gas = gas;
    }

    /**
     * Gets the gas Capacity
     * @return
     */
    public double getGasCapacity() {
        return gasCapacity;
    }

    /**
     * Sets of gas capacity
     * @param gasCapacity
     */
    public void setGasCapacity(double gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    /**
     * Gets the gas Consumption L/Km
     * @return
     */
    public double getGasConsumption() {
        return gasConsumption;
    }

    /**
     * Sets the gasConsumption
     * @param gasConsumption
     */
    public void setGasConsumption(double gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    /**
     * Gets the mileage
     * @return
     */
    public double getMileage() {
        return mileage;
    }

    /**
     * Sets the mileage
     * @param mileage
     */
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    /**
     * Gets true for power on
     * @return
     */
    public boolean powerOn() {
        return isPowerOn = true;
    }

    /**
     * Sets power Off
     */
    public void powerOff() {
        isPowerOn = false;
    }

    /**
     * Loads amount of gas
     * @param gas Liters
     */
    public void loadGas(double gas) {
        if (gasCapacity > gas)
            setGas(gas);
        else this.gas = gasCapacity;
    }

    /**
     * Moves the car
     * @param distanceToMove expressed in Km
     */
    public void move(double distanceToMove) {
        mileage = distanceToMove;
        double cantGasExist = 0;
        cantGasExist = gas - (gasConsumption * mileage);
        if (cantGasExist > 0)
            gas = gas - cantGasExist;

        if (cantGasExist < 0) {
            mileage = (1 / gasConsumption) * gas;
            gas = 0;

            System.out.println("the gas is only for : " + mileage + " Km");
        }
        System.out.println(getGas() + " Liters -  Amount of existing gas");
        System.out.println("The car mileage :  " + getMileage()+" Km");
    }


}

