package edu.jalc.automobile.onlinebuilder.components.engine.economy;

import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.parts.exhaust.EconomyExhaust;
import edu.jalc.automobile.parts.engine.EcoEngine;

 public class EcoEngineAssembly extends EngineAssembly{
  private EconomyExhaust exhaust;
  private EcoEngine engine;

  private EcoEngineAssembly(){
    super();
    this.exhaust = new EconomyExhaust();
    this.engine = new EcoEngine(0,null,null,0);
  }

  public EcoEngineAssembly(EcoEngine engine, EconomyExhaust exhaust){
   super();
   this.exhaust = exhaust;
   this.engine = engine;
  }

  public EcoEngine getEngine(){
    return this.engine;
  }

  public EconomyExhaust getExhaust(){
    return this.exhaust;
  }

  public void setEngine(EcoEngine engine){
   this.engine = engine;
  }

  public void setExhaust(EconomyExhaust exhaust){
  this.exhaust = exhaust;
  }
  
  public String toString(){
    return super.toString() + this.engine.toString()  + " with a " + this.exhaust.toString();
  }
}
