package battleroyal.characters;

public class Mage extends Character{
	 public Mage() {
	        super(100, 300, 75);
	    }

	    @Override
	    public void attack(Character character) {
	        if (getMana() > 0) {
	            setMana(getMana() - 100);
	            character.setHealth(character.getHealth() - (getDamage() * 2));
	        }
	    }
}
