package character;

import interfaces.Attack;

public abstract class Character implements Attack {
    protected int health;
    protected int mana;
    protected int damage;

    Character(int health, int mana, int damage) {
        this.health = health;
        this.mana = mana;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }
}
