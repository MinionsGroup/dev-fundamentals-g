import java.util.Scanner;

public class Car {
    private double gas = 0;
    private double distance = 0;

    public Car(double gas){
        this.gas = gas;
    }

    public void setGas(double gas){
        this.gas = gas;
    }

    public double getGas(){
        return gas;
    }

    public void setDistance(double distance){
        this.distance = distance;
    }

    public double getDistance(){
        return distance;
    }

    public void fillGas(double newGasAmount){
        setGas(newGasAmount);
    }

    public boolean canMove(){
        if(getGas() != 0){
            return true;
        }
        return false;
    }

    public static double askDoubleValue(String message){
        Scanner text = new Scanner(System.in);
        System.out.print(message);
        double value = text.nextDouble();
        return value;
    }

    public static void calculateDistance(Car[] cars, double performance){
        for(Car car:cars){
            if(car.canMove()){
                double distance = performance * car.gas;
                car.setDistance(distance);
            }
        }
    }

    public static void main(String[] args){
        Car car1 = new Car(2.5);
        Car car2 = new Car(0);
        Car car3 = new Car(5);
        double performance = askDoubleValue("Enter car performance KM/L: ");
        Car[] cars = {car1, car2, car3};
        calculateDistance(cars, performance);
        System.out.println("Using " + performance + " as car performance");
        for(Car car:cars){
            System.out.println("For gas = " + car.getGas() + " the distance is " + car.getDistance() + " KMs");
        }
    }

}
