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
import edu.jalc.automobile.parts.suspension.*;
import edu.jalc.automobile.parts.driveline.*;

public class DodgeChallengerSXTBuilder implements DodgeRamBuilderInterface{

   private EngineAssembly engineAssembly;
   private Paint paint;

   public DodgeRamBuilderInterface askForPowerTrain(){
     TerminalPrompterBuilder promptBuilder = TerminalPrompterBuilder.newBuilder();
      SportEngine engine = new VVT24ValveSportEngine(3.6, new HorsePower(303,3000), new Torque(300,2000), 6);
      EngineAssembly engineAssembly = new NaturallyAspiratedSportEngine(engine, new PerformanceExhaust(), new NaturallyAspiratedInduction());
      try{
         promptBuilder.addType("Powertrain")
         .addOption(engineAssembly)
         .build()
         .tell("Your SXT Comes With A " + engineAssembly);
      }catch(Exception e){}
      this.engineAssembly = engineAssembly;
      return this;
   }

   public DodgeRamBuilderInterface askForColorAndInterior(){
      Paint paint = new YellowJacketPaint();
      //, new RedlineTricoat, new PitchBlack, new MaximumSteel, new TorRed, new ContusionBlue;
         TerminalPrompterBuilder promptBuilder = TerminalPrompterBuilder.newBuilder();
         promptBuilder.addType("Paint");
         promptBuilder.addOption(paint);
         promptBuilder.sort();
         TerminalPrompter prompter = promptBuilder.build();
         int choice = prompter.ask();
         paint = (Paint)promptBuilder.getOptions().get(choice - 1);
      this.paint = paint;
      return this;
   }


	public DodgeRamBuilderInterface askForOptions(){
    TerminalPrompterBuilder promptBuilder = TerminalPrompterBuilder.newBuilder();
        CarbonAluminumWheel aluminumWheel = new CarbonAluminumWheel(18,"Satin");
        AllSeasonPerformanceTire allSeasonPerformanceTire = new AllSeasonPerformanceTire();
        promptBuilder.addType("Wheels & Tires")
         .addOption(aluminumWheel)
         .addOption(allSeasonPerformanceTire)
         .build()
         .tell("Your SXT Comes With An " + aluminumWheel + "\nYour SXT Comes With An " + allSeasonPerformanceTire);
      this.aluminumWheel = aluminumWheel;
      this.allSeasonPerformanceTire = allSeasonPerformanceTire;
      return this;
   }

	public DodgeRamBuilderInterface askForPackages(){
    TerminalPrompterBuilder promptBuilder = TerminalPrompterBuilder.newBuilder();
      Engine engine = new VVT24ValveSportEngine(3.6, new HorsePower(303,3000), new Torque(300,2000), 6);
            promptBuilder.addType("Powertrain")
         .addOption(engineAssembly)
         .build()
         .tell("Your SXT Comes With A " + engineAssembly);
      this.engineAssembly = engineAssembly;
      return this;
      return this;
   }

	public Automobile build(){
      return new Automobile("Dodge","Challenger","SXT",null,null,this.engineAssembly,null);
   }

}
