package edu.jalc.automobile.parts.engine;

import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class SportEngine extends Engine{
   public SportEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
   super(displacement,horsePower,torque,cylinders);
   }
   public String toString(){
     return super.toString() + " sport engine";
   }
}
