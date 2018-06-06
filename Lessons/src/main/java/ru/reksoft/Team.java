package ru.reksoft;

import java.util.ArrayList;

public class Team {
    private ArrayList<Player> teamArray = new ArrayList<Player>();
    private String teamName;
    private Trainer trainer;
    private int PLAYERS_MAX_COUNT = 20;

    public Team(String teamName){
        this.teamName = teamName;
    }

    public void addPlayer(Player player){
        if (teamArray.size() < PLAYERS_MAX_COUNT) {
            teamArray.add(player);
        }
    }

    public void setTrainer(Trainer trainer){
        this.trainer = trainer;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public ArrayList<Player> getTeamArray() {
        return teamArray;
    }

    public String printTeamArrayToString(){
        String playerString = "";
        for (Player i : teamArray
                ) {
            playerString += i.toString();
        }
        return playerString;
    }
}
