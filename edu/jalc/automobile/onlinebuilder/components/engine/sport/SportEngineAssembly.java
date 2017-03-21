package edu.jalc.automobile.onlinebuilder.components.engine.sport;

import edu.jalc.automobile.parts.exhaust.PerformanceExhaust;
import edu.jalc.automobile.parts.engine.SportEngine;

abstract public class SportEngineAssembly extends EngineAssembly{
  private PerformanceExhaust exhaust;
  private SportEngine engine;

  private SportEngineAssembly(){
    this.exhaust = this.engine = null;
  }
  public SportEngineAssembly(SportEngine engine, Exhaust exhaust){
    this.exhaust = exhaust;
    this.engine = engine;
  }

  public SportEngine getEngine(){
    return this.engine;
  }
  public PerformanceExhaust getExhaust(){
    return this.exhaust;
  }
}
