package RPG;

import Characters.Mage;
import Characters.Priest;
import Characters.Warrior;
import Characters.Character;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleRoyale {
    public static void main(String[] args) {
        Random random = new java.util.Random();
        Character character1 = new Warrior();
        Character character2 = new Warrior();
        Character character3 = new Warrior();
        Character character4 = new Priest();
        Character character5 = new Priest();
        Character character6 = new Priest();
        Character character7 = new Mage();
        Character character8 = new Mage();
        Character character9 = new Mage();
        Character character10 = new Mage();
        List<Character> characters = new ArrayList<>();
        List<Character> characters_die = new ArrayList<>();
        characters.add(character1);
        characters.add(character2);
        characters.add(character3);
        characters.add(character4);
        characters.add(character5);
        characters.add(character6);
        characters.add(character7);
        characters.add(character8);
        characters.add(character9);
        characters.add(character10);
        while (characters.size() > 1) {
            int attacker = random.nextInt(characters.size() - 1);
            int attack_index = random.nextInt(characters.size() - 1);
            System.out.println("attacker: " + attacker);
            if ((characters.get(attack_index) instanceof Priest)) {
                if (characters.get(attack_index).getHealth() <= 50) {
                    ((Priest) characters.get(attack_index)).Heal(characters.get(attack_index));
                }
                characters.get(attacker).Attack(characters.get(attack_index));
            }
            characters.get(attacker).Attack(characters.get(attack_index));
            if (characters.get(attack_index).getHealth() <= 0) {
                System.out.println("The character is die");
                characters_die.add(characters.get(attack_index));
                characters.remove(characters.get(attack_index));
            }
        }
        System.out.println("characters die: ");
        for (int i = 0; i < characters_die.size(); i++) {
            System.out.println(characters_die.get(i));
        }

        System.out.println("character:  ");
        System.out.println(characters_die.get(0));


    }
}
