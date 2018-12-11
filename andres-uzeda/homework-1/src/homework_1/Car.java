package homework_1;

import static java.lang.Math.abs;

public class Car {
    private double gas;
    private double kilometersDistanceToMove;
    private boolean power;
    private double kilometersGasConsume;

    public double getGas() {
        return gas;
    }

    public double getKilometersDistanceToMove() {
        return kilometersDistanceToMove;
    }

    public boolean getPower() {
        return power;
    }

    public double getKilometersGasConsume() {
        return kilometersGasConsume;
    }

    public Car( double kilometersGasConsume) {
        this.kilometersDistanceToMove = 0;
        this.kilometersGasConsume = kilometersGasConsume;
        this.power = false;
        this.gas = 0;
    }

    public void powerOn() {
        power = true;
    }

    public void powerOff() {
        power = false;
    }

    public void fillUpGas(double gas) {
            this.gas = gas;
            kilometersDistanceToMove = this.gas/kilometersGasConsume;
    }

    public void move(double distance){
        if(power == true){
            moveADistance(distance);
        }else{
            System.out.println("The car is Off");
        }
    }

    private void moveADistance(double distance){
        if(isTheTankEmpty() == true){
            System.out.println("The car doesn't have gas");
        }else{
            if(kilometersDistanceToMove >= distance){
                kilometersDistanceToMove -= distance;
                System.out.println("The car move a distance: " + distance);
            }else{
                System.out.println("The car stopped at " + abs(forceToMove(distance)) + " kilometers of the objective ");
            }
        }
    }

    private double forceToMove(double distance){
        return distance - kilometersDistanceToMove;
    }

    private boolean isTheTankEmpty(){
        if(kilometersDistanceToMove == 0){
            return true;
        }else{
            return false;
        }
    }

}
