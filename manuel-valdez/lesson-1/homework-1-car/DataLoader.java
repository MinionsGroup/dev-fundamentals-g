package lesson_1.exercise_1_contacts.homework_1_car;

import java.util.Scanner;
import java.io.File;

public class DataLoader {
	
	public double loadGas() {
		File file = new File("carGas.txt");
        Scanner scanner = new Scanner(file);
		return Double.parseDouble(scanner.nextLine());
	}
	
	public double carDistance() {
		System.out.println("Fill in with car's distance per gas:");
		Scanner scanner = new Scanner(System.in);
		return Double.parseDouble(scanner.nextLine());
	}	
}
