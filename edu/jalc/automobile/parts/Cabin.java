package edu.jalc.automobile.parts;
import edu.jalc.automobile.parts.Seat;

abstract public class Cabin{
  private Seat seat;

  private Cabin(){
    this.seat =null; 
  }

  public Cabin(Seat seat){
    this.seat = seat;
  }
  abstract public Seat getSeat();

}
