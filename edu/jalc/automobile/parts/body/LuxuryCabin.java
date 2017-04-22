package edu.jalc.automobile.parts.body;

import edu.jalc.automobile.parts.body.seat.Seat;

public class LuxuryCabin extends Cabin{

  public LuxuryCabin(Seat leatherSeat){
    super(leatherSeat);
  }
  public Seat getSeat(){
    return (Seat) super.getSeat();
  }

  public String toString(){
    return "Luxury Cabin with " + super.getSeat();
  }

}
