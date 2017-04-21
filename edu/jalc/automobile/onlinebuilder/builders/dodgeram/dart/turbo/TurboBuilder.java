package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.turbo;

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
import edu.jalc.automobile.parts.body.seat.ClothSeat;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dart.parts.exhaust.SingleExhaust;

public class TurboBuilder implements DodgeRamBuilderInterface{
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
   
      return new Automobile("Dodge", "Dart", "Turbo", coupe, economicFWD, ecoEngineAssembly, economySuspension);
   }
   
   public TurboBuilder askForPowerTrain(){
      TerminalPrompterBuilder promptBuilder = new TerminalPrompterBuilder();
      promptBuilder.addType("Engine");
      promptBuilder.addOption(new OnePointFourLiterI4SixteenValveMultiAirTurboEngine(1.4, new HorsePower(160, 0), new Torque(184, 0), 4));
      promptBuilder.sort();
      
      try{
         TerminalPrompter prompter = promptBuilder.build();
      
         int result = prompter.ask();
      
         engine = (EcoEngine)promptBuilder.getOptions().get(0);
         
      } 
      catch(Exception e){
         e.printStackTrace();
         System.exit(1);
      }
      return this;
   }
   
   public TurboBuilder askForColorAndInterior() {
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
      promptBuilder.addType("Seating");
      promptBuilder.addOption(new SportClothSeatBlackInteriorColor());

      ArrayList<Object> seats = promptBuilder.getOptions();
   
      try{
         int result = promptBuilder.build().ask();
      
         clothSeat = (ClothSeat)seats.get(result - 1);
      }
      catch(Exception e){
         e.printStackTrace();
         System.exit(1); 
      } 
      
      promptBuilder = new TerminalPrompterBuilder();
      promptBuilder.addType("Graphic");
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
   
   public TurboBuilder askForOptions() {
      
      TerminalPrompterBuilder promptBuilder = new TerminalPrompterBuilder();
   
      AllSeasonTires allSeasonTires = new AllSeasonTires();
      allSeasonTires.setTireDetails("225/45R17");
   
      promptBuilder.addType("Tires");
      promptBuilder.addOption(allSeasonTires);
      promptBuilder.sort();
   
      try {
         int result = promptBuilder.build().ask();
         tire = (EconomyTire)promptBuilder.getOptions().get(0);
      } 
      catch (Exception e) {
      
      }  

      promptBuilder = new TerminalPrompterBuilder();
      promptBuilder.addType("Wheels");
      promptBuilder.addOption(new GraniteCrystalAlumWheel(17, tire));
      promptBuilder.sort();
   
      try {
         int result = promptBuilder.build().ask();
         wheel = (AlloyWheel)promptBuilder.getOptions().get(0);
      } 
      catch (Exception e) {

      }  
      return this;
   }

   public TurboBuilder askForPackages(){
      System.out.println("No packages avaliable");
      System.out.println("");
      return this;
   }
     
   public static void main(String[] args) throws Exception{
      System.out.println(new TurboBuilder()
            .askForPowerTrain()
            .askForColorAndInterior()
            .askForOptions()
            .askForPackages()
            .build());  
   }
}