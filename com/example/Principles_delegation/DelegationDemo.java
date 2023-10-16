package com.example.Principles_delegation;

public class DelegationDemo {
  public static void main(String[] args) {
    TicketBookingByAgent agent = new TicketBookingByAgent(new TrainTicket());
    agent.bookTicket();
  }
  
}
