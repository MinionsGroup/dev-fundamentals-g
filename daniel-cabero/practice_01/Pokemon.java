package practice_01;

/**
 * Created by Daniel Cabero
 *
 * @since 12/11/2018.
 */
public class Pokemon {
    private String name;
    private String type;
    private int health;

    public void attack(Pokemon enemy) {
        if (!enemy.dodge()) {
            enemy.health--;
        }
    }

    public boolean dodge() {
        return Math.random() > 0.5;
    }

    public void evolve() {

    }

}
