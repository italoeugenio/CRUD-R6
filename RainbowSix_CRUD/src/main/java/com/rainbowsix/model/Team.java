package main.java.com.rainbowsix.model;

import java.util.ArrayList;

public class Team {
    private int id;
    private String organizationName;
    private ArrayList<Player> players;

    public Team(int id, ArrayList<Player> players, String organizationName) {
        this.id = id;
        this.players = players;
        this.organizationName = organizationName;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", organizationName='" + organizationName + '\'' +
                ", players=" + players +
                '}';
    }

    public int getId() {
        return id;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
