package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.wheel;

import edu.jalc.automobile.parts.suspension.ForgedWheel;

public class AluminumForgedWheel extends ForgedWheel{

  private String finish;
  private double width;

  public AluminumForgedWheel(double size, double width, String finish){
    super(size);
    this.finish = finish;
    this.width = width;
  }

  public String toString(){
    return String.format("%f-inch x %f-inch %s Aluminum Forged Wheels", this.getSize(), this.width, this.finish);
  }
}
