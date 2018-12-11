/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.rpg;

import java.util.ArrayList;
import game.characters.Character;
import game.characters.Mage;
import game.characters.Priest;
import game.characters.Warrior;


public class BattleRoyal {
    public static void main(String arg[]){
        int i = 0;
        int r;
        ArrayList<Character> charctersList = new ArrayList<>(10);
        while(i < 10){
           r = (int) (Math.random() * 10) + 1;
           if(r < 3){
               charctersList.add(new Mage());
           } else if(r > 3 && r < 7){
                    charctersList.add(new Warrior());
                    }
                    else{
                        charctersList.add(new Priest());
                    }
        i++;
        }
        i=0;
        int j;
        int k;
        while(charctersList.size() > 1){
            // choose attacker
            j = (int) (Math.random() * charctersList.size());
            // choose objetive
            k = (int) (Math.random() * charctersList.size());
            
            if(j != k){
                charctersList.get(j).attack(charctersList.get(k));
                if(charctersList.get(k).getHealth() == 0){
                    charctersList.remove(k);
                }
                System.out.println("----------------------------------- " + charctersList.size());
            }
            
            i++;
            
        }
        System.out.println( charctersList.get(0).getClass().getSimpleName() + " is the winner");
    }
}
