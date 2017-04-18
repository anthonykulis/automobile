package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.cabin;

import edu.jalc.automobile.parts.body.Cabin;

public class FinishedCabin extends Cabin{

  private Interior interior;

  public FinishedCabin(Seat seat, Interior interior){
    this.interior = interior;
  }
  
  public String toString(){
    return this.interior + this.seat;
  }
}