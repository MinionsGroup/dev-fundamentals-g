package home_work_04;

/**
 * Created by Daniel cabero
 *
 * @since 12/11/2018.
 */
public class Car {
    private double gas;
    private double performance;
    private double mileage;
    private boolean on;

    public Car(double gas, double performance, double mileage) {
        this.gas = gas;
        this.performance = performance;
        this.mileage = mileage;
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

    public double getGas() {
        return gas;
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
        return this.gas - gas > 0;
    }

    public double move(double gas) {
        if (on) {
            this.gas += gas;
            return this.gas / performance;
        } else {
            powerOn();
            this.gas += gas;
            return this.gas / performance;
        }
    }
}
