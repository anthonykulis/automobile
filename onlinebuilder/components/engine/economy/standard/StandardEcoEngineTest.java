package edu.jalc.automobile.onlinebuilder.components.engine.economy.standard;

import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.parts.induction.*;
import edu.jalc.automobile.parts.exhaust.*;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.EcoEngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class StandardEcoEngineTest{
  public static void main(String[] args){

    System.out.println("Testing StandardEcoEngine");
    testEngine();
    testExhaust();
    testInduction();
    System.out.println("All tests passed");
  }

  public static void testEngine(){
    StandardEcoEngine standardEcoEngine = new StandardEcoEngine(new EcoEngine(0,null,null,0), new EconomyExhaust(), new NaturallyAspiratedInduction());
    EcoEngine engine = new EcoEngine(300,new HorsePower(375,3000),new Torque(450,1500),6);
    standardEcoEngine.setEngine(engine);
    assert(standardEcoEngine.getEngine() == engine);
  }
  public static void testExhaust(){
    StandardEcoEngine standardEcoEngine = new StandardEcoEngine(new EcoEngine(0,null,null,0), new EconomyExhaust(), new NaturallyAspiratedInduction());
    EconomyExhaust exhaust = new EconomyExhaust();
    standardEcoEngine.setExhaust(exhaust);
    assert(standardEcoEngine.getExhaust() == exhaust);
  }
  public static void testInduction(){
    StandardEcoEngine standardEcoEngine = new StandardEcoEngine(new EcoEngine(0,null,null,0), new EconomyExhaust(), new NaturallyAspiratedInduction());
    NaturallyAspiratedInduction induction = new NaturallyAspiratedInduction();
    standardEcoEngine.setInduction(induction);
    assert(standardEcoEngine.getInduction() == induction);
  }
}
