package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.enigne;

import edu.jalc.automobile.parts.engine.Engine;

public class HemiEngine extends Engine{

  public HemiEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
    super(displacement, horsePower, torque, cylinders);
  }

  public String toString(){
    return "Hemi" + super.toString();
  }
}
