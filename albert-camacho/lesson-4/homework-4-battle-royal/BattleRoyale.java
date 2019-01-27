import battlegame.Character;
import battlegame.character.Mage;
import battlegame.character.Priest;
import battlegame.character.Warrior;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BattleRoyale {

    public static void main(String[] args) {
        List<Character> characters = randomCharacters(10);
        int round = 1;

        while(true) {
            int att = new Random().nextInt(characters.size());
            int tgt = targetOf(att, characters.size());

            Character attacker = characters.get(att);
            Character target = characters.get(tgt);

            if (attacker instanceof Priest && attacker.getHealth() <= 50) {
                printRound("heal", round, attacker, att, target, tgt);

                ((Priest) attacker).heal(attacker);

                printStatus(attacker, att);

            } else {
                printRound("attack", round, attacker, att, target, tgt);

                attacker.attack(target);

                System.out.println("\nResult:");
                printStatus(attacker, att);
                printStatus(target, tgt);

                if (target.getHealth() <= 0) {
                    characters.remove(target);
                    System.out.println(target.getClass().getSimpleName() + "(" + tgt + ") has dead!!");
                }
            }

            System.out.println("\n---------------------------------------------------------------------\n");
            if (characters.size() < 2) {
                System.out.println("\nSurvivor is: ");
                printStatus(attacker, att);
                break;
            }
            round++;
        }
    }

    private static List<Character> randomCharacters(int number) {
        List<Character> characters = new ArrayList<>();

        while (number > 0) {
            Character character;
            int random = new Random().nextInt(3);

            switch (random){
                case 0: character = new Warrior();
                        break;
                case 1: character = new Mage();
                        break;
                default: character = new Priest();
            }

            characters.add(character);
            number--;
        }

        return characters;
    }

    private static int targetOf(int attacker, int n){
        int target = new Random().nextInt(n);

        // Select another target in case it is equals to the attacker
        if (attacker == target) {
            boolean next = new Random().nextBoolean();
            if (attacker == (n - 1)) {
                target = next ? 0 : attacker - 1;
            } else if (attacker == 0) {
                target = next ? attacker + 1 : n - 1 ;
            } else {
                target = next ? attacker + 1 : attacker - 1;
            }
        }

        return target;
    }

    private static void printStatus(Character c, int position) {
        String characterType = c.getClass().getSimpleName();
        System.out.print(characterType + "(" + position +") => ");
        System.out.println("health: " + c.getHealth() + " | mana: " + c.getMana() + " | damage: " + c.getDamage());
    }

    private static void printRound(String action, int round, Character attacker, int att, Character target, int tgt) {
        String attackerType = attacker.getClass().getSimpleName();
        String targetType = target.getClass().getSimpleName();

        System.out.println("\nROUND: " + round);
        printStatus(attacker, att);
        printStatus(target, tgt);

        System.out.println("\nAction: ");
        if (action.equals("attack")){
            System.out.println(attackerType + "(" + att + ") attacks to " + targetType + "(" + tgt + ").");
        } else {
            System.out.println(attackerType + "(" + tgt + ") heals itself. ");
        }

    }
}
