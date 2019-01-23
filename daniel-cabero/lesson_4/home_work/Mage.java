package lesson_4.home_work;

/**
 * @author Daniel Cabero
 * @since 09/12/2018.
 */
public class Mage extends Character implements Attack {

    int mana;

    public Mage(String name, int mana, int heal) {
        this.name = name;
        this.mana = mana;
        this.heal = heal;
    }

    @Override
    public int attack() {
        if (mana == 20) {
            return 50;
        } else {
            return 20;
        }
    }
}
