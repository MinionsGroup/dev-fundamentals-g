package characters;

import interfaces.IAttack;

public abstract class Character implements IAttack {
    protected double health;
    protected double mana;
    protected double damage;

    public double getHealth() {
        return health;
    }

    public double getMana() {
        return mana;
    }

    public double getDamage() {
        return damage;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public Character(double health, double mana, double damage) {
        this.health = health;
        this.mana = mana;
        this.damage = damage;
    }

    public abstract void attack(Character characterUnderAttack);
}
