package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.engine;

import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class EcoDieselEngine extends EcoEngine{

   public EcoDieselEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
   //displacement 3.0 cylinders6
      super(displacement,null,null,cylinders);
   }

   public String toString(){
      return "EcoDiesel" + super.toString();
   }
}
