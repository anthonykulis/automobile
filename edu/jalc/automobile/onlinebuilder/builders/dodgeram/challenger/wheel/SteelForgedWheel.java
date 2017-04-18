package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.wheel;

import edu.jalc.automobile.parts.suspension.ForgedWheel;

public class SteelForgedWheel extends ForgedWheel{

  private String finish;
  private double width;

  public SteelForgedWheel(double size, double width, String finish){
    super(size);
    this.finish = finish;
    this.width = width;
  }

  public String toString(){
    return String.format("%d-inch x %d-inch %s Steel Forged Wheels", this.getSize(), this.width, this.finish);
  }
}
