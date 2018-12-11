package rpg;

import characters.Mage;
import characters.Character;
import characters.Priest;
import characters.Warrior;

import java.util.ArrayList;
import java.util.List;

public class BattleRoyale {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();
        characters.add(new Priest());
        characters.add(new Mage());
        characters.add(new Warrior());
        characters.add(new Warrior());
        characters.add(new Mage());
        characters.add(new Priest());
        characters.add(new Warrior());
        characters.add(new Mage());
        characters.add(new Warrior());
        characters.add(new Priest());

        while (characters.size() > 1) {
            Character character = characters.get(generateRandomNumber(characters.size() - 1));
            Character opponentCharacter = characters.get(generateRandomNumber(characters.size() - 1));
            character.attack(opponentCharacter);
            characters = removeCharacters(characters);
        }
        showResults(characters.get(0));
    }

    private static int generateRandomNumber(int maxNumber) {
        return (int) (Math.random() * ((maxNumber) + 1));
    }

    private static List<Character> removeCharacters(List<Character> list) {
        List<Character> characterListUpdated = new ArrayList<>();
        for (Character character : list) {
            if (character.getHealth() > 0) {
                characterListUpdated.add(character);
            }
        }
        return characterListUpdated;
    }

    private static void showResults(Character character) {
        System.out.println(String.format("WINNER: %s", character));
        System.out.println(String.format("HEALTH: %s", character.getHealth()));
    }
}
