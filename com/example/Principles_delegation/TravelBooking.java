package com.example.Principles_delegation;

// Here we are delegating the tasks to the booking agent to book the tickets. We just have to call it to book.
public interface TravelBooking {
  public void bookTicket();
}

// Agent class for booking.
// This approach supports the concept of polymorphism, allowing you to switch implementations at runtime without changing the code that uses the TravelBooking interface.

// For example, in the future, if you create another class BusTicket that also implements the TravelBooking interface,
//  you can easily switch to using new BusTicket() instead of new TrainTicket() in the DelegationDemo class without changing the code in TicketBookingByAgent. 
// This flexibility is a significant benefit of polymorphism and abstraction.

class TicketBookingByAgent implements TravelBooking{

  TravelBooking t;

  // Constructor
  public TicketBookingByAgent(TravelBooking t ){
    this.t = t;
  }


  // This method will book the tickets, when called.
  @Override
  public void bookTicket() {
    t.bookTicket();
  }
}


// 
class TrainTicket implements TravelBooking {
  @Override
  public void bookTicket() {
    System.out.println("Train Ticket bought");
  }
  
}


class FlightTicket implements TravelBooking {
  @Override
  public void bookTicket() {
    System.out.println("Flight Ticket bought");
  }
  
}

// Creating a SEPARATE driver class to demonstrate this interface made.