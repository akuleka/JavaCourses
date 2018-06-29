package ru.java.courses.football;

public class Lesson5 {
    public static void main(String[] args) {
        Team team = new Team("Reksoft testers");
        team.setCoach(new Coach("Тренеров Тренер Тренерович", 15));
        Player test = new Player("Тестов Тест Тестович", true, PlayerRole.WINGER);
        Player test1 = new Player("Тестов2 Тест2 Тестович2", false, PlayerRole.DEFENDER);
        Player test2 = new Player("Тестов Тест Тестович", true, PlayerRole.WINGER);
        team.addPlayers(test);
        team.getPlayers().get(0).setGoalCount(5);
        team.getPlayers().get(1).setGoalCount(2);
        team.getCoach().setExperience(20);
        System.out.println(team.getCoach());
        System.out.println(team.printTeamArrayToString());
    }
}

