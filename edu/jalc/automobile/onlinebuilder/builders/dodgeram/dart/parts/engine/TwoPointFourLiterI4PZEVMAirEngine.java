package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine;

import edu.jalc.automobile.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class TwoPointFourLiterI4PZEVMAirEngine extends EcoEngine{

   public TwoPointFourLiterI4PZEVMAirEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
      super(displacement,horsePower,torque,cylinders);
   }
  
   public String toString(){
      return "2.4-Liter I4 PZEV M-Air Engine";
   }
}