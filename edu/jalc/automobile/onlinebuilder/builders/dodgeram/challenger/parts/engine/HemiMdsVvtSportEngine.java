package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.engine;

import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class HemiMdsVvtSportEngine extends HEMISportEngine{

  public HemiMdsVvtSportEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
   super(displacement,horsePower,torque,cylinders);
   }
  
  public String toString(){
    return "MDS VVT " + super.toString();
  }

}