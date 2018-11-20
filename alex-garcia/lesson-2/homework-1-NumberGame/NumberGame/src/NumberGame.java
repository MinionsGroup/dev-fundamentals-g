import java.util.Scanner;

public class NumberGame {
        public static void main(String [] arg){
            // Generate a random number between 1 - 1000.
            int randomNumber = (int) (Math.random()*100) + 1;
            boolean hasWon = false;

            System.out.println("I have randomly chosen a number between 1 and 100");
            System.out.println("Try to guess it.");

            Scanner scanner = new Scanner(System.in);
            //Create a loop that asks the number to guess a number
            for (int i = 10; i > 0; i--){
                System.out.println("You have "+ i +" guess(es) left. Choose again: ");
                //Read the user's input and compare it to the random number
                int guess = scanner.nextInt();
                //Let the user know if the guessed number was greater than or less than the random number
                if (randomNumber < guess){
                    System.out.println("It's smaller than " +guess+ " guess" );
                }
                else if (randomNumber > guess){
                    System.out.println("It's greater than " +guess+ " guess" );
                }
                else{
                    hasWon = true;
                    break;
                }
            }
            //If the they guessed the number right end the loop and tell them they've won
            if (hasWon){
                System.out.println("CORRECT... YOU WIN!!!");
            }
            //If they used up all 10 guesses end the loop and tell them they've lost
            else{
                System.out.println("GAME OVER... YOU LOSE!!!" );
                System.out.println("The number was: "+ randomNumber);
            }
        }
}
