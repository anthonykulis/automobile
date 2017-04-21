package edu.jalc.automobile.onlinebuilder.components.engine.sport;

import edu.jalc.automobile.parts.induction.NaturallyAspiratedInduction;
import edu.jalc.automobile.parts.exhaust.PerformanceExhaust;
import edu.jalc.automobile.parts.engine.SportEngine;

public class NaturallyAspiratedSportEngine extends SportEngineAssembly{
  private NaturallyAspiratedInduction induction;

  public NaturallyAspiratedSportEngine(SportEngine engine, PerformanceExhaust exhaust, NaturallyAspiratedInduction induction){
    super(engine,exhaust);
    this.induction = induction;
  }
  
  public String toString(){
    return String.format("Engine:%n\tNaturally Aspirated %s with a %s",this.getEngine(),this.getExhaust());
  }

  public NaturallyAspiratedInduction getInduction(){
    return this.induction;
  }
  
   public void setInduction(NaturallyAspiratedInduction induction){
   this.induction = induction;
  }
}
