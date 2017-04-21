package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.builders;

import java.util.*;
import edu.jalc.automobile.parts.body.Paint;
import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.axle.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.seating.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.exteriorpaint.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.drive.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.wheels.*;
import edu.jalc.automobile.common.utils.prompter.*;

public class Ram1500LimitedBuilder implements DodgeRamBuilderInterface{
   Paint exteriorPaint;
  
   public Ram1500LimitedBuilder askForColorAndInterior() {
   
      TerminalPrompterBuilder promptBuilder = new TerminalPrompterBuilder();
      promptBuilder.addType("Exterior paint");
      promptBuilder.addOption(new BrilliantBlackCrystalPearl());
      promptBuilder.addOption(new BrightWhiteClearCoat());
      promptBuilder.sort();
      
      ArrayList<Object> colors = promptBuilder.getOptions();
      
      try{
         TerminalPrompter prompter = promptBuilder.build();
      
         int result = prompter.ask();
      
         exteriorPaint = (Paint)colors.get(result - 1);
      } 
      catch(Exception e){
         e.printStackTrace();
         System.exit(1);   
      }           
      return this;   
   }
  
   public static void main(String[] args) throws Exception{
      new Ram1500LimitedBuilder()
            .askForColorAndInterior();
   }
}