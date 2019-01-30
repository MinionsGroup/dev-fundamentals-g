public class Main {
    public static void main(String [] args){

        guess game=new guess("listMovies.txt");
        String movieTittle=game.selectRandom();
        game.startGame(movieTittle);

    }
}




