public class Main {
    public static void main(String[] args){
        //Create Car Objects
        CarBehavior myCarBehavior = new CarBehavior();

        CarBehavior.Car Suzuki = new CarBehavior.Car();
        Suzuki.name = "Suzuki";
        Suzuki.fuel_capacity = 100;
        Suzuki.maximum_distance_with_full_tank = 1000;
        myCarBehavior.addCar(Suzuki);

        CarBehavior.Car Chevrolet = new CarBehavior.Car();
        Chevrolet.name = "Chevrolet";
        Chevrolet.fuel_capacity = 201;
        Chevrolet.maximum_distance_with_full_tank = 2000;
        myCarBehavior.addCar(Chevrolet);

        CarBehavior.Car Ford = new CarBehavior.Car();
        Ford.name = "Ford";
        Ford.fuel_capacity = 150;
        Ford.maximum_distance_with_full_tank = 2000;
        myCarBehavior.addCar(Ford);

        // Add fuel and distance
        double fuel = 100;
        double distance = 1000;


        System.out.println("***********************************************");
        myCarBehavior.addFuel(Suzuki,fuel);
        myCarBehavior.powerOn(Suzuki);
        myCarBehavior.moveAutomobile(Suzuki,distance);
        System.out.println("***********************************************");




        System.out.println("***********************************************");
        myCarBehavior.addFuel(Chevrolet,fuel);
        myCarBehavior.powerOn(Chevrolet);
        myCarBehavior.moveAutomobile(Chevrolet,distance);
        System.out.println("***********************************************");


        System.out.println("***********************************************");
        myCarBehavior.addFuel(Ford,fuel);
        myCarBehavior.powerOn(Ford);
        myCarBehavior.moveAutomobile(Ford,distance);
        System.out.println("***********************************************");


        myCarBehavior.searchWin(distance);






    }
}
