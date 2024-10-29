package main.java.com.rainbowsix.controller;

import main.java.com.rainbowsix.model.Player;
import main.java.com.rainbowsix.model.Role;
import main.java.com.rainbowsix.model.Team;

import java.util.ArrayList;
import java.util.List;

public class PlayerController {
    private List<Player> playerList = new ArrayList<>();
    private int currentId = 1;

    public void addPlayer(String nickname, String playerName, Role role, String nationality, int age, Team currentTeam){
        Player player = new Player(currentId++, nickname, playerName, role, nationality, age, currentTeam);
        playerList.add(player);
    }

    public List<Player> getPlayerList(){
        return playerList;
    }

    public Player getPlayerById(int id) {
        int high = playerList.size() - 1;
        int low = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            Player midPlayer = playerList.get(mid);

            if (midPlayer.getId() == id) {
                return midPlayer;
            } else if (midPlayer.getId() < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public void updateBock(int id, String nickname, String playerName, Role role, String nationality, int age, Team currentTeam){
        if()

    }
}
