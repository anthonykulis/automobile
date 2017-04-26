package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger;

import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.common.utils.prompter.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.paint.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.seat.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.color.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.wheel.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.tire.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.suspension.SportSuspension;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.sport.NaturallyAspiratedSportEngine;
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

public class DodgeChallenger392HemiScatPackShakerBuilder implements DodgeRamBuilderInterface{

  EngineAssembly engine;
  Body body;
  Suspension suspension;
  DriveLine driveline;
  
  boolean dynamic = false;

  public static void main(String... args){
    Automobile Hemi392 = new DodgeChallenger392HemiScatPackShakerBuilder()
      .askForPowerTrain()
      .askForColorAndInterior()
      .askForPackages()
      .askForOptions()
      .build();
    System.out.println(Hemi392);
  }

  public DodgeRamBuilderInterface askForPowerTrain(){
    TerminalPrompterBuilder promptBuilder = TerminalPrompterBuilder.newBuilder();

    SportEngine mdsEngine = new HemiMdsSportEngine(392,new HorsePower(485,4000),new Torque(475,3000),8);
    SportEngine hemiEngine = new HEMISportEngine(392,new HorsePower(485,4000),new Torque(475,3000),8);

    //EngineAssembly mds_Engine = new NaturallyAspiratedSportEngine(mdsEngine, new PerformanceExhaust(), new NaturallyAspiratedInduction());
    //EngineAssembly hemi_Engine = new NaturallyAspiratedSportEngine(hemiEngine, new PerformanceExhaust(), new NaturallyAspiratedInduction());

    promptBuilder.addType("Powertrain");
    promptBuilder.addOption(hemiEngine);
    promptBuilder.addOption(mdsEngine);
    promptBuilder.sort();
    int choice = 1;
    try{
      choice = promptBuilder.build().ask();
    }catch(Exception e){}

    SportEngine engine = (SportEngine)promptBuilder.getOptions().get(choice - 1);
    this.engine = new NaturallyAspiratedSportEngine(engine, new PerformanceExhaust(), new NaturallyAspiratedInduction());
    return this;
  }
  public DodgeRamBuilderInterface askForColorAndInterior(){
    Paint paint = askForPaint();
    Graphic graphic = askForGraphic();
    HighPerformanceSeat seat = askForSeat();

    this.body = new CoupeBody(
      new Quarterpanels(paint,new Graphic("None")),
      new EngineCompartment(new Hood(paint, graphic)),
      new LuxuryCabin(seat),
      new StandardTrunk(5));
    return this;
  }

  private Paint askForPaint(){
    TerminalPrompterBuilder paintPrompter = TerminalPrompterBuilder.newBuilder();
    int choice = 4;
    paintPrompter.addType("Paint")
      .addOption(new OctaneRedPaint())
      .addOption(new ContusionBluePaint())
      .addOption(new PitchBlackPaint())
      .addOption(new GoMangoPaint())
      .addOption(new GreenGoPaint())
      .addOption(new YellowJacketPaint())
      .addOption(new MaximumSteelPaint())
      .sort();

    try{
      choice = paintPrompter.build().ask();
    }catch(Exception e){e.printStackTrace();}

    return (Paint)paintPrompter.getOptions().get(choice - 1);
  }
  private Graphic askForGraphic(){
    int graphicChoice = 1;
    TerminalPrompterBuilder graphicPrompter = TerminalPrompterBuilder.newBuilder();
    try{
      graphicChoice = graphicPrompter.addType("Graphics")
        .addOption(new Graphic("Black Center Stripe"))
        .addOption(new Graphic("None"))
        .sort()
        .build()
        .ask();
    }catch(Exception e){e.printStackTrace();}
    return (Graphic)graphicPrompter.getOptions().get(graphicChoice - 1);
  }
  private HighPerformanceSeat askForSeat(){
    TerminalPrompterBuilder seatPrompter = TerminalPrompterBuilder.newBuilder();
    int seatChoice = 2;
    try{
      seatChoice = seatPrompter.addType("Seats")
        .addOption(new HighPerformanceSeat(new Red(), "Suede / Nappa Leather"))
        .addOption(new HighPerformanceSeat(new Black(), "Suede / Nappa Leather"))
        .sort()
        .build()
        .ask();
    }catch(Exception e){e.printStackTrace();}
    return (HighPerformanceSeat)seatPrompter.getOptions().get(seatChoice - 1);
  }

  public DodgeRamBuilderInterface askForOptions(){

    SportTire tire;
    Wheel wheel;
    int wheelChoice = 0, tireChoice = 0;
    
    Wheel aWheel = new AluminumWheel(20,9,"Polished");
    Wheel sfWheel = new SteelForgedWheel(20,9.5,"Low-Gloss Black");
    Wheel afWheel = new AluminumForgedWheel(20,9,"Hyper Black II");
    
    TerminalPrompterBuilder wheelPrompter = TerminalPrompterBuilder.newBuilder();
    try{
      wheelPrompter.addType("Wheels");
      if(dynamic){
        wheelPrompter.addOption("Keep: " + sfWheel);
        wheelPrompter.addOption("Add: " + aWheel);
      }else wheelPrompter.addOption("Default: " + aWheel);
      wheelPrompter.addOption("Add: " + afWheel);
      if(!dynamic) wheelPrompter.addOption("Add: " + sfWheel);
      wheelChoice = wheelPrompter.build()
        .ask();
    }catch(Exception e){e.printStackTrace();}
    Wheel[] wheels;
    if(dynamic){wheels = new Wheel[]{sfWheel,aWheel,afWheel};}
    else{wheels = new Wheel[]{aWheel,afWheel,sfWheel};}
    wheel = wheels[wheelChoice - 1];

    TerminalPrompterBuilder tirePrompter = TerminalPrompterBuilder.newBuilder();
    try{
      tirePrompter.addType("Tires");
      if(wheel instanceof SteelForgedWheel){
        tirePrompter.addOption(new AllSeasonPerformanceTire(20,9.5,"275/40ZR20"))
          .addOption(new PZeroSummerTire(20,9.5,"275/40ZR20"));
      }else{
        tirePrompter.addOption(new AllSeasonPerformanceTire(20,9.0,"245/45ZR20"))
          .addOption(new ThreeSeasonPerformanceTire(20,9.0,"245/45ZR20"))
          .addOption(new PZeroSummerTire(20,9.5,"275/40ZR20"));
      }
      tireChoice = tirePrompter.sort()
        .build()
        .ask();
    }catch(Exception e){e.printStackTrace();}
    
    tire = (SportTire)tirePrompter.getOptions().get(tireChoice - 1);
    
    suspension = new SportSuspension(new StockShock(12), new MediumSpring(12), tire, wheel);

    return this;
  }
  public DodgeRamBuilderInterface askForPackages(){
    TerminalPrompterBuilder packagePrompter = TerminalPrompterBuilder.newBuilder();
    try{
      int p = packagePrompter.addType("packages")
        .addOption("Add Dynamics Package")
        .addOption("Do Not Add Dynamics Package")
        .sort()
        .build()
        .ask();
      if(p == 1) this.dynamic = true;
    }catch(Exception e){e.printStackTrace();}
    return this;
  }
  public Automobile build(){

    DriveLine driveLine = new SportRWD(
      new FrontDeadAxle(),
      new RearDriveAxle(),
      new DriveShaft(),
      new HydraulicSteering(),
      new TorqueVectorDifferential());

    return new Automobile("Dodge","Challenger","SRT 392",body,driveLine,engine,suspension);
  }
}
