package edu.jalc.automobile.parts.engine;

import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class DieselEngine extends Engine{
  public DieselEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
  super(displacement,horsePower,torque,cylinders);
  }
  public String toString(){
    return super.toString() + " diesel engine";
  }
}
