public class Car {
    private double gas;
    private boolean powerON;
    private double maxThankCapacity;
    private double performance; //   distance/liters

    public Car(double maxThankCapacity, double performance) {
        gas = 0;
        this.maxThankCapacity = maxThankCapacity;
        this.performance = performance;
    }

    public void powerOn() {
        powerON = true;
    }

    public void powerOff() {
        powerON = false;
    }

    public void fillGas(double gasToFill) {
        gas = (gas + gasToFill) <= maxThankCapacity ? gas + gasToFill : gas;

    }

    public void move(double distance) {
        if (powerON) {
            gas = distance <= maxMove() ? gas - reduceCantGas(distance) : 0.0;
        } else {
            System.out.println("Turn on the car");
        }
    }

    public double getGas() {
        return gas;
    }

    private double reduceCantGas(double distance) {
        return 1 / performance * distance;
    }

    private double maxMove() {
        return gas * performance;
    }
}
