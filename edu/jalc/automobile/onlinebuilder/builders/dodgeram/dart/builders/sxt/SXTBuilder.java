package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.builders.sxt;

import java.util.*;
import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.common.utils.prompter.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.DartBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.paint.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.seatingandtrim.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.graphic.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.tires.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.wheels.*;
import edu.jalc.automobile.onlinebuilder.components.body.car.SedanBody;
import edu.jalc.automobile.onlinebuilder.components.driveline.DriveLine;
import edu.jalc.automobile.onlinebuilder.components.driveline.economic.EconomicFWD;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.EcoEngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.standard.StandardEcoEngine;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;
import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;
import edu.jalc.automobile.onlinebuilder.components.suspension.economy.EconomySuspension;
import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.parts.exhaust.*;
import edu.jalc.automobile.parts.induction.NaturallyAspiratedInduction;
import edu.jalc.automobile.parts.suspension.Tire;
import edu.jalc.automobile.parts.suspension.Wheel;
import edu.jalc.automobile.parts.body.*;
import edu.jalc.automobile.parts.suspension.*;
import edu.jalc.automobile.parts.driveline.*;
import edu.jalc.automobile.parts.body.seat.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.exhaust.*;

public class SXTBuilder implements DartBuilderInterface{
   private EcoEngine engine;
   private Paint paint;
   private Seat seat;
   private Graphic graphic;
   private EconomyTire tire;
   private AlloyWheel wheel;
   private EconomyExhaust exhaust;
   private Cabin cabin;
   
   public Automobile build() {
      SedanBody coupe = new SedanBody(new Quarterpanels(paint, graphic), new EngineCompartment(new Hood(paint, graphic)), cabin, new StandardTrunk(13.1));
   
      DriveLine economicFWD = new EconomicFWD(new FrontDriveAxle(), new RearDeadAxle(), new ElectricSteering(), new OpenDifferential());
   
      EngineAssembly ecoEngineAssembly = new StandardEcoEngine(engine, exhaust, new NaturallyAspiratedInduction());
   
      Suspension economySuspension= new EconomySuspension(new StockShock(0), new StockSpring(0), tire, wheel);
   
      return new Automobile("Dodge", "Dart", "SXT", coupe, economicFWD, ecoEngineAssembly, economySuspension);
   }
   
   public SXTBuilder askForPowerTrain(){
      TerminalPrompterBuilder builder = new TerminalPrompterBuilder();
      builder.addType("Engine");
      builder.addOption(new TwoPointFourLiterI4MultiAirEngine(2.4, new HorsePower(160, 0), new Torque(184, 0), 4));
      builder.addOption(new TwoPointFourLiterI4PZEVMAirEngine(2.4, new HorsePower(160, 0), new Torque(184, 0), 4));
      builder.sort();
      
      ArrayList<Object> engines = builder.getOptions();
      
      try{
         TerminalPrompter prompter = builder.build();
      
         int result = prompter.ask();
      
         engine = (EcoEngine)engines.get(result - 1);
         
      } 
      catch(Exception e){
         e.printStackTrace();
         System.exit(1);
      }
      return this;
   }
      
   public SXTBuilder askForColorAndInterior() {
      TerminalPrompterBuilder builder = TerminalPrompterBuilder.newBuilder();
      builder.addType("Color");
      builder.addOption(new BilletSilverMetallicClearCoat());
      builder.addOption(new BrightWhiteClearCoat());
      builder.addOption(new PitchBlackClearCoat());
      builder.addOption(new GraniteCrystalMetallicClearCoat());
      builder.addOption(new GoMango());
      builder.sort();
      
      ArrayList<Object> colors = builder.getOptions();
      
      try{
         TerminalPrompter prompter = builder.build();
      
         int result = prompter.ask();
      
         paint = (Paint)colors.get(result - 1);
      } 
      catch(Exception e){
         e.printStackTrace();
         System.exit(1);   
      }
   
      
      builder = TerminalPrompterBuilder.newBuilder();
      builder.addType("Seating");
      builder.addOption(new PremiumBlackRubyRedInteriorColors());
      builder.addOption(new PremiumClothSeatsBlackLightFrostInteriorColor());
      builder.addOption(new PremiumBlackLightTungstenInteriorColors());
      builder.addOption(new PremiumClothSeatBlackInteriorColor());
      builder.addOption(new KatzkinBlackRedLeather());
      builder.addOption(new KatzkinBlackAshLeather());
      builder.addOption(new KatzkinBlackLeather());
      ArrayList<Object> seats = builder.getOptions();
   
      try{
      
         int result = builder.build().ask();
         if (result < 5){
            seat = (ClothSeat)seats.get(result - 1);
            cabin = new StandardCabin((ClothSeat)seat);
         } 
         else {
            seat = (LeatherSeat)seats.get(result - 1);
            cabin = new LuxuryCabin((LeatherSeat)seat);
         }
      }
      catch(Exception e){
         e.printStackTrace();
         System.exit(1); 
      } 
      
      builder = new TerminalPrompterBuilder();
      builder.addType("Graphic");
      builder.addOption(new RoofHoodGrayStripe());
      builder.addOption(new RoofHoodDualGrayStripes());
      builder.addOption(new RoofHoodDualBlackStripes());
      builder.addOption(new FullHoodBlackRedStripe());
      builder.addOption(new BodySideRedRhombusStripe());
      builder.addOption(new BlackRedGrayGraphic());
      builder.addOption(new NoSelection());
   
      ArrayList<Object> stripes = builder.getOptions();
   
      try{
         int result = builder.build().ask();
      
         graphic = (Graphic)stripes.get(result - 1);
      }
      catch(Exception e){
         e.printStackTrace();
         System.exit(1); 
      } 
   
      return this;   
   }
   
   public SXTBuilder askForOptions() {
      
      TerminalPrompterBuilder builder = new TerminalPrompterBuilder();
      AllSeasonTires allSeasonTiresOptionOne = new AllSeasonTires();
      allSeasonTiresOptionOne.setTireDetails("205/55R16");
      AllSeasonTires allSeasonTiresOptionTwo = new AllSeasonTires();
      allSeasonTiresOptionTwo.setTireDetails("225/45R17");
      AllSeasonTires allSeasonTiresOptionThree = new AllSeasonTires();
      allSeasonTiresOptionThree.setTireDetails("225/40R18");
      builder.addType("Tires");
      builder.addOption(allSeasonTiresOptionOne);
      builder.addOption(allSeasonTiresOptionTwo);
      builder.addOption(allSeasonTiresOptionThree);
      builder.sort();
   
      ArrayList<Object> tires = builder.getOptions();
   
      try {
         int result = builder.build().ask();
         tire = (EconomyTire)tires.get(result - 1);
      } 
      catch (Exception e) {
         e.printStackTrace();
         System.exit(1);
      }
   
      
      builder = new TerminalPrompterBuilder();
      builder.addType("Wheels");
      builder.addOption(new SilverAlumWheel(16, tire));
      builder.addOption(new GraniteCrystalAlumWheel(17, tire));
      builder.addOption(new GlossBlack10SpokeAlumWheel(18, tire));
      builder.sort();
   
      ArrayList<Object> wheels = builder.getOptions();
   
      try {
         int result = builder.build().ask();
         
         wheel = (AlloyWheel)wheels.get(result - 1);
         
      } 
      catch (Exception e) {
         e.printStackTrace();
         System.exit(1); 
      } 
       
      return this;
   }

   public SXTBuilder askForPackages(){
      TerminalPrompterBuilder builder = new TerminalPrompterBuilder();
      builder.addType("Exhaust");
      builder.addOption(new SingleExhaust());
      builder.addOption(new DoubleExhaust());
      builder.sort();
   
      ArrayList<Object> exhausts = builder.getOptions();
   
      try {
         int result = builder.build().ask();
         
         exhaust = (EconomyExhaust)exhausts.get(result - 1);
         
      } 
      catch (Exception e) {
         e.printStackTrace();
         System.exit(1); 
      } 
       
      return this;
   }

   public static void main(String[] args) throws Exception{
      System.out.println(new SXTBuilder()
            .askForPowerTrain()
            .askForColorAndInterior()
            .askForOptions()
            .askForPackages()
            .build());  
   }

}