package characters;

public class Warrior extends Character {
    public Warrior() {
        super(300, 0, 120);
    }

    @Override
    public void attack(Character characterUnderAttack) {
        characterUnderAttack.setHealth(characterUnderAttack.getHealth() - damage);
    }
}
