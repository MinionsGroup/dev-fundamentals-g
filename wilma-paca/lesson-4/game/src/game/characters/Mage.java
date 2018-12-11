/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.characters;


public class Mage extends Character{

    public Mage() {
        super(100, 300, 75);
    }

    @Override
    public void attack(Character oponent) {
        if(mana > 100){
            oponent.recibeAttack(this.damage * 2);
            mana = mana - 100; 
        } else {
            oponent.recibeAttack(this.damage);
        }
    System.out.println(this.getClass().getSimpleName());    
    }
    
}
