package characters;

import interfaces.IAttack;

public abstract class Character implements IAttack {
    private double health;
    private double mana;
    private double damage;

    Character(double health, double mana, double damage) {
        this.health = health;
        this.mana = mana;
        this.damage = damage;
    }
    @Override
    abstract public void attack(Character targetSelected);
    public double getHealth() {
        return this.health;
    }
    public double getMana() {
        return this.mana;
    }
    public double getDamage() {
        return this.damage;
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
}