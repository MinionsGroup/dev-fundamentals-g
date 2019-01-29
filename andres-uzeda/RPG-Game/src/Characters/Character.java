package Characters;

import Interfaces.IAttack;

public abstract class Character implements IAttack {
    protected int health;
    protected int damage;
    protected int mana;
    protected String name;
    public int getMana() {
        return this.mana;
    }
    public int health(){
        return this.health;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public String getName(){
        return this.name;
    }
}