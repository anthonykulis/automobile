package edu.jalc.automobile.parts.body;

import edu.jalc.automobile.parts.body.seat.Seat;

public class StandardCabin extends Cabin{

  public StandardCabin(Seat clothSeat){
    super(clothSeat);
  }

  public Seat getSeat(){
    return (Seat) super.getSeat();
  }

  public String toString(){
    return "Standard Cabin with " + super.getSeat();
  }
}
