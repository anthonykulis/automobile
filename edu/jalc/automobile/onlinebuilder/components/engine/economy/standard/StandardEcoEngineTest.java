package edu.jalc.automobile.onlinebuilder.components.engine.economy.boosted.naturallyAspirated;

import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.parts.induction.*;
import edu.jalc.automobile.parts.exhaust.*;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class NaturallyAspiratedEcoEngineTest{
  public static void main(String[] args){

    System.out.println("Testing NaturallyAspiratedEcoEngine");
    testEngine();
    testExhaust();
    testInduction();
    System.out.println("All tests passed");
  }

  public static void testEngine(){
    NaturallyAspiratedEcoEngine naturallyAspiratedEcoEngine = new NaturallyAspiratedEcoEngine(new EcoEngine(0,null,null,0), new EconomyExhaust(), new NaturallyAspiratedInduction());
    EcoEngine engine = new EcoEngine(300,new HorsePower(375,3000),new Torque(450,1500),6);
    naturallyAspiratedEcoEngine.setEngine(engine);
    assert(naturallyAspiratedEcoEngine.getEngine() == engine);
  }
  public static void testExhaust(){
    NaturallyAspiratedEcoEngine naturallyAspiratedEcoEngine = new NaturallyAspiratedEcoEngine(new EcoEngine(0,null,null,0), new EconomyExhaust(), new NaturallyAspiratedInduction());
    EconomyExhaust exhaust = new EconomyExhaust();
    naturallyAspiratedEcoEngine.setExhaust(exhaust);
    assert(naturallyAspiratedEcoEngine.getExhaust() == exhaust);
  }
  public static void testInduction(){
    NaturallyAspiratedEcoEngine naturallyAspiratedEcoEngine = new NaturallyAspiratedEcoEngine(new EcoEngine(0,null,null,0), new EconomyExhaust(), new NaturallyAspiratedInduction());
    NaturallyAspiratedInduction induction = new NaturallyAspiratedInduction();
    naturallyAspiratedEcoEngine.setInduction(induction);
    assert(naturallyAspiratedEcoEngine.getInduction() == induction);
  }
}
