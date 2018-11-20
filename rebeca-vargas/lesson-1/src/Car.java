public class Car {
    private double gas;
    private double distance;
    private boolean isPowerOn;
    private double maxConsume;
    private double maxGas;
    private double recorrido;

    public Car(double gas, double distance, boolean isPowerOn, double maxConsume, double maxGas) {
        this.gas = gas;
        this.distance = distance;
        this.isPowerOn = isPowerOn;
        this.maxConsume = maxConsume;
        this.maxGas = maxGas;
        this.recorrido = 0;
    }

    //test
    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public double getMaxConsume() {
        return maxConsume;
    }

    public void setMaxConsume(double maxConsume) {
        this.maxConsume = maxConsume;
    }

    public double getMaxGas() {
        return maxGas;
    }

    public void setMaxGas(double maxGas) {
        this.maxGas = maxGas;
    }

    public void powerOn() {
        this.isPowerOn = true;
    }

    public void powerOff() {
        this.isPowerOn = false;
    }

    public void fillGas() {
        while (this.gas < this.maxConsume) {
            this.gas = gas + 1;
        }
    }

    public void move(double distance) {
        fillGas();
        while ((gas > 0) && (recorrido < distance)) {
            gas = gas - maxConsume;
            recorrido = recorrido + 1;
        }
    }
}