package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.enigne;

import edu.jalc.automobile.parts.engine.DieselEngine;

public class EcoDieselEngine extends DieselEngine{

   public EcoDieselEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
      super(3.0,null,null,6);
   }

   public String toString(){
      return "EcoDiesel" + super.toString();
   }
}
