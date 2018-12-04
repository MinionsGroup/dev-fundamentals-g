package com.company;
import java.io.File;
import java.util.Scanner;

public class TestAuto {
    public static void main(String args[]) throws Exception {
        double distance = 0;
        boolean run = true;
        if (args.length == 0) {

            System.out.println("Please specify a location");
        } else {
            distance = Double.parseDouble(args[0]);

        }

        Auto auto1 = new Auto();
        Auto auto2 = new Auto();
        Auto auto3 = new Auto();

        auto1.setCapacity(40);
        auto2.setCapacity(30);
        auto3.setCapacity(20);

        while (run) {
            Scanner scanner = new Scanner(System.in);
            File file = new File("Gas.txt");
            double gas;
            Scanner fileScanner = new Scanner(file);
            String line = scanner.nextLine();
            gas = Double.parseDouble(line);

            auto1.fillGas(gas);
            auto2.fillGas(gas);
            auto3.fillGas(gas);

            System.out.println("Enter the Gas Consume for each car:");
            int GasConsume1 = scanner.nextInt();
            int GasConsume2 = scanner.nextInt();
            int GasConsume3 = scanner.nextInt();

            auto1.setGasConsume(GasConsume1);
            auto2.setGasConsume(GasConsume2);
            auto3.setGasConsume(GasConsume3);

            auto1.move(distance);
            auto2.move(distance);
            auto3.move(distance);

            auto1.powerOn();
            auto2.powerOn();
            auto3.powerOn();

            if (auto1.distanceTraveled(distance) < auto2.distanceTraveled(distance)) {
                if (auto2.distanceTraveled(distance) < auto3.distanceTraveled(distance)) {
                    System.out.println("Auto 3 won");
                } else {
                    System.out.println("Auto 2 won");
                }
            } else if (auto1.distanceTraveled(distance) == auto2.distanceTraveled(distance) && auto2.distanceTraveled(distance) == auto3.distanceTraveled(distance)) {
                if (auto1.getGas() < auto2.getGas()) {
                    if (auto2.getGas() < auto3.getGas()) {
                        System.out.println("Auto 3 won");
                    } else {
                        System.out.println("Auto 2 won");
                    }
                } else if (auto1.getGasConsume(distance) < auto2.getGasConsume(distance)) {
                    if (auto2.getGasConsume(distance) < auto3.getGasConsume(distance)) {
                        System.out.println("auto 3 won");
                    } else {
                        System.out.println("Auto 2 won");
                    }
                } else {
                    System.out.println("Auto 1 won");
                }
            } else {
                System.out.println("Auto 1 won");
            }
        }
    }
    }

