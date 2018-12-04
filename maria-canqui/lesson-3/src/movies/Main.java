public class Main {
    public static void main (String[] args) {
        int generatedNumber = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int userGuess;
        boolean hasWon = false;
        for (int i = 10; i > 0; i--) {
            userGuess = scanner.nextInt();
            if (userGuess > generatedNumber) {
                System.out.println("The number is less than your guess");
            }
            else if (userGuess < generatedNumber) {
                System.out.println("The number is greater than your guess");
            }
            else {
                System.out.println("You guessed the number!");
                hasWon = true;
                break;
            }
        }
        if (!hasWon) {
            System.out.println("The number was: " + generatedNumber);
        }
    }
}
