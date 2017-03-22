package edu.jalc.automobile.onlinebuilder.components.engine.economy.standard;

import edu.jalc.automobile.parts.induction.NaturallyAspiratedInduction;
import edu.jalc.automobile.parts.exhaust.EconomyExhaust;
import edu.jalc.automobile.parts.engine.EcoEngine;

abstract public class StandardEcoEngine extends EcoEngineAssembly{
  private NaturallyAspiratedInduction intake;

  public StandardEcoEngine(EcoEngine engine, EconomyExhaust exhaust, NaturallyAspiratedInduction intake){
   super(engine,exhaust);
   this.intake = intake;
  }

 public NaturallyAspiratedInduction getIntake(){
   return this.intake;
 }

  public void getIntake(NaturallyAspiratedInduction intake){
  this.intake = intake;
  }
}
