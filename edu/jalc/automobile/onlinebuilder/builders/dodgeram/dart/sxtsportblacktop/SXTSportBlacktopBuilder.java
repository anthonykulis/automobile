package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.sxtsportblacktop;

import java.util.*;
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
   
   public void askForPowerTrain(/*TerminalPrompterBuilderInterface promptBuilder*/) throws Exception{
      TerminalPrompterBuilder builder = TerminalPrompterBuilder.newBuilder();
      builder.addType("Engine");
      builder.addOption(twoLiterI4DOHCEngine);
      builder.sort();
      TerminalPrompter prompter = builder.build();
   
      int result = prompter.ask();
   
      assert(result == 1);
      
      engine = twoLiterI4DOHCEngine;
   }
   
   public void askForColorAndInterior(/*TerminalPrompterBuilderInterface promptBuilder*/) throws Exception{
      TerminalPrompterBuilder builder = TerminalPrompterBuilder.newBuilder();
      builder.addType("Color");
      builder.addOption(billetSilverMetallicClearCoat);
      builder.addOption(brigtWhiteClearCoat);
      builder.addOption(b5BluePearlCoat);
      builder.addOption(goMango);
      builder.addOption(graniteCrystalMetallicClearCoat);
      builder.addOption(pitchBlackClearCoat);
      builder.sort();
      TerminalPrompter prompter = builder.build();
   
      int result = prompter.ask();
   
      assert(result > 0 && result < 7);
      
      switch (result){
         case 1: 
            color = billetSilverMetallicClearCoat;
            break;
         
         case 2:
            color = brigtWhiteClearCoat;
            break;
            
         case 3:
            color = b5BluePearlCoat;
            break;
            
         case 4:
            color = goMango;
            break;
         
         case 5:
            color = graniteCrystalMetallicClearCoat;
            break; 
            
         case 6:
            color = pitchBlackClearCoat;
            break;     
      }
   }
  
   //will delete    
   public static void main(String[] args) throws Exception{
      SXTSportBlacktopBuilder test = new SXTSportBlacktopBuilder();
      test.askForPowerTrain();
      test.askForColorAndInterior();
      
   }
}