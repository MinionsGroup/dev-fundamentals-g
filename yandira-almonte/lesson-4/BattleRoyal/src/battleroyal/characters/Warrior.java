package battleroyal.characters;

public class Warrior extends Character {
	public Warrior (){
        super (125, 200, 100);
    }

	@Override
	public void attack(Character character) {
		 character.setHealth(character.getHealth() - getDamage());
	}
}
