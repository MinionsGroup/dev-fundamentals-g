package cars_app;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * This class is to manage Contacts
 *
 * @author Omar Limbert Huanca Sanchez
 * @version 1.0.
 */
public class View {
    private int index;
    private CarsManager carsManager;
    private Scanner scanInput;
    private double distance;
    /**
     * Constructor for View class
     */
    public View() {
        this.index = 0;
        this.carsManager = new CarsManager();
        this.scanInput = new Scanner(System.in);
        this.distance = 0;
    }
    /**
     * Constructor for View class
     *
     * @param distance, This is distance
     */
    public View(double distance) {
        this.index = 0;
        this.carsManager = new CarsManager();
        this.scanInput = new Scanner(System.in);
        this.distance = distance;
    }
    /**
     * This method is to show main menu
     */
    public void showMainMenu() {
        while (index != 3) {
            System.out.println("==============================");
            System.out.println("Your Car List");
            System.out.println("==============================");
            this.carsManager.showList();
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
        System.out.println("==============================");
        System.out.println("Testing Performance");
        System.out.println("==============================");
        if (distance == 0) {
            System.out.println("Please Insert a distance:");
            distance = Double.parseDouble(scanInput.nextLine());
        }
        System.out.println("==============================");
        Car winner = carsManager.startPerformanceTest(distance);
        System.out.println("=WINNER= " + winner.getName() + " =WINNER=");
        System.out.println("DISTANCE: " + distance + " KM");
        System.out.println("==============================");
        carsManager.showPerformanceList();
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
            String inputString = scanInput.nextLine();
            System.out.println("- Please Insert Gasoline consume by KM: ");
            double gasConsume = scanInput.nextDouble();
            if (inputString.equalsIgnoreCase(".")) {
                break;
            }
            // Creating Car
            Car newCar = this.carsManager.createNewCar(inputString);
            newCar.setGasConsume(gasConsume);
            newCar.setGasoline(this.readGasolineFromFile());
            // Adding Car to List
            this.carsManager.addCarToList(newCar);
            System.out.println("=New Car has been created=");
            System.out.println("Name: " + newCar.getName());
            System.out.println("Gasoline Full: " + newCar.getGasoline() + " [L]");
            System.out.println("==========================");
        }
    }
    /**
     * This method is to read Gasoline parameter from file
     */
    private double readGasolineFromFile() {
        String line = "";
        try {
            File file = new File("gasoline.txt");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                line = fileScanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return Double.parseDouble(line);
    }
}