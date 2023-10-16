package com.example.oops_concepts;

// Grouping up data members and member functions in a single unit
// DAta hiding (privating something, or using protected + Abstraction) is encapsulation.
// Makes Unit testing easy. 

class Account {
  private double balance;

  // Getters and setters
  public double getBalance() {
    // Can add some validations before setting the balance.
    return this.balance;
  }

  public void setBalance(double balance) {
    // Can add some validations before setting the balance.
    this.balance = balance;
  }
}

public class encapsulationDemo {
  public static void main(String[] args) {

    Account acc = new Account();
    acc.setBalance(10000);
    System.out.println(acc.getBalance());

  }

}
