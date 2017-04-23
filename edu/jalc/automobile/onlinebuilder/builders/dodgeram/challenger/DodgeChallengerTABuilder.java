package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger;

import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.common.utils.prompter.*;

import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.engine.HemiVvtSportEngine;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.engine.HemiMdsVvtSportEngine;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.paint.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.seat.ClothBucketSeat;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.wheel.AluminumForgedWheel;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.tire.AllSeasonPerformanceTire;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.tire.ThreeSeasonPerformanceTire;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.brake.*;
import edu.jalc.automobile.onlinebuilder.components.engine.sport.NaturallyAspiratedSportEngine;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;
import edu.jalc.automobile.onlinebuilder.components.engine.sport.SportEngineAssembly;
import edu.jalc.automobile.parts.engine.SportEngine;
import edu.jalc.automobile.parts.induction.NaturallyAspiratedInduction;
import edu.jalc.automobile.parts.exhaust.PerformanceExhaust;
import edu.jalc.automobile.parts.body.Paint;
import edu.jalc.automobile.onlinebuilder.components.body.Body;
import edu.jalc.automobile.onlinebuilder.components.body.car.CoupeBody;
import edu.jalc.automobile.parts.body.seat.Seat;
import edu.jalc.automobile.parts.body.*;



public class DodgeChallengerTABuilder implements DodgeRamBuilderInterface{

  private SportEngineAssembly engine;
  private Body body;
  //suspension & driveline


  //main method goes here

  public DodgeRamBuilderInterface askForPowerTrain(){
    TerminalPrompterBuilderInterface powertrainPromptBuilder = TerminalPrompterBuilder.newBuilder();
    SportEngine hemiVvtEngine = new HemiVvtSportEngine(5.7,new HorsePower(375,5200),new Torque(410,4200),8);
    SportEngineAssembly vvt_Engine = new NaturallyAspiratedSportEngine(hemiVvtEngine, new PerformanceExhaust(), new NaturallyAspiratedInduction());
    SportEngine hemiMdsVvtSportEngine = new HemiMdsVvtSportEngine(5.7,new HorsePower(375,5200),new Torque(410,4200),8);
    SportEngineAssembly mds_Vvt_Engine = new NaturallyAspiratedSportEngine(hemiMdsVvtSportEngine, new PerformanceExhaust(), new NaturallyAspiratedInduction());
    powertrainPromptBuilder.addType("Powertrain");
    powertrainPromptBuilder.addOption(vvt_Engine);
    powertrainPromptBuilder.addOption(mds_Vvt_Engine);
    int choice;
    try{
      choice = powertrainPromptBuilder.sort().build().ask();
    }
    catch(Exception except){
      choice = 0;
    }
    if (choice == 0)
      this.engine = vvt_Engine;
    else
      this.engine = mds_Vvt_Engine;
    return this;
  }

  public DodgeRamBuilderInterface askForColorAndInterior(){
    TerminalPrompterBuilder paintPromptBuilder = TerminalPrompterBuilder.newBuilder();
    paintPromptBuilder.addType("Paint");
    paintPromptBuilder.addOption(new ContusionBluePaint());
    paintPromptBuilder.addOption(new GoMangoPaint());
    paintPromptBuilder.addOption(new GreenGoPaint());
    paintPromptBuilder.addOption(new MaximumSteelPaint());
    paintPromptBuilder.addOption(new OctaneRedPaint());
    paintPromptBuilder.addOption(new PitchBlackPaint());
    paintPromptBuilder.addOption(new YellowJacketPaint());
    int choice;
    try{
      choice = paintPromptBuilder.sort().build().ask();
    }
    catch(Exception except){
      choice = 0;
    }
    Paint paint = (Paint)paintPromptBuilder.getOptions().get(choice - 1);

    ClothBucketSeat seat = new ClothBucketSeat("Black");
    TerminalPrompterBuilder seatPromptBuilder = TerminalPrompterBuilder.newBuilder();
    seatPromptBuilder.addType("Interior");
    seatPromptBuilder.addOption(seat);
    try{
      seatPromptBuilder.build().tell("The T/A model Dodge Challenger ships with "+seat+"Cloth Bucket seats by default");
    }
    catch(Exception except){}

    //body assembles here
    this.body = new CoupeBody(new Quarterpanels(paint,null),new EngineCompartment(new Hood(paint,null)),new StandardCabin(seat),new StandardTrunk(5));

    return this;
  }

  public DodgeRamBuilderInterface askForOptions(){
    TerminalPrompterBuilder wheelPromptBuilder = TerminalPrompterBuilder.newBuilder();
    wheelPromptBuilder.addType("Wheels");
    wheelPromptBuilder.addOption(new AluminumForgedWheel(20,9,"Hyper Black II"));

    TerminalPrompterBuilder tirePromptBuilder = TerminalPrompterBuilder.newBuilder();
    tirePromptBuilder.addType("Tires");
    tirePromptBuilder.addOption(new AllSeasonPerformanceTire(20,245,"245/45ZR20"));

    TerminalPrompterBuilder brakePromptBuilder = TerminalPrompterBuilder.newBuilder();
    brakePromptBuilder.addType("Brakes");
    brakePromptBuilder.addOption(new StandardBrakePad());
    brakePromptBuilder.addOption(new HighPerformanceBrakePad());
    int choice;
    try{
      choice = brakePromptBuilder.sort().build().ask();
    }
    catch(Exception except){
      choice = 0;
    }
    //Not sure about this casting
    Object brake = (Object)brakePromptBuilder.getOptions().get(choice - 1);
    try{
      brakePromptBuilder.build();
    }
    catch(Exception except){}

    //suspension assembles here
    return this;
  }
  //placeholder
  public DodgeRamBuilderInterface askForPackages(){
    return this;
  }

  //will be filled with proper parameters
  public Automobile build(){

    //driveline built here

    return new Automobile("Dodge","Challenger","T/A",null,null,engine,null);
  }
}
