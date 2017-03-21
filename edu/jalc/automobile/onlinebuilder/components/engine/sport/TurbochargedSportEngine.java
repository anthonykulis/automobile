package edu.jalc.automobile.onlinebuilder.components.engine.sport;

public class TurbochargedSportEngine extends BoostedSportEngine{
  private TurbochargedInduction induction;

  public TurbochargedSportEngine(SportEngine engine, PerformanceExhaust exhaust, TurbochargedInduction induction){
    this.induction = induction;
    super(engine,exhaust);
  }

  public TurbochargedInduction getInduction(){
    return this.induction;
  }
}
