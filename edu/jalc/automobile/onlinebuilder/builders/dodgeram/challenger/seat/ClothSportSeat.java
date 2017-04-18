package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.seat;

import edu.jalc.automobile.parts.body.seat.ClothSeat;

public class ClothSportSeat extends ClothSeat{

  private String description;

  public ClothSportSeat(String description){
    this.description = description;
  }
  
  public String toString(){
    return description + " Cloth Sport Seats";
  }

}