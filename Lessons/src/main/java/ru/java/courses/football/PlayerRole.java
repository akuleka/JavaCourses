package ru.java.courses.football;

public enum PlayerRole {
    WINGER("Нападающий"),
    DEFENDER("Защитник"),
    GOALKEEPER("Вратарь"),
    MIDFIELDER("Полузащитник");

    String name;

    PlayerRole(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}




