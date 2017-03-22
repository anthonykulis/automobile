package edu.jalc.automobile.onlinebuilder.components.engine.economy.standard;

import edu.jalc.automobile.parts.induction.NaturallyAspiratedInduction;
import edu.jalc.automobile.parts.exhaust.EconomyExhaust;
import edu.jalc.automobile.parts.engine.EcoEngine;

public class StandardEcoEngine extends EcoEngineAssembly{
  private NaturallyAspiratedInduction induction;

  public StandardEcoEngine(EcoEngine engine, EconomyExhaust exhaust, NaturallyAspiratedInduction induction){
   super(engine,exhaust);
   this.induction = induction;
  }

  public NaturallyAspiratedInduction getInduction(){
   return this.induction;
 }

  public void setInduction(NaturallyAspiratedInduction induction){
  this.induction = induction;
  }
}
