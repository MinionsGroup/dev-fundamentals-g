/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.characters;

import game.interfaces.IAttack;


public abstract class Character implements IAttack {
    protected int health;
    protected int mana;
    protected int damage;
    protected Character(int health, int mana,int damage) {
	this.health = health;
	this.mana = mana;
	this.damage = damage;
    };
    
    public void recibeAttack(int attack){
        if(health > attack){
        health = health - attack;
        } else{
            health = 0;
        }
        System.out.print(this.getClass().getSimpleName() + " salud " + health + " was attack by ");
    }
    
    public int getHealth(){
        return health;
    }
    
    public void addHealth(int health){
        this.health = this.health + health;
    }
}
