package edu.jalc.automobile.parts;

public class StandardCabin extends Cabin{

  public StandardCabin(ClothSeat clothSeat){
    super(clothSeat);
  }

  public ClothSeat getSeat(){
    return (ClothSeat) this.getSeat();
  }
}
