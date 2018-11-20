import java.util.Scanner;

import javax.xml.crypto.dsig.CanonicalizationMethod;

public class Main {

	public static Car[] readData(int totalCars, double gas) {
		Car cars[] = new Car[totalCars];
		Scanner scanner;
		String model = " ";
		double gas_consume = 0;
		for (int index = 0; index < totalCars; index++) {
			System.out.println("Enter the model of your car: ");
			scanner = new Scanner(System.in);
			model = scanner.nextLine();

			System.out.println("Enter the gas consume of your car: ");
			scanner = new Scanner(System.in);
			gas_consume = scanner.nextDouble();

			cars[index] = new Car(model, 100, gas_consume);
			cars[index].fillGas(gas);
		}

		return cars;
	}

	public static void main(String[] args) {

		int distance = 0;
		boolean canExecute = false;
		double gas = 0;

		// checks data from args
		if (args.length == 0) {
			System.out.println("Please enter a distance.");
		} else {
			try {
				distance = Integer.valueOf(args[0]);
				canExecute = true;
			} catch (Exception e) {
				System.out.println("Please enter only numbers.");
				canExecute = false;
			}
		}

		if (canExecute) {

			// reads gas from file
			FileGas file = new FileGas("gas.txt");
			gas = file.getGas();

			// reads gas_consume
			Car[] cars = readData(3, gas);

			/*
			 * Car firstCar = new Car("Audi", 100, 2); Car secondCar = new
			 * Car("Mercedes", 300, 40); Car thirdCar = new Car("Volvo", 500,
			 * 10);
			 * 
			 * firstCar.fillGas(gas); secondCar.fillGas(gas);
			 * thirdCar.fillGas(gas);
			 */

			cars[0].move(distance);
			cars[1].move(distance);
			cars[2].move(distance);

			cars[0].showStatus();
			cars[1].showStatus();
			cars[2].showStatus();
		}

	}

}
