package ru.reksoft;

public class Lesson5 {
    public static void main(String[] args) {
        Team team = new Team("Reksoft testers");
        team.setTrainer(new Trainer("Тренеров", "Тренер", "Тренерович", 15));
        team.addPlayer(new Player("Тестов", "Тест", "Тестович", true, TypeOfPlayer.ATTACK));
        team.addPlayer(new Player("Тестов2", "Тест2", "Тестович2", false, TypeOfPlayer.DEFENDER));
        team.addPlayer(new Player("Тестов3", "Тест3", "Тестович3", false, TypeOfPlayer.MIDFIELDER));
        team.addPlayer(new Player("Тестов4", "Тест4", "Тестович4", true, TypeOfPlayer.GOALKEEPER));
        team.getTeamArray().get(0).setGoalCount(5);
        team.getTeamArray().get(1).setGoalCount(2);
        team.getTrainer().setExperience(20);
        team.getTrainerToString();
        team.getTeamArrayToString();
    }
}

