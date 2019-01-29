package battleroyal.RPG;

import java.util.ArrayList;
import java.util.List;

import battleroyal.characters.Mage;
import battleroyal.characters.Priest;
import battleroyal.characters.Warrior;
import battleroyal.characters.Character;

public class BattleRoyal {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();

        characters.add(new Mage());
        characters.add(new Mage());
        characters.add(new Mage());
        characters.add(new Priest());
        characters.add(new Priest());
        characters.add(new Priest());
        characters.add(new Warrior());
        characters.add(new Warrior());
        characters.add(new Warrior());
        characters.add(new Warrior());
        
        while (characters.size() > 1) {
        	int target = (int) (Math.random() * (characters.size()));
        	int play = (int) (Math.random() * (characters.size()));
        	if(target != play){
        		characters.get(play).attack(characters.get(target));
        		if(characters.get(target).getHealth()<=0)
        			characters.remove(target);
        	}
            	
        }
      
       System.out.println("WINNER: " + characters.get(0).getClass() + " health: " + characters.get(0).getHealth());
        
    }


}