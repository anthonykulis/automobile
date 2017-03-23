package edu.jalc.automobile.onlinebuilder.components.engine.economy.boosted.turbocharged;

import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.parts.induction.TurbochargedInduction;
import edu.jalc.automobile.parts.exhaust.EconomyExhaust;

public class TurbochargedEcoEngine extends BoostedEcoEngine{
  private TurbochargedInduction induction;

  public TurbochargedEcoEngine(EcoEngine engine, EconomyExhaust exhaust, TurbochargedInduction induction){
    super(engine,exhaust);
    this.induction = induction;
  }

  public TurbochargedInduction getInduction(){
    return this.induction;
  }

 public void setInduction(TurbochargedInduction induction){
   this.induction = induction;
 }
}
