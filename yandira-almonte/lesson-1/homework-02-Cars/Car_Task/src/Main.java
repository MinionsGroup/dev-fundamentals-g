
public class Main {
	
	public static void main(String[] args) {

		Car firstCar= new Car("Audi", 100, 2);
		Car secondCar= new Car("Mercedes", 300, 40);
		Car thirdCar= new Car("Volvo", 500, 10);
		
		firstCar.fillGas(1);
		secondCar.fillGas(40);
		thirdCar.fillGas(10);
		
		firstCar.move(1000);
		secondCar.move(1000);
		thirdCar.move(1000);
		
		firstCar.fillGas(1);
		secondCar.fillGas(20);
		thirdCar.fillGas(60);
		
		firstCar.move(10);
		secondCar.move(10);
		thirdCar.move(10);
		
		firstCar.showStatus();
		secondCar.showStatus();
		thirdCar.showStatus();

	}
	
	
	
	
}
