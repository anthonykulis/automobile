package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.sxtsportblacktop;

import java.util.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.color.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.seatingandtrim.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.stripe.*;

//import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.engine.TwoLiterI4DOHCEngine;

public class SXTSportBlacktopBuilder /*implements DodgeRamBuilderInterface*/{

   public static Engine engine;
   Color color;
   SeatingAndTrim seatingAndTrim;
   Stripe stripe;
   Scanner keyboard = new Scanner(System.in);
   
   public void askForPowerTrain(){
      System.out.println("Standard engine equiped.");
      Engine standard = new TwoLiterI4DOHCEngine();
      engine = standard;
   }
   public static void main(String[] args){
      System.out.println(engine);
   }
}