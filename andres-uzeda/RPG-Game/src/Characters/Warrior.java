package Characters;

public class Warrior extends Character {
    public Warrior() {
        super.damage = 120;
        super.health = 300;
    }
    public int health(){
        return this.health;
    }
    @Override
    public void attackACharacter(Object object) {
        Character character = (Character)object;
        character.health -= this.damage;
    }
}
