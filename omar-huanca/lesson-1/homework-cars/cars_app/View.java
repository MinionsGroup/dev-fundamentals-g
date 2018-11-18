package cars_app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * This class is to manage Contacts
 *
 * @author Omar Limbert Huanca Sanchez
 * @version 1.0.
 */
public class View {
    private List<Car> carsList;
    private int index;
    private Scanner scanInput;
    private String inputString;

    /**
     * Constructor for View class
     */
    public View() {
        index = 0;
        scanInput = new Scanner(System.in);
        carsList = new ArrayList<>();
    }

    /**
     * This method is to show main menu
     */
    public void showMainMenu() {
        while (index != 3) {
            System.out.println("==============================");
            System.out.println("Your Car List");
            System.out.println("==============================");
            this.showList();
            System.out.println("==============================");
            System.out.println("Welcome please choose a option");
            System.out.println("==============================");
            System.out.println("(1) Add Car");
            System.out.println("(2) Test Performance");
            System.out.println("(3) Exit");
            try {
                index = Integer.parseInt(scanInput.nextLine());
            } catch (Exception e) {
                index = 0;
            }

            if (index == 1) {
                this.addCarMenu();
            }

            if (index == 2) {
                this.testPerformaceMenu();
            }
            if (index == 3) {
                break;
            }
        }

    }

    /**
     * This method is to show performance menu
     */
    private void testPerformaceMenu() {
        double distance;
        System.out.println("==============================");
        System.out.println("Testing Performance");
        System.out.println("==============================");
        System.out.println("Please Insert a distance:");
        distance = Double.parseDouble(scanInput.nextLine());
        System.out.println("==============================");
        Car winner = this.startPerformanceTest(distance);
        System.out.println("=WINNER= " + winner.getName() + " =WINNER=");
        System.out.println("DISTANCE: " + distance + " KM");
        System.out.println("==============================");
        this.showPerformanceList();
        index = 3;

    }

    /**
     * This method is to show add car menu
     */
    private void addCarMenu() {
        int counter = 0;
        while (index != 0) {
            counter++;
            System.out.println("(.) Enter Point '.' to Exit");
            System.out.println("[" + counter + "] - Please Insert Name: ");
            inputString = scanInput.nextLine();

            if (inputString.equalsIgnoreCase(".")) {
                break;
            }

            // Creating Car
            Car newCar = this.createNewCar(inputString);

            // Adding Car to List
            this.addCarToList(newCar);

            System.out.println("=New Car has been created=");
            System.out.println("Name: " + newCar.getName());
            System.out.println("Gasoline Full: " + newCar.getGasoline() + " [L]");
            System.out.println("==========================");
        }
    }

    /**
     * This method is to show car list
     */
    public void showList() {
        carsList.forEach(car -> System.out.println(car.getName() + " Gasoline: " + car.getGasoline() + " Tank size: " + car.getMaxGasoline()));
    }

    /**
     * This method is to start performance test according distance
     *
     * @param distance is the distance in km to move
     * @return Car
     */
    public Car startPerformanceTest(double distance) {
        // moving distance
        carsList.forEach(car -> car.moveADistanceWithCar(distance));
        // comparing gasoline
        return carsList.stream()
                .max(Comparator.comparing(Car::getGasoline))
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
        Car newCar = new Car();
        newCar.setName(carName);
        newCar.setGasoline(newCar.getMaxGasoline());
        return newCar;
    }

    /**
     * This method is to add a Car in to list of carsList
     *
     * @param carToAdd car to add in the list
     */
    public void addCarToList(Car carToAdd) {
        carsList.add(carToAdd);
    }
}
