package game;

public class Starter {
    public static void main(String[] args) {
        Game game = new Game("PirackieGTA");

        game.addPlayer(new Player("Oskar", "Polak", 250));
        game.addPlayer(new Player("Oskar1", "Polak", 12));
        game.addPlayer(new Player("Oskar2", "Polak", 124));
        game.addPlayer(new Player("Oskar3", "Polak", 90));
    }
}
