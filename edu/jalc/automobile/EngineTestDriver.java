package edu.jalc.automobile;

import edu.jalc.automobile.onlinebuilder.components.engine.sport.*;
import edu.jalc.automobile.parts.engine.EngineTest;

public class EngineTestDriver{
   public static void main(String... args){
     EngineTest.main();
     SuperchargedSportEngineTest.main();
     TurbochargedSportEngineTest.main();
     NaturallyAspiratedSportEngineTest.main();
     System.out.println("All tests passed.");
   }
}
