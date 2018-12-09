package lesson_1.Homework_lesson1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Daniel Cabero
 *
 * @since 13/11/2018.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Car car1 = new Car(10.00, 2.00, 15.00);
       Car car2 = new Car(15.00, 5.00, 20.00);
        Car car3 = new Car(20.00, 10.00, 100.00);

        System.out.println("The car number 1 moving :" + car1.move(10) + "KM");
        System.out.println("The car number 2 moving :" + car2.move(10) + "KM");
        System.out.println("The car number 3 moving :" + car3.move(10) + "KM");

        System.out.println("Enter gas that use all cars: ");
    }
}
