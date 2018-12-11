package Characters;

import Interfaces.IAttack;
import Interfaces.IHeal;

import Characters.Character;

public class Priest extends Character implements IHeal{


    public Priest(){
        super(125,100,200);
    }


    @Override
    public void Attack(Character other) {
        if(health>0){

            other.health = other.health - this.damage;
            this.health =  this.health +(this.damage /10);

        }
    }

    @Override
    public void Heal(Character other) {
        this.mana = this.mana - 100;
        other.health = other.health +150;
    }
}
