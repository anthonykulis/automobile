package edu.jalc.automobile;

import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;
import edu.jalc.automobile.onlinebuilder.components.engine.sport.*;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.parts.exhaust.*;
import edu.jalc.automobile.parts.engine.*;
import edu.jalc.automobile.parts.induction.*;

public class EngineTestDriver{
   public static void main(String... args){
      SuperchargedSportEngineTest.main();
      TurbochargedSportEngineTest.main();
      NaturallyAspiratedSportEngineTest.main();
      System.out.println("All tests passed.");
   }
}