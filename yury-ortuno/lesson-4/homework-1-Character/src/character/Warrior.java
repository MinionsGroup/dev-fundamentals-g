package character;

public class Warrior extends Character {

    public Warrior() {
        super(300, 0, 120);
    }


    @Override
    public void attack(Character targetCharacter) {
        targetCharacter.health -= damage;
    }
}
