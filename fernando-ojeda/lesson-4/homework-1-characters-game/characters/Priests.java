package characters;

import interfaces.IHeal;

public class Priests extends Character implements IHeal{

    public Priests(int health, int mana, int damage) {
        super(health, mana, damage);
    }

    public Priests(){}

    @Override
    public void attack(Character character) {
        character.setHealth(character.getHealth()-getDamage());
        setHealth((int) (getHealth()+ (getDamage()*0.1)));
        if(character.getHealth() > 0){
            character.setHealth((int) (character.getHealth()-(getDamage()*0.1)));
        }
    }

    @Override
    public void heal(Character character) {
        if(character.getMana() > 0){
            character.setMana(character.getMana()-100);
            character.setHealth(character.getHealth()+150);
        }
    }
}
