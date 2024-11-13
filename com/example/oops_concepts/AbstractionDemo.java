package com.example.oops_concepts;

import java.util.ArrayList;

// -------------------For hiding internal implementations, can be done in 2 ways ----------
// first by Interfaces OR by making the class Abstract
// Can't make the object of a abstract class.
// Useful for security reasons, modularity etc.

// Abstraction by interface.
// Abstraction by interface.
interface Mobile {

  // 2 methods....
  public void calling(String number);

  public void sendMessage(String message);
}

// Class implementing Interface.
class Apple implements Mobile {

  // Making a Array List.
  private ArrayList<String> contacts = new ArrayList<String>();

  // Method to add contacts to the list.
  public void addContact(String number) {
    contacts.add(number);
  }

  // Further 2 methods from the Apple interface
  @Override
  public void calling(String number) {
    System.out.println("Calling............ " + number);
  }

  @Override
  public void sendMessage(String message) {
    System.out.println("Sending message......... " + message);
  }

}

// SECOND

// Making an ABSTRACT class. By actually using abstract keyword.

abstract class Mobilee {

  ArrayList<String> list = new ArrayList<String>();

  abstract void calling(String message);

  abstract void sendMessage(String message);

  // We can write concrete methods as well in the abstract class,
  // and don't need to overwrite them (ITS optional).

  public void addContact(String contact) {
    list.add(contact);
  }
}

// Class extending the abstract class
class Samsung extends Mobilee {

  @Override
  void calling(String message) {
    System.out.println("Calling... " + message);
  }

  @Override
  void sendMessage(String message) {
    System.out.println("Sending message... " + message);
  }

}

public class AbstractionDemo {
  public static void main(String[] args) {
    Apple myphone = new Apple();
    myphone.calling("322525252");
    myphone.sendMessage("How are you?");
    myphone.addContact("4314141");

    Samsung mynewPhone = new Samsung();
    mynewPhone.addContact("98986799");
    mynewPhone.calling("98667967");
    mynewPhone.addContact("4314141");
    mynewPhone.sendMessage("call from samsung s23 pro");
  }

}
