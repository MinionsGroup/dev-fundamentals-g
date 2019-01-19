package Characters;
import Interfaces.IAttack;

public abstract class Character implements IAttack
{
    protected int health;
    protected int mana;
    protected  int damage;

/// steps 1

    protected Character(int health, int mana, int damage ){

        this.health =health;
        this.mana=mana;
        this.damage= damage;
    }

    public int getHealth() {
        return this.health;
    }
    public int getMana () {
        return this.mana;
    }
    public int getDamage () {
        return this.damage;
    }
    public int setHealth(int health) {
        return this.health;
    }

    public int setMana(int mana) {
        return this.health;
    }
    public int setDamage(int damage) {
        return this.health;
    }


    //public abstract void Attack (Character target);
    //public abstract void Health (Character target);

}


