package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.engine;

import edu.jalc.automobile.parts.engine.SportEngine;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class VVT24ValveSportEngine extends SportEngine{

  public VVT24ValveSportEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
   super(displacement,horsePower,torque,cylinders);
   }
  
  public String toString(){
    return "24-Valve VVT" + super.toString();
  }

}