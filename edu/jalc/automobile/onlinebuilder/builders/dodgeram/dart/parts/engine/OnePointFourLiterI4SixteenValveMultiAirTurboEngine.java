package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine;

import edu.jalc.automobile.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class OnePointFourLiterI4SixteenValveMultiAirTurboEngine extends EcoEngine{

   public OnePointFourLiterI4SixteenValveMultiAirTurboEngine(double displacement, HorsePower horsePower, Torque torque, int cylinders){
      super(displacement,horsePower,torque,cylinders);
   }

   public String toString(){
      return "1.4-Liter I4 16-Valve MultiAir Turbo Engine";
   }
}