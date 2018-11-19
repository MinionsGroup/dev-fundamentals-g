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

    public void fillGas(double gas) {
        if (this.gas + gas <= this.capacity) {
            this.gas += gas;
        } else {
            this.gas = capacity;
        }
    }

    private double maxDistance() {
        return gasConsume * gas;
    }

    public void move(double distance) {
        double maxDistance = maxDistance();
        if (distance <= maxDistance) {
            this.distance += distance;
        } else {
            this.distance += maxDistance;
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

    public double travel() {
        return distance;
    }

    public double getGas() {
        return gas;
    }

    public int comparePerformance(Car car) {
        return (this.distance < car.distance) ? 1 :
                (this.gas < car.gas) ? 1 :
                        (this.gasConsume < car.gasConsume) ? 1 : 0;
    }
}

