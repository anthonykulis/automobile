package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.sxtsportblacktop;

import java.util.*;
import java.util.ArrayList;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.common.utils.prompter.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.color.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.seatingandtrim.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.stripe.*;

public class SXTSportBlacktopBuilder{
   Engine engine;
   Color color;
   SeatingAndTrim seatingAndTrim;
   Stripe stripe;
   
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
      return this;   
   }
  
   public static void main(String[] args) throws Exception{
      new SXTSportBlacktopBuilder()
            .askForPowerTrain()
            .askForColorAndInterior();
            //.build();  
   }
}