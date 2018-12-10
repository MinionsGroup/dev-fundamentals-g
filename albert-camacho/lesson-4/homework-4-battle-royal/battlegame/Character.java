package battlegame;

import battlegame.skill.IAttack;

public abstract class Character implements IAttack {
    private int health;
    private int mana;
    private int damage;

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

    @Override
    public void attack(Character target) {
        target.health -= this.damage;
    }
}
