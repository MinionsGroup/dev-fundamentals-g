package lesson_4.home_work;
/**
 * @author Daniel Cabero
 * @since 09/12/2018.
 */
public class Priest extends Character implements Attack{

    int cure;

    public Priest(String name, int cure, int heal) {
        this.name = name;
        this.cure = cure;
        this.heal = heal;
    }
    @Override
    public int attack() {
        if(heal!=100){
            heal+=heal*0.1;
        }
        return 0;
    }
}

