public class Car {
    private double gasCapacity;
    private double gasConsume;
    private double gas;
    private double mileage;
    private boolean isPowerOn;

    public Car(double gasCapacity, double gasConsume) {
        this.gasCapacity = gasCapacity;
        this.gasConsume = gasConsume;
        this.gas = 0.0;
        this.mileage = 0.0;
        this.isPowerOn = false;
    }

    public void powerOn() {
        this.isPowerOn = true;
    }

    public void powerOff() {
        this.isPowerOn = false;
    }

    public void loadGas(double gas) {
        this.gas = (gas + this.gas > this.gasCapacity) ? this.gasCapacity : gas + this.gas;
    }

    public void move(double distance) {
        if (isPowerOn) {
            this.mileage += (distance > this.gasConsume * this.gas) ? this.gasConsume * this.gas : distance;
            this.gas -= (this.gas < (distance / this.gasConsume)) ? this.gas : (distance / this.gasConsume);
        } else {
            System.out.println("Plss, turn on the car.");
        }
    }

    public double getGas() {
        return gas;
    }

    public double getMileage() {
        return mileage;
    }
}
