package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String []arg){
        GuessGame guess = new GuessGame();
        int num = guess.generateRandomNumber(100);
        System.out.println("I have randomly chosen a number between [1, 100] \n Try to guess it");
        int count = 10;
        while (count > 0){
            System.out.println("You have " + count + " guess(es) left:");
            Scanner scanner = new Scanner(System.in);
            int numGuess = scanner.nextInt();
            if(numGuess == num){
                System.out.println("CORRECT...YOU WIN!");
                break;
            }else {
                if(numGuess > num){
                    System.out.println("It is smaller than " + numGuess);
                }else {
                    System.out.println("It is greater than  " + numGuess);
                }
            }
            count = count -1;
        }
        System.out.println("You lost");
    }
}
