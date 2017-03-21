package edu.jalc.automobile.onlinebuilder.components.engine.sport;

public class SuperchargedSportEngine extends BoostedSportEngine{
  private SuperchargedInduction induction;

  public SuperchargedSportEngine(SportEngine engine, PerformanceExhaust exhaust, SuperchargedInduction induction){
    this.induction = induction;
    super(engine,exhaust);
  }

  public SuperchargedInduction getInduction(){
    return this.induction;
  }
}
