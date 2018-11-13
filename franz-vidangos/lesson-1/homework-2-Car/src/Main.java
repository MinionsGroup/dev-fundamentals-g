public class Main {
    public static void main(String [] args){

        //distancia que recorreran los 3 carros en Km
        double distance=100.0;

        /*
        Create the 3 Car object and Set the fields
        Gas-->          gasolina en litros
        performance-->  distancia/gasolina =cantidad de kilómetros recorridos por litro de gasolina
        MaxGas-->       maxima capacidad del tanque de gasolina
        */
        Car Chevrolet = new Car(10.5,12.0,20);
        Car Nissan = new Car(15.2,10.0,20);
        Car Suzuki = new Car(9.6,13.0,20);

        //encendemos los 3 vehiculos
        Chevrolet.power_On();
        Nissan.power_On();
        Suzuki.power_On();

        //enviamos la distancia que queremos q se mueva
        Chevrolet.move(distance);
        Nissan.move(distance);
        Suzuki.move(distance);

        //mostramos la cantidad de gasolina restante despues de moverse
        double currentGas;
        currentGas=Chevrolet.getGas();
        System.out.println(currentGas);
        currentGas=Nissan.getGas();
        System.out.println(currentGas);
        currentGas=Suzuki.getGas();
        System.out.println(currentGas);

    }
}
