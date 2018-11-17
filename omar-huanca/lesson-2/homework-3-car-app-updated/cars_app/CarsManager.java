package cars_app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This class is to manage Contacts
 *
 * @author Omar Limbert Huanca Sanchez
 * @version 1.0.
 */
public class CarsManager {
    private List<Car> carsList;

    /**
     * Constructor for CarsManager class
     */
    public CarsManager() {
        carsList = new ArrayList<>();
    }

    /**
     * This method is to add a Contact in to list of carsList
     *
     * @param carToAdd car to add in the list
     */
    public void addCarToList(Car carToAdd) {
        carsList.add(carToAdd);
    }

    /**
     * This method is to start performance test according distance
     *
     * @param distance is the distance in km to move
     * @return Car
     */
    public Car startPerformanceTest(double distance) {
        return carsList.stream()
                .min(Comparator.comparing(car -> car.moveADistanceWithCar(distance)))
                .orElseThrow(NoSuchElementException::new);
    }

    /**
     * This method is to show performance test resume
     */
    public void showPerformanceList() {
        carsList.forEach(car -> {
            System.out.println("Car Name: " + car.getName());
            boolean state = car.getGasoline() > 0;
            System.out.println("Performace Test Passed?: " + state);
            System.out.println("Gasoline per KM: " + car.getGasConsume() + " [L]");
            if (state) {
                System.out.println("Actual Gasoline: " + car.getGasoline() + " [L]");
            } else {
                System.out.println("Actual Gasoline: 0");
            }
            System.out.println("Tank Limit: " + car.getMaxGasoline() + " [L]");
            System.out.println("====================================");
        });
    }

    /**
     * This method is to add a Contact in to list of carsList
     *
     * @param carName new car name
     * @return Car
     */
    public Car createNewCar(String carName) {
        Car newCar = new Car(carName);
        newCar.setGasoline(newCar.getMaxGasoline());
        return newCar;
    }

    /**
     * This method is to show car list
     */
    public void showList() {
        carsList.forEach(car -> System.out.println(car.getName() + " Gasoline: " + car.getGasoline() + " Tank size: " + car.getMaxGasoline()));
    }
}
