package practices_03;

/**
 * Created by Daniel Cabero
 *
 * @since 19/11/2018.
 */
public class Weather {
    public static void main(String [] args){
        if(args.length==0) {
            System.out.println("Please specify a location");
            long[] f = new long[1];
        }
        else {
            String location = args[0];
            int temperature = 60 + (int)(Math.random()*10);
            System.out.println("The Weather in "+location+" is "+ temperature);
        }
    }
}