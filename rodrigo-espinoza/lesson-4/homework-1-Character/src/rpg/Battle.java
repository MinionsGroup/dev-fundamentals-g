package rpg;

import characters.Character;
import characters.Mage;
import characters.Priest;
import characters.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Battle {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();

        Character mage1 = new Mage();
        Character mage2 = new Mage();
        Character mage3 = new Mage();
        characters.add(mage1);
        characters.add(mage2);
        characters.add(mage3);

        Character warrior1 = new Warrior();
        Character warrior2 = new Warrior();
        Character warrior3 = new Warrior();
        characters.add(warrior1);
        characters.add(warrior2);
        characters.add(warrior3);

        Character priest1 = new Priest();
        Character priest2 = new Priest();
        Character priest3 = new Priest();
        characters.add(priest1);
        characters.add(priest2);
        characters.add(priest3);

        while (characters.size() > 1) {
            int indexCharacter1 = (int) ((Math.random() * (characters.size())));
            int indexCharacter2 = (int) ((Math.random() * (characters.size())));
            Character character = characters.get(indexCharacter1);
            Character character1 = characters.get(indexCharacter2);
            healsCharacter(character1);
            attackCharacter(character, character1);
            removeCharacter(characters, indexCharacter2, character1);
        }

        for (Character character : characters) {
            System.out.println("The Winner is: " + characters.get(0).getClass() + " with health " + character.getHealth());
        }
    }

    private static void healsCharacter(Character character) {
        if (character.getHealth() <= 0 && character.getMana() > 0) {
            Priest priests = new Priest();
            priests.heal(character);
        }
    }

    private static void removeCharacter(List<Character> characters, int indexCharacter, Character character) {
        if (character.getHealth() <= 0) {
            characters.remove(indexCharacter);
        }
    }

    private static void attackCharacter(Character character, Character character1) {
        if (character instanceof Priest) {
            if (character.getHealth() <= 50 && character.getMana() > 0) {
                ((Priest) character).heal(character);
            } else {
                character.attack(character1);
            }
        } else {
            character.attack(character1);
        }
    }
}


