package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.wheel;

import edu.jalc.automobile.parts.suspention.Wheel;

public class CarbonAluminumWheel extends Wheel{

  private String finish;

  public CarbonAluminumWheel(double size, String finish){
    super(size);
    this.finish = finish;
  }

  public String toString(){
    return String.format("%d-inch %s Carbon Aluminum Wheels", super.getSize(), this.finish);
  }
}
