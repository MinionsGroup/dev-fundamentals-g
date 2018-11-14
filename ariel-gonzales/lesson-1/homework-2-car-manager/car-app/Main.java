/**
 * Main Class.
 */
public class Main {
    public static void main(String[] args) {

        //Init CarsManager that will contain a list of cars.
        CarsManager garage = new CarsManager();

        //Set the distance that the garage of cars will complete.
        double distance = 20;

        //Car object suzuki.
        Car suzuki = new Car();
        suzuki.setGasCapacity(30);
        suzuki.setGasConsume(2.5);
        suzuki.fillGas(20);
        suzuki.powerOn();
        suzuki.move(distance);
        suzuki.powerOff();

        //Car object mazda.
        Car mazda = new Car();
        mazda.setGasCapacity(25);
        mazda.setGasConsume(3.5);
        mazda.fillGas(50);
        mazda.powerOn();
        mazda.move(distance);
        suzuki.powerOff();

        //Car object ford.
        Car ford = new Car();
        ford.setGasCapacity(15);
        ford.setGasConsume(5.5);
        ford.fillGas(6);
        ford.powerOn();
        ford.move(distance);
        ford.powerOff();

        //Fill garage.
        garage.addCars(mazda);
        garage.addCars(suzuki);
        garage.addCars(ford);

        //Show the stadistics of all the cars into the garage.
        System.out.println("The results of cars: ");
        for (Car c : garage.carsList) {
            System.out.println("The car " + c + " to arrive " + distance + "Km needs " + c.getConsumedGas() + "L of gas ");
        }

        //Show the more efficient car, if the car can complete the distance with less gas is the best.
        Car resp = garage.whoIsTheBest();
        System.out.println("The more efficient car is " + resp + " to complete the " + distance + "Km it only need " + resp.getConsumedGas() + "L of gas ");
    }
}
