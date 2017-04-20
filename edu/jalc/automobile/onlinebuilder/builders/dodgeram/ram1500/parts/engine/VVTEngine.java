package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.enigne;

import edu.jalc.automobile.parts.engine.Engine;

public class VVTEngine extends Engine{

  public VVTEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
    super(3.6, null, null, 6);
  }

  public String toString(){
    return "24 Valve VVTEngine" + super.toString();
  }
}
