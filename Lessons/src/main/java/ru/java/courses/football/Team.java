package ru.java.courses.football;

import java.util.ArrayList;

public class Team {
    private ArrayList<Player> teamArray = new ArrayList<Player>();
    private String name;
    private Coach coach;
    private int PLAYERS_MAX_COUNT = 20;

    public Team(String name){
        this.name = name;
    }

    public void addPlayers(Player ... players){
        for (Player i : players)
            if (teamArray.size() < PLAYERS_MAX_COUNT) {
                teamArray.add(i);
            }
            else try {
                throw new Exception("В команде не может быть больше 20 игроков");
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public void removePlayers(Player ... players){

    }

    public void setCoach(Coach coach){
        this.coach = coach;
    }

    public Coach getCoach() {
        return coach;
    }

    public ArrayList<Player> getPlayers() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
