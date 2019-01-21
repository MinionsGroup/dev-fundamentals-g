public class Car {

    private double gas;
    private double distance;
    private double gasConsume;
    private boolean isPowerOn;
    private double capacity;


    public Car() {
        this.gas = 0.0;
        this.distance = 0.0;
        this.gasConsume = 0.0;
        this.isPowerOn = false;
        this.capacity = 0.0;
    }

    public void powerOn() {
        this.isPowerOn = true;
    }

    public void powerOff() {
        this.isPowerOn = false;
    }

    public void loadGas(double gas) {
        if (this.gas + gas <= this.capacity) {
            this.gas += gas;
        } else {
            this.gas = capacity;
        }
    }

    public void move(double distance) {
        double maxDistance = gasConsume * gas;
        if (distance <= maxDistance) {
            this.distance += distance;
            this.gas -= this.distance / this.gasConsume;
        } else {
            this.distance += maxDistance;
            this.gas = 0;
        }
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

    public double getDistance() {
        return distance;
    }

    public double getGas() {
        return gas;
    }

}

