package cars_app;
public class Main {
    public static void main(String[] args) {
        View view;
        double distance;
        if(args.length==0) {
            view = new View();
        }
        else {
            distance = Double.parseDouble(args[0]);
            view = new View(distance);
        }
        view.showMainMenu();
    }
}
