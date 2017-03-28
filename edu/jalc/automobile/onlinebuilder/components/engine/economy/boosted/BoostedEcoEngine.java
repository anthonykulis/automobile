package edu.jalc.automobile.onlinebuilder.components.engine.economy.boosted;

import edu.jalc.automobile.parts.exhaust.EconomyExhaust;
import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.EcoEngineAssembly;

abstract public class BoostedEcoEngine extends EcoEngineAssembly{
  public BoostedEcoEngine(EcoEngine engine, EconomyExhaust exhaust){
    super(engine, exhaust);
  }
}
