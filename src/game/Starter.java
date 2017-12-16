package game;

import java.util.HashMap;

public class Starter {

    static int cos;

    public static void main(String[] args) {
        Game game = new Game("PirackieGTA");

        game.addPlayer(new Player("Oskar", "Polak", 250));
        game.addPlayer(new Player("Oskar1", "Polak", 12));
        game.addPlayer(new Player("Oskar2", "Polak", 124));
        game.addPlayer(new Player("Oskar3", "Polak", 90));

        Player player = new Player("Cosiek", "Coskowaty", 25);

        String name = new String("oskar");

        if("oskar".equals(name)){
            System.out.println("sa takie same");
        }else{
            System.out.println("nie sa takie same");
        }

        game.winner();
    }

    public static void print(int a, String ... values){
        for (String value : values) {
            System.out.println(value);
        }
    }
}
