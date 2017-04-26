package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.seat;

import edu.jalc.automobile.parts.body.seat.ClothSeat;

public class ClothBucketSeat extends ClothSeat{

  private String description;

  public ClothBucketSeat(String description){
    this.description = description;
  }
  
  public String toString(){
    return description + " Cloth Bucket Seats";
  }

}