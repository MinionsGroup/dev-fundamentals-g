package lesson_1.Homework_lesson1;

/**
 * Created by Daniel cabero
 *
 * @since 12/11/2018.
 */
public class Car {
    private double gasCapacity;
    private double gas;
    private double gasConsumption;
    private double performance;
    private double mileage;
    private boolean on;

    public Car(double gasCapacity, double performance, double mileage) {
        this.gasCapacity = gasCapacity;
        this.performance = performance;
        this.mileage = mileage;
    }

    public double getGasCapacity() {
        return gasCapacity;
    }

    public void fillGas(double gas) {
        this.gas += gas;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getPerformance() {
        return performance;
    }

    public double getMileage() {
        return mileage;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }

    public boolean isOn() {
        return on;
    }

    public void powerOn() {
        on = true;
    }

    public void powerOff() {
        on = false;
    }

    public boolean canMove(double gas) {
        return this.gasConsumption - gas > 0;
    }

    public void setGasCapacity(double gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public void setGasConsumption(double gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    public double getGas() {

        return gas;
    }

    public double move(double gas) {
        if (on) {
            this.gasCapacity += gas;
            return this.gas / gasConsumption;
        } else {
            powerOn();
            this.gas += gas;
            return this.gas / gasConsumption;
        }
    }
}
