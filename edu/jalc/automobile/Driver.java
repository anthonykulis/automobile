package edu.jalc.automobile;

import edu.jalc.automobile.onlinebuilder.components.engine.sport.TurbochargedSportEngine;
import edu.jalc.automobile.parts.exhaust.PerformanceExhaust;
import edu.jalc.automobile.parts.engine.SportEngine;
import edu.jalc.automobile.parts.induction.TurbochargedInduction;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;
  //just to test toString for now
public class Driver{
  public static void main(String... args){
    SportEngine engine = new SportEngine(300,new HorsePower(375,3000),new Torque(450,1500),6);
    PerformanceExhaust exhaust = new PerformanceExhaust();
    TurbochargedInduction induction = new TurbochargedInduction();
    TurbochargedSportEngine turboEngine = new TurbochargedSportEngine(engine, exhaust, induction);
    System.out.println(turboEngine.toString());
  }
}