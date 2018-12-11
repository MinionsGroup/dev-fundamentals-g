package rpg;

import characters.Mage;
import characters.Character;
import characters.Priest;
import characters.Warrior;
import java.util.ArrayList;
import java.util.List;

public class BattleRoyale {
    public static void main (String[] args) {
        List<Character> characterList = new ArrayList<>();
        characterList.add(new Mage());
        characterList.add(new Warrior());
        characterList.add(new Warrior());
        characterList.add(new Warrior());
        characterList.add(new Mage());
        characterList.add(new Priest());
        characterList.add(new Warrior());
        characterList.add(new Priest());
        characterList.add(new Warrior());
        characterList.add(new Priest());

        while (characterList.size() > 1) {
            Character attackCharacter = characterList.get(generateNumber(characterList.size() - 1));
            Character targetCharacter = characterList.get(generateNumber(characterList.size() - 1));
            attackCharacter.attack(targetCharacter);
            characterList = updateCharacterList(characterList);
        }

        System.out.println("Winner: " + characterList.get(0).getClass() + ", with health: " + characterList.get(0).getHealth());
    }

    public static int generateNumber(int maxNumber) {
        return (int)(Math.random() * ((maxNumber - 0) + 1)) + 0;
    }

    public static List<Character> updateCharacterList(List<Character> list) {
        List<Character> characterListUpdated = new ArrayList<>(list);
        for (Character character : list) {
            if (character.getHealth() <= 0) {
                characterListUpdated.remove(character);
            }
        }
        return characterListUpdated;
    }
}
