<<<<<<< HEAD
package edu.jalc.automobile.onlinebuilder.components.engine.sport;

import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.parts.exhaust.PerformanceExhaust;
import edu.jalc.automobile.parts.engine.SportEngine;
import edu.jalc.automobile.parts.induction.TurbochargedInduction;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class TurbochargedSportEngineTest{
   public static void main(String... args){
      System.out.print("testing TurbochargedSportEngine");
      testEngine();
      testExhaust();
      testInduction();
      System.out.println(" - all tests passed");
   }

   public static void testEngine(){
         //construct a TurbochargedSportEngine with valid parts, but with nulls and zeros only
      TurbochargedSportEngine TcSEngine = new TurbochargedSportEngine(new SportEngine(0,null,null,0), new PerformanceExhaust(), new TurbochargedInduction());
         //create an engine
      SportEngine engine = new SportEngine(300,new HorsePower(375,3000),new Torque(450,1500),6);
         //set the engine
      TcSEngine.setEngine(engine);
         //test that it is returned correctly
      assert(TcSEngine.getEngine() == engine);
   }
   public static void testExhaust(){
         //construct a TurbochargedSportEngine with valid parts, but with nulls and zeros only
      TurbochargedSportEngine TcSEngine = new TurbochargedSportEngine(new SportEngine(0,null,null,0), new PerformanceExhaust(), new TurbochargedInduction());
         //create a new exhaust
      PerformanceExhaust exhaust = new PerformanceExhaust();
         //set the engine's exhaust
      TcSEngine.setExhaust(exhaust);
         //test that it is returned correctly
      assert(TcSEngine.getExhaust() == exhaust);
   }
   public static void testInduction(){
         //construct a TurbochargedSportEngine with valid parts, but with nulls and zeros only
      TurbochargedSportEngine TcSEngine = new TurbochargedSportEngine(new SportEngine(0,null,null,0), new PerformanceExhaust(), new TurbochargedInduction());
         //create a new induction
      TurbochargedInduction induction = new TurbochargedInduction();
         //set the engine's induction
      TcSEngine.setInduction(induction);
         //test that it is returned correctly
      assert(TcSEngine.getInduction() == induction);
   }
}
=======
package edu.jalc.automobile.onlinebuilder.components.engine.sport;

import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.parts.exhaust.PerformanceExhaust;
import edu.jalc.automobile.parts.engine.SportEngine;
import edu.jalc.automobile.parts.induction.TurbochargedInduction;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class TurbochargedSportEngineTest{
   public static void main(String... args){
      System.out.print("testing TurbochargedSportEngine");
      testEngine();
      testExhaust();
      testInduction();
      System.out.println(" - all tests passed");
   }

   public static void testEngine(){
         //construct a TurbochargedSportEngine with valid parts, but with nulls and zeros only
      TurbochargedSportEngine TcSEngine = new TurbochargedSportEngine(new SportEngine(0,null,null,0), new PerformanceExhaust(), new TurbochargedInduction());
         //create an engine
      SportEngine engine = new SportEngine(300,new HorsePower(375,3000),new Torque(450,1500),6);
         //set the engine
      TcSEngine.setEngine(engine);
         //test that it is returned correctly
      assert(TcSEngine.getEngine() == engine);
   }
   public static void testExhaust(){
         //construct a TurbochargedSportEngine with valid parts, but with nulls and zeros only
      TurbochargedSportEngine TcSEngine = new TurbochargedSportEngine(new SportEngine(0,null,null,0), new PerformanceExhaust(), new TurbochargedInduction());
         //create a new exhaust
      PerformanceExhaust exhaust = new PerformanceExhaust();
         //set the engine's exhaust
      TcSEngine.setExhaust(exhaust);
         //test that it is returned correctly
      assert(TcSEngine.getExhaust() == exhaust);
   }
   public static void testInduction(){
         //construct a TurbochargedSportEngine with valid parts, but with nulls and zeros only
      TurbochargedSportEngine TcSEngine = new TurbochargedSportEngine(new SportEngine(0,null,null,0), new PerformanceExhaust(), new TurbochargedInduction());
         //create a new induction
      TurbochargedInduction induction = new TurbochargedInduction();
         //set the engine's induction
      TcSEngine.setInduction(induction);
         //test that it is returned correctly
      assert(TcSEngine.getInduction() == induction);
   }
}
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
