package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.wheel;

import edu.jalc.automobile.parts.suspension.Wheel;

public class CarbonAluminumWheel extends Wheel{

  private String finish;

  public CarbonAluminumWheel(double size, String finish){
    super(size);
    this.finish = finish;
  }

  public String toString(){
    return String.format("%f-inch %s Carbon Aluminum Wheels", super.getSize(), this.finish);
  }
}
