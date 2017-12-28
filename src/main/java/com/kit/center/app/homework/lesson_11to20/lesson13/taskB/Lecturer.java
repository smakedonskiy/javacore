package com.kit.center.app.homework.lesson_11to20.lesson13.taskB;

public class Lecturer extends Person {
  private String faculty;
  private int experience;
  private String degree;

  public Lecturer(String university, int age, String faculty, int experience, String degree) {
    super(university, age);
    this.faculty = faculty;
    this.experience = experience;
    this.degree = degree;
  }

  public void printInfoAboutLecturer(){
    String infoMassege = "*** Lecturer's info ***\n" +
            "faculty: " + faculty + "\n" +
            "experience: " + experience + "\n" +
            "degree: " + degree + "\n" +
            "university: " + university + "\n" +
            "age: " + age;
    System.out.println(infoMassege);
  }

  @Override
  public void showDegree() {
    System.out.println("Lecturer's degree");
  }
}
