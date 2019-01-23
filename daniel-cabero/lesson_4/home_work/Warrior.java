package lesson_4.home_work;

/**
 * @author Daniel Cabero
 * @since 09/12/2018.
 */
public class Warrior extends Character implements Attack {

    int damage;

    public Warrior(String name, int damage, int heal) {
        this.name = name;
        this.damage = damage;
        this.heal = heal;
    }

    @Override
    public int attack() {
        return damage;
    }
}
