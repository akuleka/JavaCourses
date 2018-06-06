package ru.reksoft;

public class Trainer extends Person {
    int experience = 0;
    public Trainer(String lastname, String firstname, String middlename, int experience){
        super(lastname, firstname, middlename);
        this.experience = experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public String toString(){
        return lastname + " " + firstname + " " + middlename + " " + experience;
    }

}
