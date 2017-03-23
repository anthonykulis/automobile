package edu.jalc.automobile.onlinebuilder.components.engine.economy.boosted.turbocharged;

import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.parts.induction.*;
import edu.jalc.automobile.parts.exhaust.*;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class TurbochargedEcoEngineTest{
  public static void main(String[] args){

    System.out.println("Testing TurbochargedEcoEngine");
    testEngine();
    testExhaust();
    testInduction();
    System.out.println("All tests passed");
  }

  public static void testEngine(){
    TurbochargedEcoEngine turbochargedEcoEngine = new TurbochargedEcoEngine(new EcoEngine(0,null,null,0), new EconomyExhaust(), new TurbochargedInduction());
    EcoEngine engine = new EcoEngine(300,new HorsePower(375,3000),new Torque(450,1500),6);
    turbochargedEcoEngine.setEngine(engine);
    assert(turbochargedEcoEngine.getEngine() == engine);
  }
  public static void testExhaust(){
    TurbochargedEcoEngine turbochargedEcoEngine = new TurbochargedEcoEngine(new EcoEngine(0,null,null,0), new EconomyExhaust(), new TurbochargedInduction());
    EconomyExhaust exhaust = new EconomyExhaust();
    turbochargedEcoEngine.setExhaust(exhaust);
    assert(turbochargedEcoEngine.getExhaust() == exhaust);
  }
  public static void testInduction(){
    TurbochargedEcoEngine turbochargedEcoEngine = new TurbochargedEcoEngine(new EcoEngine(0,null,null,0), new EconomyExhaust(), new TurbochargedInduction());
    TurbochargedInduction induction = new TurbochargedInduction();
    turbochargedEcoEngine.setInduction(induction);
    assert(turbochargedEcoEngine.getInduction() == induction);
  }
}
