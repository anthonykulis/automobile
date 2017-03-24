package edu.jalc.automobile.parts;

public class LuxuryCabin extends Cabin{

  public LuxuryCabin(LeatherSeat leatherSeat){
    super(leatherSeat);
  }
  public LeatherSeat getSeat(){
    return (LeatherSeat) this.getSeat();
  }

}
