package ru.reksoft;

import java.util.ArrayList;

public class Player extends Person {
    int goalCount = 0;
    boolean isActive = true;
    TypeOfPlayer typeOfPlayer;

    public Player(String lastname, String firstname, String middlename, boolean isActive, TypeOfPlayer typeOfPlayer) {
        super(lastname, firstname, middlename);
        this.isActive = isActive;
        this.typeOfPlayer = typeOfPlayer;
        int goalCount = 0;
    }

    public boolean IsActive() {
        return this.isActive;
    }

    public TypeOfPlayer getTypeOfPlayer(){
        return typeOfPlayer;
    }

    public void setTypeOfPlayer(TypeOfPlayer typeOfPlayer) {
        this.typeOfPlayer = typeOfPlayer;
    }

    public int getGoalCount() {
        return goalCount;
    }

    public void setGoalCount(int goalCount){
        this.goalCount = goalCount;
    }

    public String toString(){
        return lastname + " " + firstname + " " + middlename + " " + isActive + " " + typeOfPlayer  + " " + goalCount + "\n";
    }
}
