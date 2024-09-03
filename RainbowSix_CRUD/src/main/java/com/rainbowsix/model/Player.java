package main.java.com.rainbowsix.model;

public class Player {
    private int id;
    private String nickname;
    private String nomeDoJogador;
    private Funcao funcao;
    private String nacionalidade;
    private int idade;
    private Teams timeAtual;

    public Player(int id, String nickname, String nomeDoJogador, Funcao funcao, String nacionalidade, int idade, Teams timeAtual) {
        this.id = id;
        this.nickname = nickname;
        this.nomeDoJogador = nomeDoJogador;
        this.funcao = funcao;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.timeAtual = timeAtual;
    }

    @Override
    public String toString() {
        return "Player{" +
                "funcao=" + funcao +
                ", id=" + id +
                ", nickname='" + nickname + '\'' +
                ", nomeDoJogador='" + nomeDoJogador + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", idade=" + idade +
                ", timeAtual=" + timeAtual +
                '}';
    }

    public int getId() {
        return id;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNomeDoJogador() {
        return nomeDoJogador;
    }

    public void setNomeDoJogador(String nomeDoJogador) {
        this.nomeDoJogador = nomeDoJogador;
    }

    public Teams getTimeAtual() {
        return timeAtual;
    }

    public void setTimeAtual(Teams timeAtual) {
        this.timeAtual = timeAtual;
    }
}
