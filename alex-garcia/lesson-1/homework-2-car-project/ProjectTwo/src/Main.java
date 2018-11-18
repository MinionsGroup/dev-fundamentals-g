public class Main {
    public static void main(String[] args){
        // Add fuel and distance
        double fuel = 100;
        double distance = 1000;

        //Create Car Objects
        CarBehavior myCarBehavior = new CarBehavior();

        CarBehavior.Car suzuki = new CarBehavior.Car();
        suzuki.setName("Suzuki");
        suzuki.setFuelCapacity(100);
        suzuki.setMaximumDistanceWithFullTank(1000);
        myCarBehavior.addCar(suzuki);

        CarBehavior.Car chevrolet = new CarBehavior.Car();
        chevrolet.setName("Chevrolet");
        chevrolet.setFuelCapacity(201);
        chevrolet.setMaximumDistanceWithFullTank(2000);
        myCarBehavior.addCar(chevrolet);

        CarBehavior.Car ford = new CarBehavior.Car();
        ford.setName("Ford");
        ford.setFuelCapacity(150);
        ford.setMaximumDistanceWithFullTank(2000);
        myCarBehavior.addCar(ford);

        // Starting cars
        System.out.println("***********************************************");
        myCarBehavior.addFuel(suzuki,fuel);
        myCarBehavior.powerOn(suzuki);
        myCarBehavior.moveAutomobile(suzuki,distance);
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        myCarBehavior.addFuel(chevrolet,fuel);
        myCarBehavior.powerOn(chevrolet);
        myCarBehavior.moveAutomobile(chevrolet,distance);
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        myCarBehavior.addFuel(ford,fuel);
        myCarBehavior.powerOn(ford);
        myCarBehavior.moveAutomobile(ford,distance);
        System.out.println("***********************************************");

        //Search Win
        myCarBehavior.searchWin(distance);






    }
}
