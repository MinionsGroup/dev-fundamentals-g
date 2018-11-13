public class Car {
    private double Gas;                 //gasolina en litros
    private boolean PowerOn=false;      //estado de encendido/apagado del vehiculo
    private double performance;         // distancia/gasolina =cantidad de kilómetros recorridos por litro de gasolina
                                        // gasolina/distancia = cantidad de gasolina utilizada por cada kilómetro recorrido
    private double MaxGas;              //maxima capacidad del tanque de gasolina
    // Constructor
    Car(double Gas,double performance,double MaxGas){
        this.Gas = Gas;
        this.performance = performance;
        this.MaxGas = MaxGas;
    }
    //encender
    public void power_On(){
        this.PowerOn = true;
    }
    //apagar
    public void power_Off(){
        this.PowerOn = false;
    }
    //llenar gas
    public void fillGas(double fill){
        double Max=0;
        Max=Gas+fill;
        if (Max>=MaxGas){
            Gas=MaxGas;
        }
        else Gas=Max;
    }
    //mover
    public void move(double Distance){
        double MaxDistance;
        if (PowerOn==true){
            MaxDistance=maxMove();
            if (Distance>=MaxDistance){
                Gas=0.0;
            }
            else{
                Gas=Gas-(1/performance)*Distance;
            }
        }
    }
    // devuelve la distancia maxima que se puede mover
    private double maxMove(){
        double MaxDistance;
        MaxDistance=Gas*performance;
        return MaxDistance;
    }
    //devuelve la cantidad de gasolina
    public double getGas(){
        return Gas;
    }

}

