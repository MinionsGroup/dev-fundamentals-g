public class Main {

    public static void main(String[] args) {
        Auto carA = new Auto(50, 0.05);
        Auto carB = new Auto(30, 0.03);
        Auto carC = new Auto(80, 0.23);
        carA.FillGasolina(40);
        carB.FillGasolina(30);
        carC.FillGasolina(80);
        carA.PowerOn();
        carB.PowerOn();
        carC.PowerOn();
        carA.Move(600);
        carA.ShowCurentCarInformation();
        carA.Move(300);
        carB.Move(81);
        carC.Move(24);
        carA.ShowCurentCarInformation();
    }
}
