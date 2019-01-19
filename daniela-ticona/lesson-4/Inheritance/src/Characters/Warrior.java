package Characters;

public class Warrior extends Character{

    public Warrior (int health, int mana, int damage){
        super (125, 200, 100);

    }
/// Cualquier valor :P para ataque  y heal
    @Override
    public  void Attack(Character character){
       setMana(getMana() - 50);
        character.setHealth(character.getHealth() - (getDamage()*4));
        character.setHealth(character.getHealth()+getDamage()/2);


    }

    public void Health (Character character){
        setMana(getMana() - 50);
        character.setHealth(character.getHealth()+75);

    }
}
