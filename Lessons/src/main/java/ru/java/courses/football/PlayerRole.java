package ru.java.courses.football;

public enum PlayerRole {
    WINGER("Нападающий"),
    DEFENDER("Защитник"),
    GOALKEEPER("Вратарь");

    String roleName;

    PlayerRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}




