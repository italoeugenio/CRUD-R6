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

    
}
