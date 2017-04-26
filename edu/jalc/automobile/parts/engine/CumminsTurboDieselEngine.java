package edu.jalc.automobile.parts.engine;

import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class CumminsTurboDieselEngine extends DieselEngine{

  HorsePower hp = new HorsePower(385, 0);
  Torque torque = new Torque(865, 0);

  private CumminsTurboDieselEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
  super(6.7,null,null,6);
  }

  public CumminsTurboDieselEngine(){
  super(6.7,new HorsePower(385, 0), new Torque(865, 0),6);
  }

  public String toString(){
    return super.toString() + " Cummins Turbo Diesel Engine";
  }
}
