package com.example.oops_concepts;

import java.util.ArrayList;
import java.util.List;

// HAS- A relationship between 2 different classes through their objects. 
// both the entities are association and can exist independently.

class College {
  String name;

  // Passing the object of Teacher in the college class. (Aggregation.)
  private List<Teacher> teacher;

  public College(String name, List<Teacher> teacher) {
    this.name = name;
    this.teacher = teacher;
  }

  // Getter for teacher
  public List<Teacher> getTeacher() {
    return teacher;
  }
}

// Without the college class, teacher class can survive.

class Teacher {
  String name;
  String subject;

  public Teacher(String name, String subject) {
    this.name = name;
    this.subject = subject;
  }

  @Override
  public String toString() {
    return "[ Teacher : " + name + ", subject : " + subject + "]";
  }
}

public class AssociationDemo {
  public static void main(String[] args) {

    // Creating a list and adding to it.
    List<Teacher> teachers = new ArrayList<Teacher>();
    teachers.add(new Teacher("Rohn", "Java"));
    teachers.add(new Teacher("Somil", "Python"));

    College college = new College("MyCollege", teachers);

  }
}
