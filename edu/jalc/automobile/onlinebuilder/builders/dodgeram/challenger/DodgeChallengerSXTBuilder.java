package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger;

import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.common.utils.prompter.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.paint.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.seat.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.color.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.wheel.CarbonAluminumWheel;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.tire.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.suspension.SportSuspension;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.sport.NaturallyAspiratedSportEngine;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.engine.VVT24ValveSportEngine;
import edu.jalc.automobile.onlinebuilder.components.body.Body;
import edu.jalc.automobile.onlinebuilder.components.body.car.CoupeBody;
import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;
import edu.jalc.automobile.onlinebuilder.components.driveline.DriveLine;
import edu.jalc.automobile.onlinebuilder.components.driveline.sport.SportRWD;
import edu.jalc.automobile.parts.engine.SportEngine;
import edu.jalc.automobile.parts.induction.NaturallyAspiratedInduction;
import edu.jalc.automobile.parts.exhaust.PerformanceExhaust;
import edu.jalc.automobile.parts.body.seat.Seat;
import edu.jalc.automobile.parts.body.*;
import edu.jalc.automobile.parts.body.seat.LeatherSeat;
import edu.jalc.automobile.parts.suspension.*;
import edu.jalc.automobile.parts.driveline.*;

public class DodgeChallengerSXTBuilder implements DodgeRamBuilderInterface{

   private Body body;
   private Suspension suspension;
   private DriveLine driveline;
   private EngineAssembly engineAssembly;
   private Paint paint;
   private CarbonAluminumWheel carbonAluminumWheel;
   private AllSeasonPerformanceTire allSeasonPerformanceTire;
   
   public static void main(String... args){
      Automobile auto = new DodgeChallengerSXTBuilder()
         .askForPowerTrain()
         .askForColorAndInterior()
         .askForOptions()
         .askForPackages()
         .build();
      System.out.println(auto);
   }

   public DodgeRamBuilderInterface askForPowerTrain(){
     TerminalPrompterBuilder promptBuilder = TerminalPrompterBuilder.newBuilder();
      SportEngine engine = new VVT24ValveSportEngine(3.6, new HorsePower(303,3000), new Torque(300,2000), 6);
      EngineAssembly engineAssembly = new NaturallyAspiratedSportEngine(engine, new PerformanceExhaust(), new NaturallyAspiratedInduction());
      try{
         promptBuilder.addType("Powertrain")
         .addOption(engineAssembly)
         .build()
         .tell("Your SXT Comes With " + engineAssembly);
      }catch(Exception e){}
      this.engineAssembly = engineAssembly;
      return this;
   }

   public DodgeRamBuilderInterface askForColorAndInterior(){
         TerminalPrompterBuilder promptBuilder = TerminalPrompterBuilder.newBuilder();
         promptBuilder.addType("Paint");
         promptBuilder.addOption(new YellowJacketPaint());
         promptBuilder.addOption(new PitchBlackPaint());
         promptBuilder.addOption(new MaximumSteelPaint());
         promptBuilder.addOption(new OctaneRedPaint());
         promptBuilder.addOption(new GreenGoPaint());
         promptBuilder.addOption(new GoMangoPaint());
         promptBuilder.addOption(new ContusionBluePaint());
         promptBuilder.sort();
         int choice = 1;
         try{
            choice = promptBuilder.build().ask();
         }catch(Exception e){}
         paint = (Paint)promptBuilder.getOptions().get(choice - 1);
      this.paint = paint;
      this.body = new CoupeBody(
        new Quarterpanels(paint, new Graphic("None")),
        new EngineCompartment(new Hood(paint, new Graphic("None"))),
        new LuxuryCabin(new LeatherSeat()),
        new StandardTrunk(7));
      return this;
   }


	public DodgeRamBuilderInterface askForOptions(){
    TerminalPrompterBuilder promptBuilder = TerminalPrompterBuilder.newBuilder();
        CarbonAluminumWheel aluminumWheel = new CarbonAluminumWheel(18,"Satin");
        AllSeasonPerformanceTire allSeasonPerformanceTire = new AllSeasonPerformanceTire(20,7.5,"275/40ZR20");
        try{
           promptBuilder.addType("Wheels & Tires")
              .addOption(aluminumWheel)
              .addOption(allSeasonPerformanceTire)
              .build()
              .tell("Your SXT Comes With " + aluminumWheel + "\nYour SXT Comes With " + allSeasonPerformanceTire);
        }catch(Exception e){e.printStackTrace();}
      this.suspension = new SportSuspension(new StockShock(10), new MediumSpring(16), allSeasonPerformanceTire, aluminumWheel);
      
      return this;
   }

	public DodgeRamBuilderInterface askForPackages(){
     TerminalPrompterBuilder promptBuilder = TerminalPrompterBuilder.newBuilder();
     SportEngine engine = new VVT24ValveSportEngine(3.6, new HorsePower(303,3000), new Torque(300,2000), 6);
     try{
       promptBuilder.addType("Powertrain")
         .addOption(engineAssembly)
         .build()
         .tell("Your SXT Comes With A " + engineAssembly);
     }catch(Exception e){e.printStackTrace();}
      this.engineAssembly = engineAssembly;
      return this;
   }

	public Automobile build(){
  
    this.driveline = new SportRWD(
      new FrontDeadAxle(),
      new RearDriveAxle(),
      new DriveShaft(),
      new HydraulicSteering(),
      new TorqueVectorDifferential());
      
    return new Automobile("Dodge","Challenger","SXT",this.body,this.driveline,this.engineAssembly,this.suspension);
   }

}
