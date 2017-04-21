package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.sxt;

import java.util.*;
import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.common.utils.prompter.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
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
import edu.jalc.automobile.parts.body.seat.ClothSeat;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.exhaust.SingleExhaust;

public class SXTBuilder implements DodgeRamBuilderInterface{
   private EcoEngine engine;
   private Paint paint;
   private ClothSeat clothSeat;
   private Graphic graphic;
   private EconomyTire tire;
   private AlloyWheel wheel;
   
   public Automobile build() {
      SedanBody coupe = new SedanBody(new Quarterpanels(paint, graphic), new EngineCompartment(new Hood(paint, graphic)), new StandardCabin(clothSeat), new StandardTrunk(13.1));
   
      DriveLine economicFWD = new EconomicFWD(new FrontDriveAxle(), new RearDeadAxle(), new ElectricSteering(), new OpenDifferential());
   
      EngineAssembly ecoEngineAssembly = new StandardEcoEngine(engine, new SingleExhaust(), new NaturallyAspiratedInduction());
   
      Suspension economySuspension= new EconomySuspension(new StockShock(0), new StockSpring(0), tire, wheel);
   
      return new Automobile("Dodge", "Dart", "SXT", coupe, economicFWD, ecoEngineAssembly, economySuspension);
   }
   
   public SXTBuilder askForPowerTrain(){
      TerminalPrompterBuilder builder = new TerminalPrompterBuilder();
      builder.addType("Engine");
      builder.addOption(new TwoLiterI4DOHCEngine(2.0, new HorsePower(160, 0), new Torque(184, 0), 4));
      builder.sort();
      
      try{
         TerminalPrompter prompter = builder.build();
      
         int result = prompter.ask();
      
         engine = (EcoEngine)builder.getOptions().get(0);
         
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
      builder.addOption(new SportClothSeatBlackInteriorColor());
   
      ArrayList<Object> seats = builder.getOptions();
   
      try{
         int result = builder.build().ask();
      
         clothSeat = (ClothSeat)seats.get(result - 1);
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
      builder.addOption(new NoGraphic());
   
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
      builder.addType("Wheels");
      builder.addOption(new WheelCover(16, tire));
      builder.addOption(new GraniteCrystalAlumWheel(17, tire));
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
      
      builder = new TerminalPrompterBuilder();
      AllSeasonTires allSeasonTires = new AllSeasonTires();
      allSeasonTires.setTireDetails("205/55R16");
   
      builder.addType("Tires");
      builder.addOption(allSeasonTires);
      builder.sort();
   
      try {
         int result = builder.build().ask();
         tire = allSeasonTires;
      } 
      catch (Exception e) {
      
      }
        
      return this;
   }

   public SXTBuilder askForPackages(){
      System.out.println("No packages avaliable");
      System.out.println("");
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