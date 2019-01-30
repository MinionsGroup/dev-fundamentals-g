package rpg;

import character.Character;
import character.Mage;
import character.Priest;
import character.Warrior;

import java.util.ArrayList;
import java.util.List;

public class BattleRoyal {
    public static void main(String[] arg) {
        List<Character> characters = loadCharacters();
        while (characters.size() > 1) {
            int indexCharacter = (int) ((Math.random() * (characters.size())));
            int indexTargetCharacter;
            do {
                indexTargetCharacter = (int) ((Math.random() * (characters.size())));
            } while (indexCharacter == indexTargetCharacter);
            Character character = characters.get(indexCharacter);
            Character targetCharacter = characters.get(indexTargetCharacter);
            if (character instanceof Priest && character.getHealth() < 50) {
                ((Priest) character).heal(targetCharacter);
            } else {
                character.attack(targetCharacter);
                if (targetCharacter.getHealth() <= 0) {
                    characters.remove(targetCharacter);
                }
            }
        }
    }


    private static List<Character> loadCharacters() {
        List<Character> characters = new ArrayList<>();
        characters.add(new Mage());
        characters.add(new Mage());
        characters.add(new Mage());
        characters.add(new Mage());
        characters.add(new Priest());
        characters.add(new Priest());
        characters.add(new Priest());
        characters.add(new Priest());
        characters.add(new Warrior());
        characters.add(new Warrior());
        characters.add(new Warrior());
        return characters;
    }
}
