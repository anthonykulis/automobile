package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.enigne;

import edu.jalc.automobile.parts.engine.DieselEngine;

public class EcoDieselEngine extends DieselEngine{

  public EcoDieselEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
    super(displacement, horsePower, torque, cylinders);
  }

  public String toString(){
    return "3.0-Liter V6 EcoDiesel" + super.toString();
  }
}
