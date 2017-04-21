package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.engine;

import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class HemiVVTEngine extends EcoEngine{

   public HemiVVTEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
   //displacement 5.7,cylinders 8
      super(displacement,horsePower,torque,cylinders);
   }
  
   public String toString(){
      return "HEMI VVT " + super.toString();
   }

}