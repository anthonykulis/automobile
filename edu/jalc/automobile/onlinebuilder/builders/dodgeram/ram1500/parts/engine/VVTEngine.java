package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.engine;

import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class VVTEngine extends EcoEngine{

   public VVTEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
      super(displacement,null,null,cylinders);
   
   }
  
   public String toString(){
      return "24 Valve VVT " + super.toString();
   }

}
