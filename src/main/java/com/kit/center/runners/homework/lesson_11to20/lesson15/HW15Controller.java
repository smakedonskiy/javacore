package com.kit.center.runners.homework.lesson_11to20.lesson15;

import com.kit.center.app.homework.lesson_11to20.lesson15.TaskPersonGame;
import com.kit.center.app.homework.service.AHomework;

public class HW15Controller extends AHomework{

  {
    super.name += "15. ";
    super.description += "\"OOP. Enumerations\".";
  }

  @Override
  public void run() {
    super.run();
    TaskPersonGame personGame = new TaskPersonGame();
    personGame.run();
  }
}
