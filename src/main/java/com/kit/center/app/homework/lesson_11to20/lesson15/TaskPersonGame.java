package com.kit.center.app.homework.lesson_11to20.lesson15;

import com.kit.center.app.homework.service.ATask;

import java.util.Random;

public class TaskPersonGame extends ATask {

  private EPerson[] persons = {
          EPerson.ELVIS,
          EPerson.GAGA,
          EPerson.JACKSON,
          EPerson.LOPEZ,
          EPerson.MADONNA,
          EPerson.MCCARTNEY,
          EPerson.MERCURY,
          EPerson.PAVAROTTI,
          EPerson.PINK
  };

  {
    super.name += "\"Person Game\"";
    super.description += "This program verifies your knowledge about people\n" +
            "* Input '0' for exit.";
  }

  private static int COUNT_WINS = 0;
  EPerson person = persons[0];
  EPerson pastPerson = persons[0];

  @Override
  public void run() {
    super.run();
    startDialog();

  }

  private void startDialog() {
    person = getRandomPerson();
    while (person.getName().equals(pastPerson.getName())) {
      person = getRandomPerson();
    }
    System.out.println(person.getName());

    pastPerson = person;

    System.out.print("Guess his age: ");
    checkInputAge(sc.nextInt());
  }

  private EPerson getRandomPerson() {
    Random random = new Random();
    int randomNumber = random.nextInt(persons.length);
    return persons[randomNumber];
  }

  private void checkInputAge(int inputAge) {
    if (inputAge == person.getAge()) {
      askIsAlive();
    }else {
      System.out.println("=> You are wrong. <=\n");
    }

    if (inputAge == 0 || COUNT_WINS == 3) {
      if (COUNT_WINS == 3) {
        System.out.println("You guessed 3 times. GAME OVER!!!\n");
      } else {
        System.out.println("GAME OVER!!!\n");
      }
      COUNT_WINS = 0;
      quit();
    } else startDialog();
  }

  private void askIsAlive() {
    System.out.print("He is alive? (yes/no): ");
    checkInputIsAlive(sc.next());
  }

  private void checkInputIsAlive(String userText) {
    String answer = "no";
    if (person.isAlive() == true){
      answer = "yes";
    }

    if (userText.equals(answer)){
      System.out.println("=> Congratulations!!! <=\n");
      COUNT_WINS++;
    }else System.out.println("=> You are wrong. <=\n");
  }


}
