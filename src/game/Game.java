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

    public void winner(){
        Player currentMax = playerList.get(0);
        for (Player player : playerList) {
            if(player.getPoints() > currentMax.getPoints()){
                currentMax = player;
            }
        }
        if(currentMax.getPoints() < 100){
            System.out.println("Brak wygrywajacego");
        }else{
            System.out.println("Wygrywa " + currentMax.fullName());
        }
    }

}
