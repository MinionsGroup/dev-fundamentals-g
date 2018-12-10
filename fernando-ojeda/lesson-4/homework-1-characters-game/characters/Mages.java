package characters;

public class Mages extends Character {

    public Mages(int health, int mana, int damage) {
        super(health, mana, damage);
    }

    @Override
    public void attack(Character character) {
        if(getMana() > 0){
            setMana(getMana() - 100);
            character.setHealth(character.getHealth() - (getDamage()*2));
        }
    }
}
