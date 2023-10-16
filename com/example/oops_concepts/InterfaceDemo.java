package com.example.oops_concepts;

// Gives highest level of inheritance.

// Why And When To Use Interfaces?
// 1) To achieve security - hide certain details and only show the important details of an object (interface).

// 2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). 
// However, it can be achieved with interfaces, because the class can implement multiple interfaces. 
// Note: To implement multiple interfaces, separate them with a comma

// Interface
public interface InterfaceDemo {

  // data members are by default, "static and final", and by default 'public' in
  // interface.
  static final String a = "static constant";

  // No implementation to abstract methods in the interface
  public void m1();

  public int m2();

  static void m3() {
  };

  default int m4() {
    return 0;
  }

  // No other class can access this private method
  private void m5() {
  };

}

// If you don't want to apply all the methods, just make this class abstract,
// but then we can't extend them.
// For Abstract class, we use extends.

class Test implements InterfaceDemo {
  // Adding unimplemented methods.
  @Override
  public void m1() {
    throw new UnsupportedOperationException("Unimplemented method 'm1'");
  }

  @Override
  public int m2() {

    throw new UnsupportedOperationException("Unimplemented method 'm2'");
  }

  private void m5() {
    System.out.println("m5");
  }

}