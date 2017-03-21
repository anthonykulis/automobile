package edu.jalc.automobile.parts;

public class Cabin{
  private Seat seat;

  public Cabin(Seat seat){
    this.seat = seat;
  }
  abstract public Seat getSeat(){}

}
