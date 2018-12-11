import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> garage = new ArrayList<>();

        double distance = 48;

        Car suzuki = new Car(26, 3);
        suzuki.powerOn();
        suzuki.loadGas(15);

        Car ford = new Car(40, 2.5);
        ford.powerOn();
        ford.loadGas(20);

        Car honda = new Car(30, 5.3);
        honda.powerOn();
        honda.loadGas(52);

        garage.add(suzuki);
        garage.add(ford);
        garage.add(honda);

        System.out.println("There are the stadistics of the cars: ");
        for (Car c : garage) {
            c.move(distance);
            System.out.println(String.format("The max distance of the car is %fKm after to drive %fKm, it has on the tank %fL of gas", c.getMileage(), distance, c.getGas()));
        }
    }
}
