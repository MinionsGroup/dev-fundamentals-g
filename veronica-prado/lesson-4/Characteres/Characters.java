public abstract class Characters implements IAttack
{
    protected int health;
    protected int mana;
    protected int damage;
    protected Character(int health, int mana, int damage){
        this.health = health;
        this.mana = mana;
        this.damage = damage;
    }

    @Override
    abstract public void attack();
}
