package RPG;

import characters.Character;
import characters.Mage;
import characters.Priest;
import characters.Warrior;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleRoyale {
    public static void main(String[] args) {
        List<Character> arena = new ArrayList<>();
        arena.add(new Mage());
        arena.add(new Mage());
        arena.add(new Mage());
        arena.add(new Mage());
        arena.add(new Priest());
        arena.add(new Priest());
        arena.add(new Priest());
        arena.add(new Warrior());
        arena.add(new Warrior());
        arena.add(new Warrior());

        while (arena.size() != 1) {
            Character characterX = selectCharacter(arena);
            Character characterY = selectCharacter(arena);
            if (!characterX.equals(characterY)) {
                characterX.attack(characterY);
            }
            if (characterY.getHealth() <= 0) {
                arena.remove(characterY);
            }
        }
        System.out.println("The winner is: " + arena.get(0) + "with life :" + arena.get(0).getHealth());

    }

    public static Character selectCharacter(List<Character> arena) {
        return arena.get(new Random().nextInt(arena.size()));
    }
}



