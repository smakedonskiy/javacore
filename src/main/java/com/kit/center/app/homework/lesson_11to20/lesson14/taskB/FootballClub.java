package com.kit.center.app.homework.lesson_11to20.lesson14.taskB;

public class FootballClub extends SportsClub {

  private int wins;
  private int draws;
  private int defeats;

  public FootballClub(String name, String location,
                      String presidentName, int totalOfPlayers,
                      int numberOfFootballFields,
                      int wins, int draws, int defeats) {
    super(name, location,
            presidentName, totalOfPlayers, numberOfFootballFields);
    this.wins = wins;
    this.draws = draws;
    this.defeats = defeats;
  }

  @Override
  public void wins() {
    System.out.println("wins: " + wins);
  }

  @Override
  public void draws() {
    System.out.println("draws: " + draws);
  }

  @Override
  public void defeats() {
    System.out.println("defeats: " + defeats);
  }
}
