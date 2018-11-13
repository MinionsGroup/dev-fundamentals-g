
public class Auto {
	
	double gas = 0.0;
	double fullGas = 60.5666;
	double distancia = 0.0;
	boolean powerOn = false;
	boolean spentGas = false;
	// this is position X, Y is considered as 0
	int positionX = 0;
	
	public Auto(int x, double gasAuto){
		positionX = x;
		gas = gasAuto;
		powerOff();
	}
	
	public void powerOff() {
		powerOn = false;
	}
	
	public void powerOn() {
		powerOn = true;
		
	}
	
	// 16 gallons. → Full tank; 60.5666 liters
	public boolean fullGas() {
		boolean flagGas = false;
		if(gas == fullGas || gas != 0.0) {
			flagGas = true;
		}
		return flagGas;
	}
	
	public void avanzar(double distance) {
		if (canMove()) {
			nextPositionX(distance );
			spentGas(spentGas = true, distance);
		}
	}
	
	private void spentGas(boolean spentGas, double distance) {
		if(spentGas){
			gas = gas - ((gas/distance)*100) ;
		}
	}
	
	
	public boolean canMove() {
		boolean move = false;
		if(fullGas() == true && powerOn == true) {
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

