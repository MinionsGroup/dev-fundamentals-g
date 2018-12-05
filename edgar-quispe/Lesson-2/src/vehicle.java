import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class vehicle {
    private double gas;
    private double mileage;
    private boolean powerOn;
    private double performance;

    public vehicle(final double gas, final double mileage, final double performance) {
        this.gas = gas;
        this.mileage = mileage;
        this.powerOn = powerOn;
        this.performance = mileage / performance;
    }

    public vehicle(String carFile) throws FileNotFoundException {
        loadGasAndMileageFromFile(carFile);
        this.powerOn = false;
        this.performance = mileage / performance;
    }

    public void setPerformance(double performance) {
        this.performance = mileage / performance;
    }

    public void powerOn() {
        powerOn = true;
    }

    public void powerOff() {
        powerOn = false;
    }

    public void fillGas(final double countGas) {
        gas += countGas;
    }

    public void move(final double distance) {
        System.out.println();
        for (int mileage = 0; mileage < distance * 2; mileage++) {

            if (mileage > (gas * performance)) {
                System.out.print("o^o");
                return;
            }
            System.out.print("_ ");
        }
        System.out.print("o^o");
    }

    private void loadGasAndMileageFromFile(String carFile) throws FileNotFoundException {
        File file = new File(carFile);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains("Gas")) {
                this.gas = Double.valueOf(line.split("=")[1]);
            }
            if (line.contains("Mileage")) {
                this.mileage = Double.valueOf(line.split("=")[1]);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("*********Instructions:*********");
        System.out.println(" Each '_' is 0.5 mileage.");
        System.out.println(" 1   2   3   4   5   6   7   8   9  10  11   12   13   14   15   16   17   18   19   20.....KMs");
        vehicle car01 = new vehicle(10, 1.5, 0.3);
        car01.powerOn();
        car01.move(10);

        vehicle car02 = new vehicle(10, 1.5, 0.5);
        car02.powerOn();
        car02.move(10);

        vehicle car03 = new vehicle(10, 1, 1);
        car03.powerOn();
        car03.move(10);


        System.out.println();
        System.out.println("************************************************************************************");
        System.out.println("****************** Task - Instance Gas and Mileage from file ***********************");

        /** Instance Cars.  **/
        vehicle car04 = new vehicle("/home/edgar/Escritorio/intellijproyectos/starlet01.txt");
        vehicle car05 = new vehicle("/home/edgar/Escritorio/intellijproyectos/starlet02.txt");
        vehicle car06 = new vehicle("/home/edgar/Escritorio/intellijproyectos/starlet03.txt");

        /** Set Car`s performances.  **/
        car04.setPerformance(putPerformanceFromConsole("Car 04"));
        car05.setPerformance(putPerformanceFromConsole("Car 05"));
        car06.setPerformance(putPerformanceFromConsole("Car 06"));

        /** PowerOn the Cars. **/
        car04.powerOn();
        car05.powerOn();
        car06.powerOn();

        /** Set Distance to Move the cats. **/
        car04.move(10);
        car05.move(10);
        car06.move(10);

    }

    public static double putPerformanceFromConsole(String carName) {
        System.out.println(String.format("Put the Performance to: %s ", carName));
        Scanner scanner = new Scanner(System.in);
        String performance = scanner.nextLine();
        return Double.valueOf(performance);
    }
}
