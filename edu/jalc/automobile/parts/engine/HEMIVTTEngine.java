package edu.jalc.automobile.parts.engine;

import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class HEMIVTTEngine extends Engine{

  private HEMIVTTEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
  super(0,null,null,0);
  }

  public HEMIVTTEngine(){
    super(5.7,new HorsePower(383, 0), new Torque(410, 0),8);
  }
  public String toString(){
    return super.toString() + " HEMI VTT Engine";
  }
}
