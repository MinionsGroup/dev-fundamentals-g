package battlegame.character;

import battlegame.Character;

public class Warrior extends Character {

    public Warrior() {
        super(300, 0, 120);
    }

    @Override
    public void attack(Character target) {
        target.setHealth(target.getHealth() - this.damage);
    }
}
