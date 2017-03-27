package edu.jalc.automobile.onlinebuilder.components.engine.sport;

import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.parts.exhaust.PerformanceExhaust;
import edu.jalc.automobile.parts.engine.SportEngine;
import edu.jalc.automobile.parts.induction.NaturallyAspiratedInduction;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class NaturallyAspiratedSportEngineTest{
   public static void main(String... args){
      System.out.print("testing NaturallyAspiratedSportEngine");
      testEngine();
      testExhaust();
      testInduction();
      System.out.println(" - all tests passed");
   }

   public static void testEngine(){
         //construct a NaturallyAspiratedSportEngine with valid parts, but with nulls and zeros only
      NaturallyAspiratedSportEngine ScSEngine = new NaturallyAspiratedSportEngine(new SportEngine(0,null,null,0), new PerformanceExhaust(), new NaturallyAspiratedInduction());
         //create an engine
      SportEngine engine = new SportEngine(300,new HorsePower(375,3000),new Torque(450,1500),6);
         //set the engine
      ScSEngine.setEngine(engine);
         //test that it is returned correctly
      assert(ScSEngine.getEngine() == engine);
   }
   public static void testExhaust(){
         //construct a NaturallyAspiratedSportEngine with valid parts, but with nulls and zeros only
      NaturallyAspiratedSportEngine ScSEngine = new NaturallyAspiratedSportEngine(new SportEngine(0,null,null,0), new PerformanceExhaust(), new NaturallyAspiratedInduction());
         //create a new exhaust
      PerformanceExhaust exhaust = new PerformanceExhaust();
         //set the engine's exhaust
      ScSEngine.setExhaust(exhaust);
         //test that it is returned correctly
      assert(ScSEngine.getExhaust() == exhaust);
   }
   public static void testInduction(){
         //construct a NaturallyAspiratedSportEngine with valid parts, but with nulls and zeros only
      NaturallyAspiratedSportEngine ScSEngine = new NaturallyAspiratedSportEngine(new SportEngine(0,null,null,0), new PerformanceExhaust(), new NaturallyAspiratedInduction());
         //create a new induction
      NaturallyAspiratedInduction induction = new NaturallyAspiratedInduction();
         //set the engine's induction
      ScSEngine.setInduction(induction);
         //test that it is returned correctly
      assert(ScSEngine.getInduction() == induction);
   }
}
