package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine;

import edu.jalc.automobile.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class TwoLiterI4DOHCEngine extends EcoEngine{

   public TwoLiterI4DOHCEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
      super(displacement,horsePower,torque,cylinders);
   }

   public String toString(){
      return "2.0-Liter I4 DOHC Engine";
   }
}