package edu.jalc.automobile.onlinebuilder.components.engine.diesel;

import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.parts.engine.DieselEngine;
import edu.jalc.automobile.parts.exhaust.*;
import edu.jalc.automobile.parts.induction.TurbochargedInduction;

public class DieselEngineAssembly extends EngineAssembly{

  private DieselEngine engine;
  private Exhaust exhaust;
  private TurbochargedInduction induction;

  private DieselEngineAssembly(){
    this.engine = new DieselEngine(0,null,null,0);
    this.exhaust = new EconomyExhaust();
    this.induction = new TurbochargedInduction();
  }
  public DieselEngineAssembly(DieselEngine engine, Exhaust exhaust, TurbochargedInduction induction){
    this.engine = engine;
    this.exhaust = exhaust;
    this.induction = induction;
  }

  public String toString(){
    return super.toString() + "Turbocharged " + this.engine.toString() + " with a " + this.exhaust.toString();
  }

  public DieselEngine getEngine(){
    return this.engine;
  }
  public void setEngine(DieselEngine engine){
    this.engine = engine;
  }
  public Exhaust getExhaust(){
    return this.exhaust;
  }
  public void setExhaust(Exhaust exhaust){
    this.exhaust = exhaust;
  }
  public TurbochargedInduction getInduction(){
    return this.induction;
  }
  public void setInduction(TurbochargedInduction induction){
    this.induction = induction;
  }
}
