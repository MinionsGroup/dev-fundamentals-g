public abstract class  Character implements IAttack {
    protected int health;
    protected int mana;
    protected int damage;
    protected String name;

    public Character(int health,int mana,int damage, String name){
        this.health=health;
        this.mana=mana;
        this.damage=damage;
        this.name=name;
    }
    //public void attack(Character target);
    public Boolean checkMana(int mana){
        return mana>0;
    }

}
