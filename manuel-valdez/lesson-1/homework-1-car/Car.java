package lesson_1.exercise_1_contacts.homework_1_car;

public class Car {
    private double gas;
    private double distance;
    private boolean isPowerOn;
    private double maxGas;    
    private double distanceMoved;

    public Car(double maxGas, double distance) {
        this.isPowerOn = false;
        this.maxGas = maxGas;
        this.gas = 0;
        this.distance = distance;
        this.distanceMoved = 0;
    }

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

    public double getMaxGas() {
        return maxGas;
    }

    public void setMaxGas(double maxGas) {
        this.maxGas = maxGas;
    }

    public double getDistanceMoved() {
        return distanceMoved;
    }

    public void setDistanceMoved(double distanceMoved) {
        this.distanceMoved = distanceMoved;
    }

    public void powerOn() {
        this.isPowerOn = true;
    }

    public void powerOff() {
        if (isPowerOn) {
            this.isPowerOn = false;
        }
    }

    public void fillGas(double amountOfGas) {
        if(amountOfGas < this.maxGas - this.gas) {
            this.gas += amountOfGas;
        }
    }

    public void move(double distanceToMove) {
        if(this.isPowerOn && canMove(distanceToMove)) {
            double gasUsed = distanceToMove / this.distance;
            updateCarDistanceMoved(gasUsed, distanceToMove);
            updateCarGas(gasUsed);
        }
    }

    private void updateCarGas(double gasUsed) {
        if(gasUsed < this.gas) {
            this.gas-= gasUsed;
        }
        else {
            this.gas = 0;
        }
    }

    private void updateCarDistanceMoved(double gasUsed, double distanceToMove) {
        if(gasUsed < this.gas) {
            this.distanceMoved = distanceToMove;
        }
        else {
            this.distanceMoved = this.gas * this.distance;
        }
    }

    private boolean canMove(double distance) {
        return this.gas > 0;
    }
}
