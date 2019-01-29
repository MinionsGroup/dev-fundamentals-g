package battleroyal.characters;

import battleroyal.Interfaces.*;

public abstract class Character implements IAttack {
	protected int health;
	protected int mana;
	protected int damage;

	public Character(int health, int mana, int damage) {
		this.setHealth(health);
		this.setMana(mana);
		this.setDamage(damage);
	}

	@Override
	abstract public void attack(Character character);

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
