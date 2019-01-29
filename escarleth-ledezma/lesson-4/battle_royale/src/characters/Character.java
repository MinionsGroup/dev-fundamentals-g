package characters;

import interfaces.IAttack;

public abstract class Character implements IAttack {
    protected double health;
    protected double mana;
    protected double damage;

    public Character(double health, double mana, double damage) {
        this.health = health;
        this.mana = mana;
        this.damage = damage;
    }

    public abstract void attack(Character characterToAttack);

    public double getHealth() {
        return health;
    }

    public double getDamage() {
        return damage;
    }

    public void setHealth(double health) {
        this.health = health;
    }

}
