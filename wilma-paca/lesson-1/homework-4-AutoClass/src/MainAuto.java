import Automovil.Auto;
public class MainAuto {
	
	public static void main(String[] args) {
		Auto carOne = new Auto (0,50.23);
		Auto carTwo = new Auto (0,10.23);
		Auto carThree = new Auto (0,0.0);
		
		carOne.powerOn();
		carTwo.powerOn();
		carThree.powerOn();
		
		carOne.avanzar(10);
		System.out.println("position car One :"+carOne.getCurrentPosition());
		carTwo.avanzar(15);
		System.out.println("position car two :"+carTwo.getCurrentPosition());
		carThree.avanzar(2);
		System.out.println("position car three :"+carThree.getCurrentPosition());
	}

}
