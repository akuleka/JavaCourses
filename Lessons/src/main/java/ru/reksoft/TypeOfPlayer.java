package ru.reksoft;

public enum TypeOfPlayer {
    ATTACK("Нападающий"),
    DEFENDER("Защитник"),
    GOALKEEPER("Вратарь"),
    MIDFIELDER("Полузащитник");

    String name;

    TypeOfPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}




