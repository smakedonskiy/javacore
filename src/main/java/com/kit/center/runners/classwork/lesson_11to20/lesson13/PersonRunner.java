package com.kit.center.runners.classwork.lesson_11to20.lesson13;

import com.kit.center.app.classwork.lesson_11to20.lesson13.Person;
import com.kit.center.app.classwork.lesson_11to20.lesson13.Student;
import com.kit.center.app.classwork.lesson_11to20.lesson13.Teacher;

public class PersonRunner {
  public static void main(String[] args) {
    Person student = new Student("Sergii");
    System.out.println(student);
    Person teacher = new Teacher("Teacher");

    response(student,"student");
    response(teacher,"teacher");

//    student.getResponse("student");
//    teacher.getResponse("teacher");

//    Student student1 = new Student("Student1");


  }

  public static void response(Person person, String questionResponse){
    System.out.println(person.getResponse(questionResponse));
    person.clean();
  }
}
