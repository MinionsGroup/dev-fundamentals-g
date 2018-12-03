import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public char userInput(String message){
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.next().charAt(0);
    }

    public boolean replaceChar(String name, ArrayList<Character> res, char character){
        boolean result = false;
        for (int i = 0; i < name.length(); i++){
            if (name.charAt(i) == character){
                res.set(i, character);
                result = true;
            }
        }
        return result;
    }

    public String printArrayList(ArrayList<Character> hiddenMovie){
        StringBuilder str = new StringBuilder();
        for (char c: hiddenMovie){
            str.append(c);
        }
        return str.toString();
    }
}
