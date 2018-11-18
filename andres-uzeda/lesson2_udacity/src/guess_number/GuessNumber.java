package guess_number;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random r = new Random();
    private int attempts;
    private int guessNumber;
    private boolean itIsTheNumber;

    public GuessNumber() {
        this.attempts = 10;
        this.guessNumber = r.nextInt(100-1) + 1;
        this.itIsTheNumber = false;
    }

    public boolean TheGameFinish(){
        if(AttemptsAreZero() == true || itIsTheNumber == true){
            return false;
        }else{
            return true;
        }
    }
    public void ItIsTheNumber(int number){
        if(number == guessNumber){
            System.out.println("You Win the game");
            itIsTheNumber = true;
        }else{
            attempts = attempts -1;
            NumberNear(number);
            itIsTheNumber = false;
        }
    }
    private boolean AttemptsAreZero(){
        if(attempts == 0){
            System.out.println("You don´t have more attempts");
            return true;
        }else{
            return false;
        }
    }

    private void NumberNear(int number){
        if(number > guessNumber){
            System.out.println("The guess number is less than your number");
        }else{
            System.out.println("The guess number is bigger than your number");
        }
    }
}
