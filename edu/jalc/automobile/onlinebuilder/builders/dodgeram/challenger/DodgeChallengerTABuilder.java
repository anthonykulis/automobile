package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger;

import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.common.utils.prompter.*;

import edu.jalc.automobile.parts.engine.SportEngine;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.sport.SportEngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.sport.NaturallyAspiratedSportEngine;
import edu.jalc.automobile.parts.induction.NaturallyAspiratedInduction;
import edu.jalc.automobile.parts.exhaust.PerformanceExhaust;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.engine.HemiVvtSportEngine;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.engine.HemiMdsVvtSportEngine;

import edu.jalc.automobile.parts.body.*;
import edu.jalc.automobile.parts.body.Paint;
import edu.jalc.automobile.parts.body.seat.Seat;
import edu.jalc.automobile.onlinebuilder.components.body.Body;
import edu.jalc.automobile.onlinebuilder.components.body.car.CoupeBody;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.paint.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.seat.ClothBucketSeat;

import edu.jalc.automobile.parts.suspension.*;
import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.suspension.SportSuspension;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.wheel.AluminumForgedWheel;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.tire.AllSeasonPerformanceTire;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.tire.ThreeSeasonPerformanceTire;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.brake.*;

import edu.jalc.automobile.onlinebuilder.components.driveline.DriveLine;
import edu.jalc.automobile.onlinebuilder.components.driveline.sport.SportRWD;
import edu.jalc.automobile.parts.driveline.*;

public class DodgeChallengerTABuilder implements DodgeRamBuilderInterface{

  private SportEngineAssembly engine;
  private Body body;
  private Suspension suspension;
  private DriveLine driveline;

  public static void main(String[] args){
    Automobile ta = new DodgeChallengerTABuilder().askForPowerTrain().askForColorAndInterior().askForOptions().askForPackages().build();
    System.out.println(ta);
  }

  public DodgeRamBuilderInterface askForPowerTrain(){
    TerminalPrompterBuilder powertrainPromptBuilder = TerminalPrompterBuilder.newBuilder();
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
    this.engine = (SportEngineAssembly)powertrainPromptBuilder.getOptions().get(choice -1);
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
      seatPromptBuilder.build().tell("The T/A model Dodge Challenger ships with "+seat+" Cloth Bucket seats by default");
    }
    catch(Exception except){}

    TerminalPrompterBuilder graphicPromptBuilder = TerminalPrompterBuilder.newBuilder();
    graphicPromptBuilder.addType("Graphic");
    graphicPromptBuilder.addOption(new Graphic("'Challenger' Body Side Stripe"));
    graphicPromptBuilder.addOption(new Graphic("No Stripe"));
    int graphicChoice;
    try{
      graphicChoice = graphicPromptBuilder.sort().build().ask();
    }
    catch(Exception except){
      graphicChoice = 0;
    }
    Graphic graphic = (Graphic)graphicPromptBuilder.getOptions().get(graphicChoice - 1);
    this.body = new CoupeBody(new Quarterpanels(paint,graphic),new EngineCompartment(new Hood(paint,graphic)),new StandardCabin(seat),new StandardTrunk(5));

    return this;
  }

  public DodgeRamBuilderInterface askForOptions(){

    AluminumForgedWheel wheel = new AluminumForgedWheel(20,9,"Hyper Black II");
    TerminalPrompterBuilder wheelPromptBuilder = TerminalPrompterBuilder.newBuilder();
    wheelPromptBuilder.addType("Wheels");
    wheelPromptBuilder.addOption(wheel);
    try{
      wheelPromptBuilder.build().tell("The T/A model Dodge Challenger ships with "+wheel+" wheels by default");
    }
    catch(Exception except){}

    AllSeasonPerformanceTire tire = new AllSeasonPerformanceTire(20,245,"245/45ZR20");
    TerminalPrompterBuilder tirePromptBuilder = TerminalPrompterBuilder.newBuilder();
    tirePromptBuilder.addType("Tires");
    tirePromptBuilder.addOption(tire);
    try{
      tirePromptBuilder.build().tell("The T/A model Dodge Challenger ships with "+tire+" tires by default");
    }
    catch(Exception except){}

    this.suspension = new SportSuspension(new StockShock(12),new MediumSpring(12),tire,wheel);

    return this;
  }

  //placeholder
  public DodgeRamBuilderInterface askForPackages(){
    return this;
  }

  public Automobile build(){

    DriveLine driveline = new SportRWD(new FrontDeadAxle(),new RearDriveAxle(),new DriveShaft(),new HydraulicSteering(),new TorqueVectorDifferential());

    return new Automobile("Dodge","Challenger","T/A",body,driveline,engine,suspension);
  }
}
