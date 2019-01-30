package rpg;

import characters.Mage;
import characters.Character;
import characters.Priest;
import characters.Warrior;

import java.util.ArrayList;
import java.util.List;

public class BattleRoyal {
  public static void main(String[] args) {

    List<Character> listOfCharacters = new ArrayList<>();

    listOfCharacters.add(new Mage());
    listOfCharacters.add(new Warrior());
    listOfCharacters.add(new Priest());
    listOfCharacters.add(new Mage());
    listOfCharacters.add(new Warrior());
    listOfCharacters.add(new Warrior());
    listOfCharacters.add(new Priest());
    listOfCharacters.add(new Mage());
    listOfCharacters.add(new Warrior());
    listOfCharacters.add(new Priest());

    if (listOfCharacters.size() > 1) do {
      Character attackCharacter = listOfCharacters.get(generateNumber(listOfCharacters.size() - 1));
      Character targetCharacter = listOfCharacters.get(generateNumber(listOfCharacters.size() - 1));
      attackCharacter.attack(targetCharacter);
      listOfCharacters = refreshListOfCharacters(listOfCharacters);
    } while (listOfCharacters.size() > 1);
    System.out.println("The Champion is: " + listOfCharacters.get(0).getClass().getSimpleName());
    System.out.println("The health is: " + listOfCharacters.get(0).getHealth());
  }

  private static int generateNumber(int maximumNumber) {
    return (int) (Math.random() * ((maximumNumber) + 1));
  }

  private static List<Character> refreshListOfCharacters(List<Character> list) {
    List<Character> listOfCharactersRefreshed = new ArrayList<>(list);
    for (int interator = 0; interator < list.size(); interator++) {
      Character character = list.get(interator);
      if (character.getHealth() <= 0) {
        listOfCharactersRefreshed.remove(character);
      }
    }
    return listOfCharactersRefreshed;
  }
}
