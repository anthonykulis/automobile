package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.sxtsportblacktop;

import java.util.*;
import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.common.utils.prompter.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.paint.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.seatingandtrim.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.graphic.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.tires.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.wheels.*;
import edu.jalc.automobile.onlinebuilder.components.body.car.SedanBody;
import edu.jalc.automobile.onlinebuilder.components.driveline.DriveLine;
import edu.jalc.automobile.onlinebuilder.components.driveline.economic.EconomicFWD;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.EcoEngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.standard.StandardEcoEngine;
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
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;

public class SXTSportBlacktopBuilder implements DodgeRamBuilderInterface{
   Engine engine;
   Paint paint;
   SeatingAndTrim seatingAndTrim;
   Graphic graphic;
   Tire tire;
   Wheel wheel;
   
   public Automobile build() {
      SedanBody coupe = new SedanBody(new Quarterpanels(paint, graphic), new EngineCompartment(null), null, new StandardTrunk(0));
   
      DriveLine economicFWD = new EconomicFWD(new FrontDriveAxle(), new RearDeadAxle(), new ElectricSteering(), new OpenDifferential());
   
      EngineAssembly ecoEngineAssembly = new StandardEcoEngine(new EcoEngine(0, new HorsePower(160, 2), new Torque(184, 3), 4), new EconomyExhaust(), new NaturallyAspiratedInduction());
   
      Suspension economySuspension= new EconomySuspension(new StockShock(0), new StockSpring(0), new EconomyTire(10, 10), new AlloyWheel(0, tire));
   
      return new Automobile("Dodge", "Dart", "SXT Sport Blacktop", coupe, economicFWD, ecoEngineAssembly, economySuspension);
   }
   
   public SXTSportBlacktopBuilder askForPowerTrain(){
      TerminalPrompterBuilder promptBuilder = new TerminalPrompterBuilder();
      promptBuilder.addType("Engine");
      promptBuilder.addOption(new TwoLiterI4DOHCEngine());
      promptBuilder.sort();
      
      try{
         TerminalPrompter prompter = promptBuilder.build();
      
         int result = prompter.ask();
      
         engine = (Engine)promptBuilder.getOptions().get(0);
         
      } 
      catch(Exception e){
         e.printStackTrace();
         System.exit(1);
      }
      return this;
   }
   
   public SXTSportBlacktopBuilder askForColorAndInterior() {
      TerminalPrompterBuilder promptBuilder = new TerminalPrompterBuilder();
      promptBuilder.addType("Color");
      promptBuilder.addOption(new BilletSilverMetallicClearCoat());
      promptBuilder.addOption(new BrightWhiteClearCoat());
      promptBuilder.addOption(new B5BluePearlCoat());
      promptBuilder.addOption(new GoMango());
      promptBuilder.addOption(new GraniteCrystalMetallicClearCoat());
      promptBuilder.addOption(new PitchBlackClearCoat());
      promptBuilder.sort();
      
      ArrayList<Object> colors = promptBuilder.getOptions();
      
      try{
         TerminalPrompter prompter = promptBuilder.build();
      
         int result = prompter.ask();
      
         paint = (Paint)colors.get(result - 1);
      } 
      catch(Exception e){
         e.printStackTrace();
         System.exit(1);   
      }
            
      promptBuilder = new TerminalPrompterBuilder();
      promptBuilder.addType("Seating & Trim");
      promptBuilder.addOption(new SportClothSeatBlackInteriorColor());
      promptBuilder.addOption(new PremiumBlackLightTungstenInteriorColors());
      promptBuilder.addOption(new PremiumBlackRubyRedInteriorColors());
   
      ArrayList<Object> seatingAndTrims = promptBuilder.getOptions();
   
      try{
         int result = promptBuilder.build().ask();
      
         seatingAndTrim = (SeatingAndTrim)seatingAndTrims.get(result - 1);
      }
      catch(Exception e){
         e.printStackTrace();
         System.exit(1); 
      } 
      
      promptBuilder = new TerminalPrompterBuilder();
      promptBuilder.addType("Graphic");
      promptBuilder.addOption(new RoofHoodGrayStripe());
      promptBuilder.addOption(new RoofHoodDualGrayStripes());
      promptBuilder.addOption(new RoofHoodDualBlackStripes());
      promptBuilder.addOption(new FullHoodBlackRedStripe());
      promptBuilder.addOption(new BodySideRedRhombusStripe());
      promptBuilder.addOption(new BlackRedGrayGraphic());
   
      ArrayList<Object> stripes = promptBuilder.getOptions();
   
      try{
         int result = promptBuilder.build().ask();
      
         graphic = (Graphic)stripes.get(result - 1);
      }
      catch(Exception e){
         e.printStackTrace();
         System.exit(1); 
      } 
   
      return this;   
   }
   
   public SXTSportBlacktopBuilder askForOptions() {
   
      GraniteCrystalAlumWheel graniteCrystalAlumWheel = new GraniteCrystalAlumWheel(17);
      TerminalPrompterBuilder promptBuilder = new TerminalPrompterBuilder();
      promptBuilder.addType("Wheels");
      promptBuilder.addOption(graniteCrystalAlumWheel);
      promptBuilder.sort();
   
      try {
         int result = promptBuilder.build().ask();
         wheel = graniteCrystalAlumWheel;
      } 
      catch (Exception e) {
      
      }
      promptBuilder = new TerminalPrompterBuilder();
   
      AllSeasonTires allSeasonTires = new AllSeasonTires();
      allSeasonTires.setTireDetails("205/55R16");
   
      promptBuilder.addType("Tires");
      promptBuilder.addOption(allSeasonTires);
      promptBuilder.sort();
   
      try {
         int result = promptBuilder.build().ask();
         tire = allSeasonTires;
      } 
      catch (Exception e) {
      
      }   
   
      return this;
   }

   public SXTSportBlacktopBuilder askForPackages(){
      System.out.println("No packages avaliable");
      System.out.println("");
      return this;
   }
     
   public static void main(String[] args) throws Exception{
      System.out.println(new SXTSportBlacktopBuilder()
            .askForPowerTrain()
            .askForColorAndInterior()
            .askForOptions()
            .askForPackages()
            .build());  
   }
}