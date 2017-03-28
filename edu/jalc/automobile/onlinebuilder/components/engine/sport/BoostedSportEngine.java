package edu.jalc.automobile.onlinebuilder.components.engine.sport;

import edu.jalc.automobile.parts.induction.TurbochargedInduction;
import edu.jalc.automobile.parts.exhaust.PerformanceExhaust;
import edu.jalc.automobile.parts.engine.SportEngine;

public class BoostedSportEngine extends SportEngineAssembly{
   public BoostedSportEngine(SportEngine engine, PerformanceExhaust exhaust){
      super(engine, exhaust);
   }
}
