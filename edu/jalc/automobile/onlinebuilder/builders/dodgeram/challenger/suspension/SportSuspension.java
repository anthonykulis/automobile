package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.suspension;

import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;
import edu.jalc.automobile.parts.suspension.*;

public class SportSuspension extends Suspension{

  private MediumSpring spring;
  private StockShock shock;
  private SportTire tire;
  private Wheel wheel;
  
  public SportSuspension(StockShock shock, MediumSpring spring, SportTire tire, Wheel wheel){
    this.shock = shock;
    this.spring = spring;
    this.tire = tire;
    this.wheel = wheel;
  }
  
  public String toString(){
    return String.format("Sport Suspension with: %n\t%s, %n\t%s, %n\t%s, %n\t%s",
      this.spring,this.shock,this.wheel,this.tire);
  }
}