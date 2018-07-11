package ru.java.courses.football;

public class Player extends Person {
    int goalCount = 0;
    boolean isActive = true;
    PlayerRole playerRole;

    public Player(String fullname, boolean isActive, PlayerRole playerRole) {
        super(fullname);
        this.isActive = isActive;
        checkPlayerRole(playerRole);
        this.playerRole = playerRole;
    }

    public Player(String fullname, PlayerRole playerRole){
        super(fullname);
        checkPlayerRole(playerRole);
        this.playerRole = playerRole;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public PlayerRole getRole(){
        return playerRole;
    }

    public void setRole(PlayerRole playerRole) {
        checkPlayerRole(playerRole);
        this.playerRole = playerRole;
    }

    public int getGoals() {
        return goalCount;
    }

    public void setGoalCount(int goalCount){
        this.goalCount = goalCount;
    }

    public int score(){
        if (isActive) {
            return goalCount ++;
        }else {
            throw new IllegalStateException("Запасные игроки не могут забивать голы");
        }
    }

    public String toString(){
        return fullname + " " + isActive + " " + playerRole + " " + goalCount + "\n";
    }

    public void setActive(boolean isActive){
        this.isActive = isActive;
    }

    public String getFullname() {
        return super.getFullname();
    }

    public void checkPlayerRole(PlayerRole role) {
        if (role == null) {
            throw new IllegalArgumentException ("Не может быть роли null или пустой");
        }
    }

}
