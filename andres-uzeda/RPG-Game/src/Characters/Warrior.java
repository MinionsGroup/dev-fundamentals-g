package Characters;

public class Warrior extends Character {
    public Warrior(String name) {
        super.damage = 120;
        super.health = 300;
        super.name = name;
    }
    @Override
    public void attackACharacter(Object object) {
        Character character = (Character)object;
        character.health -= this.damage;
    }
}
