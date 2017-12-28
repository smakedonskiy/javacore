package com.kit.center.app.homework.lesson_11to20.lesson14.taskB;

public abstract class SportsClub {
  protected String name;
  protected String location;
  protected String presidentName;
  protected int totalOfPlayers;
  protected int numberOfFootballFields;


  public abstract void wins();
  public abstract void draws();
  public abstract void defeats();

  public SportsClub(String name, String location,
                    String presidentName, int totalOfPlayers,
                    int numberOfFootballFields) {
    this.name = name;
    this.location = location;
    this.presidentName = presidentName;
    this.totalOfPlayers = totalOfPlayers;
    this.numberOfFootballFields = numberOfFootballFields;
  }

  protected void showName() {
    System.out.println("club name: " + name);
  }

  protected void showLocation() {
    System.out.println("location: " + location);
  }

  protected void showStatistic() {
    System.out.println("president name: " + presidentName +
            "\ntotal of players: " + totalOfPlayers +
            "\nnumber of football fields: " + numberOfFootballFields);
  }

}
