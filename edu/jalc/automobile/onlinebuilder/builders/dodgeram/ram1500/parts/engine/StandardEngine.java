package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.enigne;

import edu.jalc.automobile.parts.engine.Engine;

public class StandardEngine extends Engine{

  public StandardEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
    super(displacement, horsePower, torque, cylinders);
  }

  public String toString(){
    return "3.6-Liter V6 24 Valve VVT" + super.toString();
  }
}
