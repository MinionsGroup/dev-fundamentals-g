import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Car {
    private double gas;
    private double distance;
    private double performance;
    private boolean powerOn;

    public Car(){
        gas = 0;
        distance = 0;
        performance = 0;
        powerOn = false;
    }

    public void setPerformance(double performance){
        this.performance = performance;
    }

    public double getPerformance(){
        return performance;
    }

    public void setGas(double gas){
        this.gas = gas;
    }

    public double getGas(){
        return gas;
    }

    public double getDistance(){
        return distance;
    }

    public boolean getPowerOn(){
        return powerOn;
    }

    public void move(double gas, double distance, double performance){
        double usedGas = distance / performance;
        if(gas > usedGas){
            this.gas = gas - usedGas;
            double distanceMoved = performance * gas;
            this.distance += distanceMoved;
            this.powerOn = true;
        }
        else{
            double distanceMoved = performance * gas;
            this.distance += distanceMoved;
            this.powerOn = false;
        }
    }

    private static double askDoubleValue(String message){
        Scanner text = new Scanner(System.in);
        System.out.print(message);
        double value = text.nextDouble();
        return value;
    }

    private static ArrayList readAndGetValues(){
        File file = new File("gasValues.txt");
        ArrayList<Double> gasValues = new ArrayList<>();
        try{
            Scanner in = new Scanner(file);
            while (in.hasNextLine()){
                double i = in.nextDouble();
                gasValues.add(i);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return gasValues;
    }

    private static void setGasValues(Car[] cars, ArrayList<Double> gasValues) {
        if(gasValues.size() >= cars.length){
            for(int carNumber = 0; carNumber<cars.length; carNumber++){
                double gasValueForCar = gasValues.get(carNumber);
                cars[carNumber].setGas(gasValueForCar);
            }
        }
    }

    public static void main(String[] args){

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car[] cars = {car1, car2, car3};


        ArrayList<Double> gasValues = readAndGetValues();
        setGasValues(cars, gasValues);

        //Read car performance for each car
        for(int carNumber=0; carNumber<cars.length; carNumber++){
            int newIndex = carNumber + 1;
            double carPerf = askDoubleValue("Enter car " + newIndex + " performance in KM/L: ");
            cars[carNumber].setPerformance(carPerf);
        }

        while (true){
            //This is the distance that car should move
            double distance = askDoubleValue("Enter distance to drive: ");
            //Set same distance to all cars
            for(Car car:cars){
                car.move(car.getGas(), distance, car.getPerformance());
            }

            //Printing results
            for(int carNumber=0; carNumber<cars.length; carNumber++){
                int newIndex = carNumber + 1;
                if(cars[carNumber].getPowerOn()){
                    System.out.println("Car " + newIndex + " reached distance, you have " + cars[carNumber].getGas() + "L in your gas tank");
                }
                else{
                    System.out.println("Car " + newIndex + " didn't reach distance, Total distance " + cars[carNumber].getDistance() + " KMs");
                }
            }
        }
    }
}
