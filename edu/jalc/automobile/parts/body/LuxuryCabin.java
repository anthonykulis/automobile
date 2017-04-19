package edu.jalc.automobile.parts.body;

import edu.jalc.automobile.parts.body.seat.LeatherSeat;

public class LuxuryCabin extends Cabin{

  public LuxuryCabin(LeatherSeat leatherSeat){
    super(leatherSeat);
  }
  public LeatherSeat getSeat(){
    return (LeatherSeat) super.getSeat();
  }
  
  public String toString(){
    return "Luxury Cabin with " + super.getSeat();
  }

}
