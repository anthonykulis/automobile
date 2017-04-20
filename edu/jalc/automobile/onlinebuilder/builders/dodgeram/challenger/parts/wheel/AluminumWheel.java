package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.wheel;

import edu.jalc.automobile.parts.suspension.Wheel;

public class AluminumWheel extends Wheel{

  private String finish;
  private double width;

  public AluminumWheel(double size, double width, String finish){
    super(size);
    this.finish = finish;
    this.width = width;
  }

  public String toString(){
    return String.format("%f-inch x %f-inch %s Aluminum Wheels", this.getSize(), this.width, this.finish);
  }
}