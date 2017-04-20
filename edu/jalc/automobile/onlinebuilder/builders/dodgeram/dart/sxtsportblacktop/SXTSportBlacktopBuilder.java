package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.sxtsportblacktop;

import java.util.*;
import java.util.ArrayList;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.common.utils.prompter.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.color.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.seatingandtrim.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.stripe.*;

public class SXTSportBlacktopBuilder /*implements DodgeRamBuilderInterface*/{
   Engine engine;
   Color color;
   SeatingAndTrim seatingAndTrim;
   Stripe stripe;
   TwoLiterI4DOHCEngine twoLiterI4DOHCEngine = new TwoLiterI4DOHCEngine();
   BilletSilverMetallicClearCoat billetSilverMetallicClearCoat = new BilletSilverMetallicClearCoat();  
   BrightWhiteClearCoat brigtWhiteClearCoat = new BrightWhiteClearCoat();
   B5BluePearlCoat b5BluePearlCoat = new B5BluePearlCoat();
   GoMango goMango = new GoMango();
   GraniteCrystalMetallicClearCoat graniteCrystalMetallicClearCoat = new GraniteCrystalMetallicClearCoat();       
   PitchBlackClearCoat pitchBlackClearCoat = new PitchBlackClearCoat(); 
   SeatingAndTrim sportClothSeatBlackInteriorColor= new SportClothSeatBlackInteriorColor();
   PremiumBlackLightTungstenInteriorColors premiumBlackLightTungstenInteriorColors = new PremiumBlackLightTungstenInteriorColors();
   PremiumBlackRubyRedInteriorColors premiumBlackRubyRedInteriorColors = new PremiumBlackRubyRedInteriorColors();
   
   public void askForPowerTrain(){
      TerminalPrompterBuilder promptBuilder = new TerminalPrompterBuilder();
      promptBuilder.addType("Engine");
      promptBuilder.addOption(twoLiterI4DOHCEngine);
      promptBuilder.sort();
      
      try{
         TerminalPrompter prompter = promptBuilder.build();
      
         int result = prompter.ask();
      
         engine = twoLiterI4DOHCEngine;
         
      } 
      catch(Exception e){
         e.printStackTrace();
         System.exit(1);
      }
   }
   
   public void askForColorAndInterior() {
      TerminalPrompterBuilder promptBuilder = new TerminalPrompterBuilder();
      promptBuilder.addType("Color");
      promptBuilder.addOption(billetSilverMetallicClearCoat);
      promptBuilder.addOption(brigtWhiteClearCoat);
      promptBuilder.addOption(b5BluePearlCoat);
      promptBuilder.addOption(goMango);
      promptBuilder.addOption(graniteCrystalMetallicClearCoat);
      promptBuilder.addOption(pitchBlackClearCoat);
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
      promptBuilder.addOption(sportClothSeatBlackInteriorColor);
      promptBuilder.addOption(premiumBlackLightTungstenInteriorColors);
      promptBuilder.addOption(premiumBlackRubyRedInteriorColors);
   
      ArrayList<Object> seatingAndTrims = promptBuilder.getOptions();
   
      try{
         int result = promptBuilder.build().ask();
      
         seatingAndTrim = (SeatingAndTrim)seatingAndTrims.get(result - 1);
      }
      catch(Exception e){
         e.printStackTrace();
         System.exit(1); 
      }    
   }
  
   public static void main(String[] args) throws Exception{
      SXTSportBlacktopBuilder test = new SXTSportBlacktopBuilder();
      test.askForPowerTrain();
      test.askForColorAndInterior();
      
   }
}