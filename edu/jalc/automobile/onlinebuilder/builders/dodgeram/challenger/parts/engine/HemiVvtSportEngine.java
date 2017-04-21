package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.engine;

import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class HemiVvtSportEngine extends HEMISportEngine{

  public HemiVvtSportEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
   super(displacement,horsePower,torque,cylinders);
   }
  
  public String toString(){
    return "VVT " + super.toString();
  }

}