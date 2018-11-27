package com.cars;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public double readGas() throws FileNotFoundException {
        String path = String.format("%s%s", System.getProperty("user.dir"),
                "\\gasoline.txt");
        File file = new File(path);
        Scanner gas = new Scanner(file);
        return Double.parseDouble(gas.nextLine());
    }

    public double readDistance(int carNumber) {
        System.out.println("Insert car's distance: "+ carNumber);
        Scanner distance = new Scanner(System.in);
        return Double.parseDouble(distance.nextLine());
    }
}