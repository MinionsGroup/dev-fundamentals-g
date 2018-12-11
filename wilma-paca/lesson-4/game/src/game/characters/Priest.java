/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.characters;

import game.interfaces.IHeal;


public class Priest extends Character implements IHeal{

    public Priest() {
        super(125, 200, 100);
    }

    @Override
    public void attack(Character oponent) {
        if(health > 50){
            if(oponent.getHealth() > damage) {
                this.health = health + (int)(damage * 0.10);
            } else{
                this.health = health + (int)(oponent.getHealth() * 0.10);
            }
            oponent.recibeAttack(damage);
            System.out.println(this.getClass().getSimpleName());
        }else {
            heal(this);
        }
    }

    @Override
    public void heal(Character objetive) {
        if(mana> 100){
            mana = mana - 100;
            objetive.addHealth(150);
        }
        System.out.println(this.getClass().getSimpleName() + " curando");
    }

}
