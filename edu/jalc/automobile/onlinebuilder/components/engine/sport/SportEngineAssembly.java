package edu.jalc.automobile.onlinebuilder.components.engine.sport;

import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.parts.exhaust.PerformanceExhaust;
import edu.jalc.automobile.parts.engine.SportEngine;

abstract public class SportEngineAssembly extends EngineAssembly{
  private PerformanceExhaust exhaust;
  private SportEngine engine;

  private SportEngineAssembly(){
    super();
    this.exhaust = new PerformanceExhaust();
    this.engine = new SportEngine(0,null,null,0);
  }
  public SportEngineAssembly(SportEngine engine, PerformanceExhaust exhaust){
    super();
    this.exhaust = exhaust;
    this.engine = engine;
  }
  
  public String toString(){
    return super.toString() + String.format("\tEngine: %s%n\tExhaust: %s%n",this.engine,this.exhaust);
  }

  public SportEngine getEngine(){
    return this.engine;
  }
  public PerformanceExhaust getExhaust(){
    return this.exhaust;
  }
  
  public void setEngine(SportEngine engine){
   this.engine = engine;
  }
  public void setExhaust(PerformanceExhaust exhaust){
  this.exhaust = exhaust;
  }
}
