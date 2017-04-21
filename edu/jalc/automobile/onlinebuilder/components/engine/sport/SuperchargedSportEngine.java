package edu.jalc.automobile.onlinebuilder.components.engine.sport;

import edu.jalc.automobile.parts.induction.SuperchargedInduction;
import edu.jalc.automobile.parts.exhaust.PerformanceExhaust;
import edu.jalc.automobile.parts.engine.SportEngine;

public class SuperchargedSportEngine extends BoostedSportEngine{
  private SuperchargedInduction induction;

  public SuperchargedSportEngine(SportEngine engine, PerformanceExhaust exhaust, SuperchargedInduction induction){
    super(engine,exhaust);
    this.induction = induction;
  }
  
  public String toString(){
    return super.toString() + "Induction: " + this.induction;
  }

  public SuperchargedInduction getInduction(){
    return this.induction;
  }
  
  public void setInduction(SuperchargedInduction induction){
  this.induction = induction;
  }
}
