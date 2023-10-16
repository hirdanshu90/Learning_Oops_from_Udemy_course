package com.example.oops_concepts;

// This IS - A relationship 

// Creating a new class deriving from old class.
// Parent - child 
// Employee : Developer, Manager Basically specialization. 
// Usability of code. 

// Single inheritance

// parent class
class A {

}

// Child class
class B extends A {

}

// Multi level inheritance
// A-B-C ......
class C extends B {

}

// Multiple inheritance via INTERFACE.
// More than 1 parent class

interface AA {
  default void method() {
    System.out.println("Method of AA");
  }
}

interface AAA {
  default void method() {
    System.out.println("Method of AAA");
  }
};

class BB implements AA, AAA {
  @Override
  public void method() {

    // When a class implements multiple interfaces and these interfaces have default
    // methods with the same name, there can be a conflict.
    // The SUPER keyword is used to explicitly specify which interface's default
    // method implementation should be called.
    // When you call AA.super.method(), it means you are specifically invoking the
    // method() defined in the AA interface.
    // This is necessary because BB implements both interfaces, and without super,
    // the compiler wouldn't know which version of the method() to call.
    // By using AA.super.method(), you are indicating that you want to call the
    // method() provided by the AA interface,
    // allowing you to resolve the conflict and call the desired method
    // implementation.
    AA.super.method();
    System.out.println("Printing BB");
  }

}

// Hierarchical interface,

// ie class A can be extended by any no of class.
class CC extends B implements AA, AAA {
  public void method() {
    AA.super.method();
  }
}

public class InheritanceDemo {
  public static void main(String[] args) {
    BB b = new BB();
    b.method();
  }
}
