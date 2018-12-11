/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.characters;


public class Warrior extends Character{

    public Warrior() {
        super(300, 0, 120);
    }

    @Override
    public void attack(Character oponent) {
        oponent.recibeAttack(damage);
        System.out.println(this.getClass().getSimpleName());
    }

    
}
