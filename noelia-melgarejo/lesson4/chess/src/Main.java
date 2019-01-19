package src;

public class Main {

    public static void main(String[] args) {
        Queen queen = new Queen();
        Position testPosition = new Position(3, 10);
        if (queen.isValidMove(testPosition)) {
            System.out.println("Yes, I can move there.");
        } else {
            System.out.println("Nope, can't do!");
        }

        Bishop bishop = new Bishop();
        Position testPosition1 = new Position(3, 3);
        if (bishop.isValidMove(testPosition1)) {
            System.out.println("Yes, I can move there.");
        } else {
            System.out.println("Nope, can't do!");
        }

        Rock rock  = new Rock();
        Position testPosition2 = new Position(1, 1);
        if (rock.isValidMove(testPosition2)) {
            System.out.println("Yes, I can move there.");
        } else {
            System.out.println("Nope, can't do!");
        }

    }
}
