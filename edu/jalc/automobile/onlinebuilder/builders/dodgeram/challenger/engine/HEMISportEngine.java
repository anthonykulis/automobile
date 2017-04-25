package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.engine;

import edu.jalc.automobile.parts.engine.SportEngine;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class HEMISportEngine extends SportEngine{

  public HEMISportEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
   super(displacement,horsePower,torque,cylinders);
   }
  
  public String toString(){
    return "HEMI " + super.toString();
  }

}