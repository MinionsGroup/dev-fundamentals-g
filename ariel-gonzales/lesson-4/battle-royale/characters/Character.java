package characters;

import interfaces.IAttack;

public abstract class Character implements IAttack {
    int health;
    int mana;
    int damage;

    protected Character(int health, int mana, int damage) {
        this.health = health;
        this.mana = mana;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
