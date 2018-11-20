import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        //distance , distancia ingresada como argumento
        double distance=0.0;
        if(args.length==0) {
            System.out.println("Please specify a distance");
        }
        else {
            distance = Double.parseDouble(args[0]);
        }
        /*
        Create the 3 Car object and Set the fields
        Gas-->          gasolina en litros
        performance-->  distancia/gasolina =cantidad de kilómetros recorridos por litro de gasolina
        MaxGas-->       maxima capacidad del tanque de gasolina
        */

        //rendimiento de cada uno de los 3 carros ingresados pos terminal
        //

        System.out.println("Enter performance for the first car: ");
        Scanner scanner = new Scanner(System.in);
        double performanceCar1 = scanner.nextDouble();

        System.out.println("Enter performance for the second car: ");
        double performanceCar2 = scanner.nextDouble();

        System.out.println("Enter performance for the third car: ");
        double performanceCar3 = scanner.nextDouble();

        // Leer Gas desde un archivo
        double Gas=0.0;
        try {
            File file = new File("GAS.txt");
            Scanner fileScanner = new Scanner(file);
            Gas=fileScanner.nextDouble();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Creamos los 3 objetos car
        Car Chevrolet = new Car(Gas,performanceCar1,20);
        Car Nissan = new Car(Gas,performanceCar2,20);
        Car Suzuki = new Car(Gas,performanceCar3,20);

        //encendemos los 3 vehiculos
        Chevrolet.power_On();
        Nissan.power_On();
        Suzuki.power_On();

        //enviamos la distancia que queremos q se mueva
        Chevrolet.move(distance);
        Nissan.move(distance);
        Suzuki.move(distance);

        //mostramos la cantidad de gasolina restante despues de moverse
        double currentGas;
        currentGas=Chevrolet.getGas();
        String currentGasCar1 = Double.toString(currentGas);
        System.out.println("first car gas: "+currentGasCar1);
        currentGas=Nissan.getGas();
        String currentGasCar2 = Double.toString(currentGas);
        System.out.println("second car gas: "+currentGasCar2);
        currentGas=Suzuki.getGas();
        String currentGasCar3 = Double.toString(currentGas);
        System.out.println("third car gas: "+currentGasCar3);

    }
}
