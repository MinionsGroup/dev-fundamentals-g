import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setMaxConsume(0.1);
        car2.setMaxConsume(0.12);
        car3.setMaxConsume(0.18);

        car1.setMaxGas(40);
        car2.setMaxGas(30);
        car3.setMaxGas(50);

        System.out.println("Enter the distance: ");
        Scanner scanner = new Scanner(System.in);
        car1 = scanner.nextInt();
        car2 = scanner.nextInt();
        car3 = scanner.nextInt();

        File file = new File("setGas.txt");
        Scanner fileScanner = new Scanner(file);

        car1.setGas(25);
        car2.setGas(9);
        car3.setGas(14);

        car1.setPowerOn(false);
        car2.setPowerOn(false);
        car3.setPowerOn(false);

    }
}
