package com.example.oops_concepts;

// Has a strong Composition.
// One object owns another object

class Kitchen {
  private String food;

  public void setFood(String food) {
    this.food = food;
  }

  public String getFood() {
    return food;
  }
}

// House has a kitchen.
class House {
  private Kitchen kitchen;

  public House() {
    this.kitchen = new Kitchen();

    // getters and setters
    kitchen.setFood("Pizza");
  }

  public String getFood() {
    return kitchen.getFood();
  }

}

public class CompositionDemo {
  public static void main(String[] args) {

    House house = new House();
    System.out.println(house.getFood());

  }
}
