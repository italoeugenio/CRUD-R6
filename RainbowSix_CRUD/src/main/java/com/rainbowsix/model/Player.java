package main.java.com.rainbowsix.model;

public class Player {
    private int id;
    private String nickname;
    private String playerName;
    private Role role;
    private String nationality;
    private int age;
    private Team currentTeam;

    public Player(int id, String nickname, String playerName, Role role, String nationality, int age, Team currentTeam) {
        this.id = id;
        this.nickname = nickname;
        this.playerName = playerName;
        this.role = role;
        this.nationality = nationality;
        this.age = age;
        this.currentTeam = currentTeam;
    }

    @Override
    public String toString() {
        return "Player{" +
                "role=" + role +
                ", id=" + id +
                ", nickname='" + nickname + '\'' +
                ", playerName='" + playerName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                ", currentTeam=" + currentTeam +
                '}';
    }

    public int getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Team getCurrentTeam() {
        return currentTeam;
    }

    public void setCurrentTeam(Team currentTeam) {
        this.currentTeam = currentTeam;
    }
}
