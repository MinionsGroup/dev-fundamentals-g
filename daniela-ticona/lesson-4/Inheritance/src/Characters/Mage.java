package Characters;

public class Mage extends Character {
//Step 4
        public Mage(int health, int mana, int damage){

            super(100, 30, 75);


        }

    @Override
    public void Attack(Character character) {

            setMana(getMana() - 100);
            character.setHealth(character.getHealth() - (getDamage()*2));

    }

}
