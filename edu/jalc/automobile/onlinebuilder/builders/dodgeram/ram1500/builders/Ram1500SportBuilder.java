package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.builders;

import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.common.utils.prompter.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.cabandbox.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.drive.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.axle.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.cabin.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.exteriorpaint.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.seating.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.wheels.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.suspension.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.driveline.*;
import edu.jalc.automobile.onlinebuilder.components.driveline.*;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.standard.StandardEcoEngine;
import edu.jalc.automobile.onlinebuilder.components.body.Body;
import edu.jalc.automobile.onlinebuilder.components.body.truck.*;
import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;
import edu.jalc.automobile.onlinebuilder.components.suspension.towing.*;
import edu.jalc.automobile.onlinebuilder.components.driveline.truck.HeavyDutyRWD;
import edu.jalc.automobile.onlinebuilder.components.engine.diesel.*;
import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.parts.induction.*;
import edu.jalc.automobile.parts.exhaust.*;
import edu.jalc.automobile.parts.body.seat.*;
import edu.jalc.automobile.parts.body.*;
import edu.jalc.automobile.parts.body.Cabin;
import edu.jalc.automobile.parts.suspension.*;
import edu.jalc.automobile.parts.driveline.*;

public class Ram1500SportBuilder implements DodgeRamBuilderInterface{
  EngineAssembly engine;//3
  Body body;
  Suspension suspension;
  TruckDriveLine driveLine;
  RamTruckCabAndBed cabAndBox;//2
  TruckDrive truckDrive;//1
  TruckRearAxle truckRearAxle;//4
  TruckTire tire;
  TruckSeat seat;//6
  Paint paint;//5

  public TruckDodgeRamBuilderInterface askForTruckDrive(){
     TerminalPrompterBuilder truckDrivePrompter = TerminalPrompterBuilder.newBuilder();
     try{
        int truckDriveChoice = truckDrivePrompter.addType("Drive")
           .addOption(new FourByTwoTruckDrive())
           .addOption(new FourByFourTruckDrive())
           .sort()
           .build()
           .ask();
     }
     catch(Exception e){System.err.println(e);}
     truckDrive = (TruckDrive)truckDrivePrompter.getOptions().get(truckDriveChoice - 1);
     return this;
  }

  public TruckDodgeRamBuilderInterface askForTruckCabAndBed(){
     TerminalPrompterBuilder cabAndBedPrompter = TerminalPrompterBuilder.newBuilder();
     try{
        int cabAndBedChoice = cabAndBedPrompter.addType("Cab And Box")
          .addOption(new  RamTruckCabAndBed(5.7,"Crew"))
          .addOption(new  RamTruckCabAndBed(6.4,"Crew"))
          .addOption(new  RamTruckCabAndBed(6.4,"Quad"))
          .addOption(new  RamTruckCabAndBed(6.4,"Regular"))
          .sort()
          .build()
          .ask();
     }
     catch(Exception e){System.err.println(e);}
     cabAndBox= (RamTruckCabAndBed)cabAndBedPrompter.getOptions().get(cabAndBedChoice - 1);
     return this;
  }

  public DodgeRamBuilderInterface askForPowerTrain(TerminalPrompterBuilderInterface promptBuilder){
    TerminalPrompterBuilder enginePrompter = TerminalPrompterBuilder.newBuilder();

    EcoEngine hemiVVTEngine = new HemiVVTEngine(345,new HorsePower(395,5600 ),new Torque(410,3950),8);

    EngineAssembly hemi_VVTEngine  = new  StandardEcoEngine(hemiVVTEngine,new EconomyExhaust(),new NaturallyAspiratedInduction());

    int numOfOptions = 0;

    try{
      enginePrompter.addType("Engine");
      enginePrompter.addOption(hemi_VVTEngine);
      enginePrompter.sort();
      numOfOptions = enginePrompter.build().ask();
    }
    catch(Exception e){System.err.println(e);}
    engine = (EngineAssembly)enginePrompter.getOptions().get(numOfOptions - 1);


    TerminalPrompterBuilder axlePrompter = TerminalPrompterBuilder.newBuilder();
    try{
      axlePrompter.addType("Axle");
      axlePrompter.addOption(new TruckRearAxle(3.92));
      axlePrompter.sort();
      numOfOptions = axlePrompter.build().ask();
    }
    catch(Exception e){System.err.println(e);}
    truckRearAxle = (TruckRearAxle)axlePrompter.getOptions().get(numOfOptions - 1);
    return this;
  }

  public DodgeRamBuilderInterface askForColorAndInterior(TerminalPrompterBuilderInterface promptBuilder, RamTruckCabAndBed cabAndBox){
    TerminalPrompterBuilder paintPrompter = TerminalPrompterBuilder.newBuilder();

    int numOfOptions;

    try{

      paintPrompter.addType("Color");
      paintPrompter.addOption(new FlameRedClearCoat());
      paintPrompter.addOption(new BrightWhiteClearCoat());
      paintPrompter.addOption(new MaximumSteelMetallicClearCoat());
      paintPrompter.addOption(new BrilliantBlackCrystalPearl());
      paintPrompter.sort();
      //ArrayList<Object> colors = paintPrompter.getOptions();
      numOfOptions = paintPrompter.build().ask();
    }
    catch(Exception e){System.err.println(e);}
    paint = (Paint)paintPrompter.getOptions().get(numOfOptions - 1);

    TerminalPrompterBuilder seatPrompter = TerminalPrompterBuilder.newBuilder();
    try{
      seatPrompter.addType("Seats");
      seatPrompter.addOption(new BucketClothSeat());
      seatPrompter.sort();
      numOfOptions = seatPrompter.build().ask();
    }
    catch(Exception e){System.err.println(e);}
    seat = (TruckSeat)seatPrompter.getOptions().get(numOfOptions - 1);
//Issue here as to cab type
    //this.body = 

    return this;

  }
  public DodgeRamBuilderInterface askForOptions(TerminalPrompterBuilderInterface promptBuilder){
    return null;
  }
  public DodgeRamBuilderInterface askForPackages(TerminalPrompterBuilderInterface promptBuilder){
    return this;
  }

  public Automobile build(){

    return null;
  }
  //public static void main(String[] args) {  }


}
