package ru.java.courses.football;

public class Player extends Person {
    int goalCount = 0;
    boolean isActive = true;
    PlayerRole playerRole;

    public Player(String fullname, boolean isActive, PlayerRole playerRole) {
        super(fullname);
        this.isActive = isActive;
        this.playerRole = playerRole;
    }

    public Player(String fullname, PlayerRole playerRole){
        super(fullname);
        this.playerRole = playerRole;
    }

    public boolean IsActive() {
        return this.isActive;
    }

    public PlayerRole getPlayerRole(){
        return playerRole;
    }

    public void setPlayerRole(PlayerRole playerRole) {
        this.playerRole = playerRole;
    }

    public int getGoalCount() {
        return goalCount;
    }

    public void setGoalCount(int goalCount){
        this.goalCount = goalCount;
    }

    public String toString(){
        return name + " " + isActive + " " + playerRole + " " + goalCount + "\n";
    }


}
