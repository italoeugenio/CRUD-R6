package main.java.com.rainbowsix.model;

import java.util.ArrayList;

public class Teams {
    private int id;
    private String nomeDaOrg;
    private ArrayList<Player> jogadores;

    public Teams(int id, ArrayList<Player> jogadores, String nomeDaOrg) {
        this.id = id;
        this.jogadores = jogadores;
        this.nomeDaOrg = nomeDaOrg;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "id=" + id +
                ", nomeDaOrg='" + nomeDaOrg + '\'' +
                ", jogadores=" + jogadores +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Player> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Player> jogadores) {
        this.jogadores = jogadores;
    }

    public String getNomeDaOrg() {
        return nomeDaOrg;
    }

    public void setNomeDaOrg(String nomeDaOrg) {
        this.nomeDaOrg = nomeDaOrg;
    }
}
