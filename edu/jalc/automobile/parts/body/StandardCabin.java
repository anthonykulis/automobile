package edu.jalc.automobile.parts.body;

import edu.jalc.automobile.parts.body.seat.ClothSeat;

public class StandardCabin extends Cabin{

  public StandardCabin(ClothSeat clothSeat){
    super(clothSeat);
  }

  public ClothSeat getSeat(){
    return (ClothSeat) super.getSeat();
  }
  
  public String toString(){
    return "Standard Cabin with " + super.getSeat();
  }
}
