package edu.jalc.automobile.parts.engine;

import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class HeavyDutyHEMI extends Engine{
  private HeavyDutyHEMI(double displacement, HorsePower horsePower, Torque torque, int cylinders){
  super(0,null,null,0);
  }
  
  public HeavyDutyHEMI(){
  super(6.4,null,null,8);
  }
  
  public String toString(){
    return super.toString() + " Heavy Duty HEMI Engine with MDS";
  }
}