package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.sxtsportblacktop;

import java.util.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.common.utils.prompter.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.color.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.seatingandtrim.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.stripe.*;

public class SXTSportBlacktopBuilder /*implements DodgeRamBuilderInterface*/{

   static TwoLiterI4DOHCEngine twoLiterI4DOHCEngine = new TwoLiterI4DOHCEngine();
   
   Scanner keyboard = new Scanner(System.in);
   
   public void askForPowerTrain(TerminalPrompterBuilderInterface promptBuilder) throws Exception{
      TerminalPrompterBuilder builder = TerminalPrompterBuilder.newBuilder();
      builder.addType("Engine");
      builder.addOption(twoLiterI4DOHCEngine);
      builder.sort();
      TerminalPrompter prompter = builder.build();
   
      int result = prompter.ask();
   
      assert(result == 1 || result == 2);
   }
      
   public static void main(String[] args) throws Exception{
      TerminalPrompterBuilder builder = TerminalPrompterBuilder.newBuilder();
      builder.addType("Engine");
      builder.addOption(twoLiterI4DOHCEngine);
      builder.sort();
      TerminalPrompter prompter = builder.build();
   
      int result = prompter.ask();
   
      assert(result == 1);   
   }
}