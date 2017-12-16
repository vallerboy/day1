package game;

import javafx.application.Platform;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private String name;
    private List<Player> playerList;

    public Game(String name) {
        this.name = name;
        this.playerList = new ArrayList<>();
    }

    public void addPlayer(Player player){
        playerList.add(player);
    }
}
