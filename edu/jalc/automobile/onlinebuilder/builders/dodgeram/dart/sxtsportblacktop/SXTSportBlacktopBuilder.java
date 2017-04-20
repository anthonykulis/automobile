package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.sxtsportblacktop;

import java.util.*;
//import java.util.ArrayList;
import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.common.utils.prompter.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.color.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.seatingandtrim.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.stripe.*;
import edu.jalc.automobile.onlinebuilder.components.body.car.SedanBody;
import edu.jalc.automobile.onlinebuilder.components.driveline.DriveLine;
import edu.jalc.automobile.onlinebuilder.components.driveline.economic.EconomicFWD;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.EcoEngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.standard.StandardEcoEngine;
import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;
import edu.jalc.automobile.onlinebuilder.components.suspension.economy.EconomySuspension;
import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.parts.suspension.Tire;
import edu.jalc.automobile.parts.suspension.Wheel;


public class SXTSportBlacktopBuilder{
   Engine engine;
   Color color;
   SeatingAndTrim seatingAndTrim;
   Stripe stripe;
   
   public Automobile build() {
      SedanBody coupe = new SedanBody(null, null, null, null);
   
      DriveLine economicFWD = new EconomicFWD(null, null, null, null);
   
      EngineAssembly ecoEngineAssembly = new StandardEcoEngine(null, null, null);
   
      Suspension economySuspension= new EconomySuspension(null, null, null, null);
   
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
      
         color = (Color)colors.get(result - 1);
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
      promptBuilder.addType("Stripe");
      promptBuilder.addOption(new RoofHoodGrayStripe());
      promptBuilder.addOption(new RoofHoodDualGrayStripes());
      promptBuilder.addOption(new RoofHoodDualBlackStripes());
      promptBuilder.addOption(new FullHoodBlackRedStripe());
      promptBuilder.addOption(new BodySideRedRhombusStripe());
      promptBuilder.addOption(new BlackRedGrayGraphic());
   
      ArrayList<Object> stripes = promptBuilder.getOptions();
   
      try{
         int result = promptBuilder.build().ask();
      
         stripe = (Stripe)stripes.get(result - 1);
      }
      catch(Exception e){
         e.printStackTrace();
         System.exit(1); 
      } 

      return this;   
   }
  
   public static void main(String[] args) throws Exception{
      new SXTSportBlacktopBuilder()
            .askForPowerTrain()
            .askForColorAndInterior()
            .build();  
   }
}