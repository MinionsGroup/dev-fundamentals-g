import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Auto> cars = new ArrayList<Auto>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce the distance: ");
        double distance = scanner.nextDouble();
        int count = 0;

        try{
            Auto carD = new Auto();
            FileInputStream fstream = new FileInputStream("gasInfo.csv");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
                carD.PowerOn();
                carD.Move(distance);
                carD.SetGas(Double.parseDouble(strLine));
                // Print the content on the console
                System.out.println (strLine);
                System.out.println("Please introduce the performance: ");
                double performance = scanner.nextDouble();
                carD.setPerformance(performance);
                cars.add(carD);
            }

            br.close();
        } catch(IOException e){

        }
        if(!cars.isEmpty())
        {
            double generalPerformance = (cars.get(0).getPerformance() + cars.get(1).getPerformance())/2;
            for (Auto c: cars)
            {
                c.setPerformance(generalPerformance);
                c.Move();
                c.ShowCurentCarInformation();
            }

        }
    }
}
