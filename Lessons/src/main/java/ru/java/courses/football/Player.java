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

    public boolean isActive() {
        return this.isActive;
    }

    public PlayerRole getRole(){
        return playerRole;
    }

    public void setRole(PlayerRole playerRole) {
        this.playerRole = playerRole;
    }

    public int getGoals() {
        return goalCount;
    }

    public void setGoalCount(int goalCount){
        this.goalCount = goalCount;
    }

    public int score(){
        return goalCount += goalCount;
    }

    public String toString(){
        return name + " " + isActive + " " + playerRole + " " + goalCount + "\n";
    }

    public void setActive(boolean isActive){
        this.isActive = isActive;
    }

}
