package ru.java.courses.Lesson9;

public enum SportTitle {
    NO_TITLE("Бездарь"),
    CANDIDATE("Кандидат"),
    MASTER("Мастер");

    String name;


    SportTitle(String name) {
        this.name = name;
    }
}
