package characters;

import interfaces.IAttack;

public abstract class Character implements IAttack {
    private int health;
    private int mana;
    private int damage;

    Character(int health, int mana, int damage) {
        this.health = health;
        this.mana = mana;
        this.damage = damage;
    }

    protected Character() {
    }

    @Override
    abstract public void attack(Character character);

    public int getHealth() {
        return this.health;
    }

    public int getMana() {
        return this.mana;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}