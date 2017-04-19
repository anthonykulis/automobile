package edu.jalc.automobile.onlinebuilder.components.engine.sport;

import edu.jalc.automobile.parts.induction.TurbochargedInduction;
import edu.jalc.automobile.parts.exhaust.PerformanceExhaust;
import edu.jalc.automobile.parts.engine.SportEngine;

public class TurbochargedSportEngine extends BoostedSportEngine{
  private TurbochargedInduction induction;

  public TurbochargedSportEngine(SportEngine engine, PerformanceExhaust exhaust, TurbochargedInduction induction){
    super(engine,exhaust);
    this.induction = induction;
  }
  
  public String toString(){
    return String.format("Engine:%n\tTurbocharged %s with a %s",this.getEngine(),this.getExhaust());
  }

  public TurbochargedInduction getInduction(){
    return this.induction;
  }
  
  public void setInduction(TurbochargedInduction induction){
   this.induction = induction;
  }
}
