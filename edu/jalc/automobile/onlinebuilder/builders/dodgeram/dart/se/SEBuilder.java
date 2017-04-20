package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.se;

import java.util.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.common.utils.prompter.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.color.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.seatingandtrim.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.stripe.*;

public class SEBuilder {
   Engine engine;
   //TwoLiterI4DOHCEngine twoLiterI4DOHCEngine = new TwoLiterI4DOHCEngine();
   BilletSilverMetallicClearCoat billetSilverMetallicClearCoat = new BilletSilverMetallicClearCoat();
   BrightWhiteClearCoat brightWhiteClearCoat = new BrightWhiteClearCoat();
   PitchBlackClearCoat pitchBlackClearCoat = new PitchBlackClearCoat();
   SportClothSeatBlackInteriorColor sportClothSeatBlackInteriorColor = new SportClothSeatBlackInteriorColor(); 
   
   public void askForPowerTrain() {
      TerminalPrompterBuilder builder = TerminalPrompterBuilder.newBuilder();
      builder.addType("Engine");
      builder.addOption(new TwoLiterI4DOHCEngine());
      builder.sort();
      TerminalPrompter prompter = builder.build();
   
      int response = prompter.ask();
      
     // ArrayList<Objects> options = 
      engine = (Engine)builder.getOptions().get(0);
      
   }
      
   public void askForColorAndInterior() throws Exception{
      builder = TerminalPrompterBuilder.newBuilder();
      builder.addType("Color");
      builder.addOption(billetSilverMetallicClearCoat);
      builder.addOption(brightWhiteClearCoat);
      builder.addOption(pitchBlackClearCoat);
      builder.sort();
      TerminalPrompter prompter = builder.build();
      
      int response = prompter.ask();
      
      ArrayList<Objects> options = 
      this.color = 
      
      builder = TerminalPrompterBuilder.newBuilder();
      builder.addType("Seating");
      builder.addOption(sportClothSeatBlackInteriorColor);
      builder.sort();
      TerminalPrompter prompter = builder.build();
      
      int result2 = prompter.ask();
      
      assert(result2 == 1);

      builder.addType("Stripes");
      builder.addOption(roofHoodGrayStripe);
      builder.addOption(RoofHoodDualGrayStripes);
      builder.addOption(FullHoodBlackRedStripe);
      builder.addOption(RoofHoodDualBlackStripes);
      builder.addOption(BodySideRedThombusStripe);
      builder.addOption(BlackRedGrayGraphic);
      builder.sort();
      //TerminalPrompter prompter = builder.build();
      
      int result3 = prompter.ask();
      
      assert(result3 > 0 && result3 < 7);

      builder.addType("Packages");
      builder.addOption(roofHoodGrayStripe);
      builder.addOption(RoofHoodDualGrayStripes);
      builder.addOption(FullHoodBlackRedStripe);
      builder.addOption(RoofHoodDualBlackStripes);
      builder.addOption(BodySideRedThombusStripe);
      builder.addOption(BlackRedGrayGraphic);
      builder.sort();
      //TerminalPrompter prompter = builder.build();
      
      int result3 = prompter.ask();
      
      assert(result3 > 0 && result3 < 7);
      
   }

   //what
   
   
}