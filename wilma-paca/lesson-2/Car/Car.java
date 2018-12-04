import java.io.*; 

public class Car {
	
	double gas = 0.0;
	double fullGas = 60.5666;
	double distance = 0.0;
	boolean ispowerOn = false;
	boolean spentGas = false;
	// this is position X, Y is considered as 0
	int positionX = 0;

	public Car(int x, double distanceCar){
		positionX = x;
		distance = distanceCar;
		powerOff();
	}
	
	public void powerOff() {
		ispowerOn = false;
	}
	
	public void powerOn() {
		ispowerOn = true;
		
	}
	
	// 16 gallons. → Full tank; 60.5666 liters
	public boolean fullGas() {
		boolean flagGas = false;
		if(gas == fullGas || gas != 0.0) {
			flagGas = true;
		}
		return flagGas;
	}
	
	public void loadGas(String gasData) {			
		gas = Double.parseDouble(gasData);
		
	}
	
	public void move() {
		if (canMove()) {
			nextPositionX(distance );
			spentGas(spentGas = true, distance);
		}
	}
	
	private void spentGas(boolean spentGas, double distance) {
		if(spentGas){
			gas = gas - ((gas/distance)*1000) ;
		}
	}
	
	public double performaceCar() {
		
		double	performance = Math.abs(((distance/gas)*100)) ;		
		return performance;
		
	}
	
	
	public boolean canMove() {
		boolean move = false;
		if(fullGas() == true && ispowerOn == true) {
			move = true;
		}
		return move;
	}
	
	public void nextPositionX(double distance ) {		
		positionX = positionX+ (int)distance;
	}
	
	public int getCurrentPosition() {
		return positionX;
	}
	

}

