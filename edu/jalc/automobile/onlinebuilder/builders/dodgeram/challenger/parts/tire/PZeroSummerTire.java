package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.tire;

import edu.jalc.automobile.parts.suspension.SportTire;

public class PZeroSummerTire extends SportTire{

  private String description;

  public PZeroSummerTire(double height, double width, String description){
    super(height, width);
    this.description = description;
  }

  public String toString(){
    return this.description + " P Zero Summer Tires";
  }

}
