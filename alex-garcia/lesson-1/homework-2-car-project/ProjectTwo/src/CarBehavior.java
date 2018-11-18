//https://vehiculos.doncomos.com/calcular-consumo-gasolina

class CarBehavior {
    static class Car {
        private String name;
        double fuelCapacity;
        double fuel;
        double maximumDistanceWithFullTank;
        double distance;
        boolean status;

        public void setName(String name) {
            this.name = name;
        }

        public void setFuelCapacity(double fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }

        public void setMaximumDistanceWithFullTank(double maximumDistanceWithFullTank) {
            this.maximumDistanceWithFullTank = maximumDistanceWithFullTank;
        }
    }

    //Fields:
    private  Car [] automobile;
    private int automobileCount;

    //Constructor;
    CarBehavior(){
        automobile = new Car[3];
        automobileCount = 0;
    }

    // Methods:
    void addCar(Car car){
        automobile[automobileCount] = car;
        automobileCount++;
    }

    void powerOn(Car car){
        if (car.fuel == 0){
            car.status = false;
            System.out.println(car.name +": No fuel, this car can not be turned on");
        }
        else {
            car.status = true;
            System.out.println(car.name +": power on");
        }

    }

    private void powerOff(Car car){
        car.status = false;
        System.out.println(car.name +": power off");
    }

    void addFuel(Car car, double fuel){
        if(car.fuelCapacity < fuel){
            System.out.println(car.name+": The tank will explode with that volume of fuel");
        }
        else {
            car.fuel = car.fuel + fuel;
            if (car.fuelCapacity < car.fuel){
                car.fuel = car.fuel - fuel;
                System.out.println(car.name+": The tank will explode with that volume of fuel");
            }
            else {
                System.out.println(car.name+": Add "+car.fuel+" liter");
            }

        }
    }

    double moveAutomobile(Car car, double distance){
        double remaining_distance;
        if (!car.status){
            System.out.println(car.name+": You must power on car");
        }
        else if (maxDistanceWithActualFuel(car) < distance){
            System.out.println(car.name+": This car can move: " + maxDistanceWithActualFuel(car) +
                    " km with "+ car.fuel+" liter");
            System.out.println(car.name+": This car does not have enough fuel to compete in a "+ distance +" km race");
            powerOff(car);
        }
        else if (maxDistanceWithActualFuel(car) >= distance){
            System.out.println(car.name+": This car can move: " + maxDistanceWithActualFuel(car) +
                    " km with "+ car.fuel+" liter");
            remaining_distance = maxDistanceWithActualFuel(car) - distance;
            car.distance = distance;
            car.fuel = literPerDistance(car) * remaining_distance;
            System.out.println(car.name+": This car moved: " + car.distance + " km then this one has "
                    + car.fuel + " liters");
            powerOff(car);

        }
        return car.fuel;
    }

    private double maxDistanceWithActualFuel(Car car){
        return distancePerLiter(car) * car.fuel;
    }

    private double distancePerLiter(Car car){
        return car.maximumDistanceWithFullTank /car.fuelCapacity;
    }

    private double literPerDistance(Car car){
        return car.fuelCapacity /car.maximumDistanceWithFullTank;
    }

    Car searchWin(double distance) {
        double minorFuel, majorFuel;
        String win, loser;
        minorFuel = majorFuel = automobile[0].fuel;
        win = loser = null;
        for (int i=0; i<automobileCount; i++){
            if(automobile[i].fuel > majorFuel && automobile[i].distance == distance){
                majorFuel = automobile[i].fuel;
                win = automobile[i].name;
            }
            if (automobile[i].fuel <= minorFuel && automobile[i].distance == distance) {
                minorFuel = automobile[i].fuel;
                loser = automobile[i].name;
            }
            if (automobile[i].distance == 0){
                System.out.println(automobile[i].name + " did not participate in the race");
            }
        }
        System.out.println("The win is " + win + " with " + majorFuel + " liter");
        System.out.println("The loser is " + loser + " with " + minorFuel + " liter");
        return null;
    }
}
