public abstract class  Character implements IAttack {
    protected int health;
    protected int mana;
    protected int damage;

    public Character(int health,int mana,int damage){
        this.health=health;
        this.mana=mana;
        this.damage=damage;
    }
    //public void attack(Character target);


}
