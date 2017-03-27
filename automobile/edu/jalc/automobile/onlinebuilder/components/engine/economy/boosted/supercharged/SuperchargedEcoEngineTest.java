package edu.jalc.automobile.onlinebuilder.components.engine.economy.boosted.supercharged;

import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.parts.induction.*;
import edu.jalc.automobile.parts.exhaust.*;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.boosted.BoostedEcoEngine;

public class SuperchargedEcoEngineTest{
  public static void main(String[] args){

    System.out.println("Testing SuperchargedEcoEngine");
    testEngine();
    testExhaust();
    testInduction();
    System.out.println("All tests passed");
  }

  public static void testEngine(){
    SuperchargedEcoEngine superchargedEcoEngine = new SuperchargedEcoEngine(new EcoEngine(0,null,null,0), new EconomyExhaust(), new SuperchargedInduction());
    EcoEngine engine = new EcoEngine(300,new HorsePower(375,3000),new Torque(450,1500),6);
    superchargedEcoEngine.setEngine(engine);
    assert(superchargedEcoEngine.getEngine() == engine);
  }
  public static void testExhaust(){
    SuperchargedEcoEngine superchargedEcoEngine = new SuperchargedEcoEngine(new EcoEngine(0,null,null,0), new EconomyExhaust(), new SuperchargedInduction());
    EconomyExhaust exhaust = new EconomyExhaust();
    superchargedEcoEngine.setExhaust(exhaust);
    assert(superchargedEcoEngine.getExhaust() == exhaust);
  }
  public static void testInduction(){
    SuperchargedEcoEngine superchargedEcoEngine = new SuperchargedEcoEngine(new EcoEngine(0,null,null,0), new EconomyExhaust(), new SuperchargedInduction());
    SuperchargedInduction induction = new SuperchargedInduction();
    superchargedEcoEngine.setInduction(induction);
    assert(superchargedEcoEngine.getInduction() == induction);
  }
}
