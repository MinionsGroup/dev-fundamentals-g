package Characters;

import Interfaces.IAttack;

public abstract class Character implements IAttack {
    protected int health;
    protected int damage;
    protected int mana;
    public int health(){
        return this.health;
    }
}