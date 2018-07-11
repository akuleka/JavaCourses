package ru.java.courses.football;

public class Person {
    String fullname;

    public Person(String fullname){
        checkEmptyName(fullname);
        this.fullname = fullname;

    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        checkEmptyName(fullname);
        this.fullname = fullname;
    }

    public void checkEmptyName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException ("Не может быть имени null или пустого");
        }
    }
}
