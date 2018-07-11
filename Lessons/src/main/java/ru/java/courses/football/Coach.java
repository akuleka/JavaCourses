package ru.java.courses.football;

public class Coach extends Person {
    int experience = 0;
    public Coach(String fullname, int experience){
        super(fullname);
        this.experience = experience;
    }

    public Coach(String fullname){
        super(fullname);
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public String toString(){
        return fullname + " " + experience;
    }

}
