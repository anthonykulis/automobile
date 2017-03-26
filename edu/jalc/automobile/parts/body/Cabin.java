package edu.jalc.automobile.parts.body;

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
