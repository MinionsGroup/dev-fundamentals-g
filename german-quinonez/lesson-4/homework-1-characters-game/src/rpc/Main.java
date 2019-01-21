package rpc;

import characters.Character;
import characters.Mage;
import characters.Priest;
import characters.Warrior;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] arg) {
        List<Character> characters = new LinkedList<>();
        for (int index = 0; index < 10; index++) {
            characters.add(getRandonCharacter());
        }

        while (characters.size() > 1) {
            int indexCharacter = intRandom(characters.size());
            int indexTarget = intRandom(characters.size());
            while (indexTarget == indexCharacter) {
                indexTarget = intRandom(characters.size());
            }
            Character character = characters.get(indexCharacter);
            Character target = characters.get(indexTarget);
            character.attack(target);
            if (target.getHealth() <= 0) {
                characters.remove(indexTarget);
            }
        }

        Character winner = characters.get(0);
        System.out.println(String.format("Winner: %s", winner.getClass().getSimpleName()));
        System.out.println(String.format("health: %s", winner.getHealth()));
    }


    private static Character getRandonCharacter() {
        List<Character> characters = new LinkedList<>();
        characters.add(new Warrior());
        characters.add(new Priest());
        characters.add(new Mage());
        return characters.get(intRandom(3));
    }

    private static int intRandom(int max) {
        return (int) (Math.random() * (max));
    }
}
