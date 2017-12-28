package com.kit.center.app.homework.lesson_11to20.lesson14.taskB;

import com.kit.center.app.homework.service.ATask;


public class TaskFootballClub extends ATask {

  {
    super.name += "\"Football Club\"";
    super.description += "This program shows information" +
            " about a football club";
  }

  @Override
  public void run() {
    super.run();
    FootballClub club = new FootballClub("FireFox","Forest",
            "Bob Bober",67,5,
            24,9,7);
    club.showName();
    club.showLocation();
    club.showStatistic();
    club.wins();
    club.draws();
    club.defeats();

    quit();
  }
}
