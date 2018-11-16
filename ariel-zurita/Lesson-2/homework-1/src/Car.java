import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.util.Random;

public class Car {
    private double gas;
    private double distance;
    private double performance;

    public Car(){
        gas = 0;
        distance = 0;
    }
    public Car(double gas){
        this.gas = gas;
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

    public void setDistance(double distance){
        this.distance = distance;
    }

    public double getDistance(){
        return distance;
    }

    public boolean canMove(){
        if(getGas() != 0){
            return true;
        }
        return false;
    }

    private static void generatePerformances(Car[] cars){
        for(Car car:cars){
            double rand = new Random().nextDouble();
            double performance = 0.0 + (rand * (100.0 - 0));
            DecimalFormat df = new DecimalFormat("#.#");
            double performanceFormated = Double.parseDouble(df.format(performance));
            car.setPerformance(performanceFormated);
        }
    }

    private static double askDoubleValue(String message){
        Scanner text = new Scanner(System.in);
        System.out.print(message);
        double value = text.nextDouble();
        return value;
    }

    private static void calculateDistance(Car[] cars){
        for(Car car:cars){
            if(car.canMove()){
                double distance = car.getPerformance() * car.getGas();
                car.setDistance(distance);
            }
        }
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
        double distance = askDoubleValue("Enter the distance to drive: ");
        ArrayList<Double> gasValues = readAndGetValues();
        setGasValues(cars, gasValues);
        generatePerformances(cars);
        calculateDistance(cars);
        for(Car car:cars){
            System.out.println("Using " + car.getPerformance() + "KM/L as car performance");
            System.out.println("For gas = " + car.getGas() + " the distance is " + car.getDistance() + " KMs \n");
        }
    }
}
