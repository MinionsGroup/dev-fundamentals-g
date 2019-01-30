import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import Car.Car;

public class MainCar {
	
	public static void main(String[] args) {
		double distanceValue;
		String line = "";
			System.out.println("Enter the each distance for three cars:");
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a distance e.g. 70.5 :");
		    distanceValue = scanner.nextDouble();		    
			Car carOne = new Car (0,distanceValue);
			
			System.out.print("Enter a distance e.g. 70.5 :");
		    distanceValue = scanner.nextDouble();
		    Car carTwo = new Car (0,distanceValue);
		    
		    System.out.print("Enter a distance e.g. 70.5 :");
		    distanceValue = scanner.nextDouble();
		    Car carThree = new Car (0,distanceValue);
		    
		    
		    File file = new File("gasFile.txt");
		    try {
		    Scanner fileGasScanner = new Scanner(file);
		    	while (fileGasScanner.hasNextLine()) {
		    	   line = fileGasScanner.nextLine();
		    	}
		    	
			    carOne.loadGas(line);
			    carTwo.loadGas(line);
			    carThree.loadGas(line);
			    }catch(IOException e) {
					e.printStackTrace();
				}
		    
			carOne.powerOn();
			carTwo.powerOn();
			carThree.powerOn();
			
			carOne.move();
			System.out.println("position car One :"+carOne.getCurrentPosition());
			System.out.println("performance car One :"+carOne.performaceCar());
			carTwo.move();
			System.out.println("position car two :"+carTwo.getCurrentPosition());
			System.out.println("performance car two :"+carTwo.performaceCar());
			carThree.move();
			System.out.println("position car three :"+carThree.getCurrentPosition());
			System.out.println("performance car three :"+carThree.performaceCar());
	}

}
