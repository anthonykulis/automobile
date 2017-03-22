package edu.jalc.automobile.onlinebuilder.components.engine.economy.boosted.supercharged;

import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.parts.induction.SuperchargedInduction;
import edu.jalc.automobile.parts.exhaust.EconomyExhaust;

abstract public class SuperchargedEcoEngine extends BoostedEcoEngine{
  private SuperchargedInduction induction;

  public SuperchargedEcoEngine(EcoEngine engine, EconomyExhaust exhaust, SuperchargedInduction induction){
    super(engine,exhaust);
    this.induction = induction;
  }

  public SuperchargedInduction getInduction(){
    return this.induction;
  }

  public void setInduction(SuperchargedInduction induction){
   this.induction = induction;
  }
}
