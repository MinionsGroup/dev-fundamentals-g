package homework_1;

public class Main {
    public static void main(String[] args){
        Car firstCar = new Car(2.2);
        Car secondCar = new Car(3.2);
        Car thirdCar = new Car(1.2);
        double aDistance = 60;
        firstCar.fillUpGas(120);
        secondCar.fillUpGas(120);
        thirdCar.fillUpGas(120);
        firstCar.powerOn();
        secondCar.powerOn();
        thirdCar.powerOn();
        System.out.println("Cars will start to move");
        firstCar.move(aDistance);
        secondCar.move(aDistance);
        thirdCar.move(aDistance);
        System.out.println("Cars was moved");
    }
}
