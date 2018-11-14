/**
 * Car Class.
 */
public class Car {
    private double gas;
    private double distance;
    private boolean isPowerOn;
    private double gasConsume;
    private double gasCapacity;
    private double consumedGas;

    /**
     * Constructor
     */
    public Car() {
        this.gas = 0.0;
        this.distance = 0.0;
        this.isPowerOn = false;
        this.gasConsume = 0.0;
        this.gasCapacity = 0.0;
        this.consumedGas = 0.0;
    }

    /**
     * @return the gas that have been consumed.
     */
    public double getConsumedGas() {
        return consumedGas;
    }

    /**
     * @return the actual gas.
     */
    public double getGas() {
        return gas;
    }

    /**
     * @param gasConsume set the gasConsumed of the car ex: 1.5Km/L.
     */
    public void setGasConsume(double gasConsume) {
        this.gasConsume = gasConsume;
    }

    /**
     * @param gasCapacity set the tank size of the car.
     */
    public void setGasCapacity(double gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    /**
     * Turn on the car.
     */
    public void powerOn() {
        this.isPowerOn = true;
    }

    /**
     * Turn off the car.
     */
    public void powerOff() {
        this.isPowerOn = false;
    }

    /**
     * It only can fill gas until the gasCapacity.
     *
     * @param capacity the gas capacity to fill the car.
     */
    public void fillGas(double capacity) {
        this.gas = (capacity < this.gasCapacity) ? capacity : this.gasCapacity;
    }

    /**
     * @param distance, Km distance to drive.
     */
    public void move(double distance) {
        if (isPowerOn) {
            this.gas = (maxMove() >= distance) ? this.gas - verifyGasConsumed(distance) : 0.0;
        } else {
            powerOn();
        }
    }

    /**
     * @return the max distance that the car can drive with the current gas based on gasConsume.
     */
    private double maxMove() {
        this.distance = gas * gasConsume;
        return this.distance;
    }

    /**
     * @param distance, Km distance to drive.
     * @return the gas that have been cosumed after to drive a distance.
     */
    private double verifyGasConsumed(double distance) {
        this.consumedGas = distance / gasConsume;
        return this.consumedGas;
    }
}

