package Characters;
import Interfaces.IAttack;

public class Priest extends Character{

    public Priest (int health, int mana, int damage){
        super (125, 200, 100);

    }

    @Override
    public  void Attack(Character character){




        setMana(getMana() - 100);
        character.setHealth(character.getHealth() - (getDamage()*2));
        character.setHealth(character.getHealth()+getDamage()/10);


    }

    public void Health (Character character){
        setMana(getMana() - 100);
        character.setHealth(character.getHealth()+150);

    }



}
