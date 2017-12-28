package com.kit.center.app.classwork.lesson_11to20.lesson12;

public class Student extends Person {
  private String university;
  private String responce = "Ehhh, what was the question?";
  private String myBook = "Wild";

  public Student(String name, String university) {
    super(name);
    this.university = university;
  }

  public void printMyBook() {
    System.out.println("My book: " + myBook);
  }

  public String getUniversity() {
    return university;
  }

  public void setUniversity(String university) {
    this.university = university;
  }

  public String getResponce() {
    return responce;
  }

  public void setResponce(String responce) {
    this.responce = responce;
  }
}
