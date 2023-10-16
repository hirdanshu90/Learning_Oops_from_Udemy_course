package com.example.oops_concepts;

// Method overloading. OR COMPILE time polymorphism.
// Should have same method with different signature (name or/and arguments)

class Base {
  public void show() {
    System.out.println("From Base");
  }
}

class Derived extends Base {
  public void show() {
    System.out.println("From Derived");
  }
}

// Method Overriding. OR run time polymorphism
// Re define the method in parent class.
public class Polymorphismm {
  public static void main(String[] args) {

    Base base1 = new Base();
    base1.show();

    // Normal
    Derived deri = new Derived();
    deri.show();

    // Object created is of derived class.
    Base base = new Derived();
    base.show();
    // Output: From Derived.

  }
}
