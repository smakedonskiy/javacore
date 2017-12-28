package com.kit.center.app.classwork.lesson_11to20.lesson14.task2;

public class Teacher {
  String name;

  public Teacher(String name) {
    this.name = name;
  }

  public void lessonFinished(){
    System.out.println("finish");
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Teacher)) return false;

    Teacher teacher = (Teacher) o;

    return name.equals(teacher.name);
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }
}
