package Characters;

import Interfaces.IAttack;

public abstract class Character implements IAttack{
    protected int health;
    protected int damage;
    protected int  mana;

    public Character(int health, int damage, int mana){
        this.health = health;
        this.damage = damage;
        this.mana = mana;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
