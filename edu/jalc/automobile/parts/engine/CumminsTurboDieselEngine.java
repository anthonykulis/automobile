package edu.jalc.automobile.parts.engine;

import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class CumminsTurboDieselEngine extends Engine{
  private CumminsTurboDieselEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
  super(6.7,null,null,6);
  }
  
  public CumminsTurboDieselEngine(){
  super(6.7,null,null,6);
  }
  
  public String toString(){
    return super.toString() + " Cummins Turbo Diesel Engine";
  }
}