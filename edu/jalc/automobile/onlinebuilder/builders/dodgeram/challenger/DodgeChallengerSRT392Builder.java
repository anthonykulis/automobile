package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger;

import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.common.utils.prompter.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;

import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.paint.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.seat.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.color.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.wheel.SteelForgedWheel;
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

public class DodgeChallengerSRT392Builder implements DodgeRamBuilderInterface{

  EngineAssembly engine;
  Body body;
  Suspension suspension;
  DriveLine driveline;

  public static void main(String... args){
    Automobile srt392 = new DodgeChallengerSRT392Builder()
      .askForPowerTrain()
      .askForColorAndInterior()
      .askForOptions()
      .askForPackages()
      .build();
    System.out.println(srt392);
  }


  public DodgeRamBuilderInterface askForPowerTrain(){
    TerminalPrompterBuilder promptBuilder = TerminalPrompterBuilder.newBuilder();

    SportEngine mdsEngine = new HemiMdsSportEngine(392,new HorsePower(485,4000),new Torque(475,3000),8);
    SportEngine hemiEngine = new HEMISportEngine(392,new HorsePower(485,4000),new Torque(475,3000),8);

    EngineAssembly mds_Engine = new NaturallyAspiratedSportEngine(mdsEngine, new PerformanceExhaust(), new NaturallyAspiratedInduction());
    EngineAssembly hemi_Engine = new NaturallyAspiratedSportEngine(hemiEngine, new PerformanceExhaust(), new NaturallyAspiratedInduction());

    promptBuilder.addType("Powertrain");
    promptBuilder.addOption(hemi_Engine);
    promptBuilder.addOption(mds_Engine);
    promptBuilder.sort();

    int choice = 1;
    try{
      choice = promptBuilder.build().ask();
    }catch(Exception e){}

    this.engine = (EngineAssembly)promptBuilder.getOptions().get(choice - 1);
    return this;
  }
  public DodgeRamBuilderInterface askForColorAndInterior(){

    Paint paint = askForPaint();
    Graphic graphic = askForGraphic();
    ColoredLeatherSeat seat = askForSeat();

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
        .addOption(new Graphic("Twin Silver Center Stripes"))
        .addOption(new Graphic("Twin Black Center Stripes"))
        .addOption(new Graphic("None"))
        .sort()
        .build()
        .ask();
    }catch(Exception e){e.printStackTrace();}
    return (Graphic)graphicPrompter.getOptions().get(graphicChoice - 1);
  }
  private ColoredLeatherSeat askForSeat(){
    TerminalPrompterBuilder seatPrompter = TerminalPrompterBuilder.newBuilder();
    int seatChoice = 2;
    try{
      seatChoice = seatPrompter.addType("Seats")
        .addOption(new ColoredLeatherSeat(new Red(), "Nappa Alcantara"))
        .addOption(new ColoredLeatherSeat(new Black(), "Nappa Alcantara"))
        .addOption(new ColoredLeatherSeat(new Black(), "SRT Laguna"))
        .addOption(new ColoredLeatherSeat(new Sepia(), "SRT Laguna"))
        .sort()
        .build()
        .ask();
    }catch(Exception e){e.printStackTrace();}
    return (ColoredLeatherSeat)seatPrompter.getOptions().get(seatChoice - 1);
  }

  public DodgeRamBuilderInterface askForOptions(){
    SportTire tire = new SportTire(0,0);
    SteelForgedWheel wheel = new SteelForgedWheel(20,9.5,"SRT Hyper Black");
    try{
      TerminalPrompterBuilder wheelPrompter = TerminalPrompterBuilder.newBuilder();
      wheelPrompter.addType("Wheels")
        .addOption(wheel)
        .build()
        .tell("Your SRT 392 comes with\n" + wheel + "\n");
    }catch(Exception e){e.printStackTrace();}

    try{
      TerminalPrompterBuilder tirePrompter = TerminalPrompterBuilder.newBuilder();
      int tireChoice = tirePrompter.addType("Tires")
        .addOption(new AllSeasonPerformanceTire(20,9.5,"275/40ZR20"))
        .addOption(new PZeroSummerTire(20,9.5,"275/40ZR20"))
        .sort()
        .build()
        .ask();
      tire = (SportTire)tirePrompter.getOptions().get(tireChoice - 1);
    }catch(Exception e){e.printStackTrace();}
    suspension = new SportSuspension(new StockShock(12), new MediumSpring(12), tire, wheel);

    return this;
  }
  public DodgeRamBuilderInterface askForPackages(){
    //no packages with code representation
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

