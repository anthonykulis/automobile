package edu.jalc.automobile.parts;

public class LuxuryCabin extends Cabin{

  public LeatherSeat getSeat(){
    return (LeatherSeat) super.leatherSeat;
  }

}
