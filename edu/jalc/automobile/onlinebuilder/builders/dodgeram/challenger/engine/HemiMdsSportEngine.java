package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.engine;

import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class HemiMdsSportEngine extends HEMISportEngine{

  public HemiMdsSportEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
   super(displacement,horsePower,torque,cylinders);
   }
  
  public String toString(){
    return "MDS " + super.toString();
  }

}