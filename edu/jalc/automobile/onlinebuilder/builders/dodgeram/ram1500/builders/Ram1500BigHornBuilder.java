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

public class Ram1500BigHornBuilder implements TruckDodgeRamBuilderInterface{
  EngineAssembly engine;//3
  Body body;//7 but has issue
  Suspension suspension;//10
  TruckDriveLine driveLine;//11
  RamTruckCabAndBed cabAndBox;//2
  TruckDrive truckDrive;//1
  TruckRearAxle truckRearAxle;//4
  TruckTire tire;//9
  TruckWheel wheel;//8
  TruckSeat seat;//6
  Paint paint;//5

  int truckDriveChoice;

  public TruckDodgeRamBuilderInterface askForTruckDrive(){
     TerminalPrompterBuilder truckDrivePrompter = TerminalPrompterBuilder.newBuilder();
     try{
        truckDriveChoice = truckDrivePrompter.addType("Drive")
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
    int cabAndBedChoice = 0;
     TerminalPrompterBuilder cabAndBedPrompter = TerminalPrompterBuilder.newBuilder();
     try{
        cabAndBedChoice = cabAndBedPrompter.addType("Cab And Box")
          .addOption(new  RamTruckCabAndBed(5.7,"Crew"))
          .addOption(new  RamTruckCabAndBed(6.4,"Crew"))
          .addOption(new  RamTruckCabAndBed(6.4,"Quad"))
          .addOption(new  RamTruckCabAndBed(6.4,"Regular"))
          .addOption(new  RamTruckCabAndBed(8,"Regular"))
          .sort()
          .build()
          .ask();
     }
     catch(Exception e){System.err.println(e);}
     cabAndBox= (RamTruckCabAndBed)cabAndBedPrompter.getOptions().get(cabAndBedChoice - 1);
     return this;
  }

  public TruckDodgeRamBuilderInterface askForPowerTrain(){
    TerminalPrompterBuilder enginePrompter = TerminalPrompterBuilder.newBuilder();

    //Add
    EcoEngine hemiVVTEngine = new HemiVVTEngine(345,new HorsePower(395,5600 ),new Torque(410,3950),8);
    EcoEngine vvtEngine = new VVTEngine(220,new HorsePower(305,6400 ),new Torque(269,4175),6);

    EngineAssembly hemi_VVTEngine  = new  StandardEcoEngine(hemiVVTEngine,new EconomyExhaust(),new NaturallyAspiratedInduction());
    EngineAssembly vvt_Engine  = new  StandardEcoEngine(vvtEngine,new EconomyExhaust(),new NaturallyAspiratedInduction());

    int numOfOptions = 0;

    try{
      enginePrompter.addType("Engine");
      enginePrompter.addOption(hemi_VVTEngine);
      enginePrompter.addOption(vvt_Engine);
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

  public TruckDodgeRamBuilderInterface askForColorAndInterior(){
    TerminalPrompterBuilder paintPrompter = TerminalPrompterBuilder.newBuilder();

    int numOfOptions = 0;

    try{
      paintPrompter.addType("Color");
      paintPrompter.addOption(new FlameRedClearCoat());
      paintPrompter.addOption(new BrightWhiteClearCoat());
      paintPrompter.addOption(new MaximumSteelMetallicClearCoat());
      paintPrompter.addOption(new BrilliantBlackCrystalPearl());
      paintPrompter.addOption(new BlackForestGreenPearl());
      paintPrompter.addOption(new MidnightBluePearl());
      paintPrompter.sort();
      //ArrayList<Object> colors = paintPrompter.getOptions();
      numOfOptions = paintPrompter.build().ask();
    }
    catch(Exception e){System.err.println(e);}
    paint = (Paint)paintPrompter.getOptions().get(numOfOptions - 1);

    TerminalPrompterBuilder seatPrompter = TerminalPrompterBuilder.newBuilder();
    try{
      seatPrompter.addType("Seats");
      seatPrompter.addOption(new PremiumBenchClothSeat());
      seatPrompter.addOption(new PremiumBucketClothSeat());
      seatPrompter.sort();
      numOfOptions = seatPrompter.build().ask();
    }
    catch(Exception e){System.err.println(e);}
    seat = (TruckSeat)seatPrompter.getOptions().get(numOfOptions - 1);
//Issue here as to cab type
    this.body = new CrewCab(new Quarterpanels(paint,null),
      new EngineCompartment(new Hood(paint,null)),
      new TruckCabin(seat), cabAndBox);

    return this;

  }
  public TruckDodgeRamBuilderInterface askForOptions(){
    int numOfOptions = 0;
    TerminalPrompterBuilder wheelPrompter = TerminalPrompterBuilder.newBuilder();
    try{
      wheelPrompter.addType("Wheel");
      wheelPrompter.addOption(new TruckAliminumWheel(20,8));
      wheelPrompter.sort();
      numOfOptions = wheelPrompter.build().ask();
    }
    catch (Exception e) {System.err.println(e);}
    wheel =(TruckWheel)wheelPrompter.getOptions().get(numOfOptions - 1);

    TerminalPrompterBuilder tirePrompter =TerminalPrompterBuilder.newBuilder();
    try{
      tirePrompter.addType("Tire");
      tirePrompter.addOption(new BSWAllSeasonTire("P275/60R20"));
      tirePrompter.addOption(new OWLAllSeasonTire("P275/60R20"));
      tirePrompter.sort();
      numOfOptions = tirePrompter.build().ask();
    }
    catch (Exception e) {System.err.println(e);}
    tire = (TruckTire)tirePrompter.getOptions().get(numOfOptions - 1);

    suspension = new  TruckSuspension( new StockShock(0),new StockSpring(0), tire,wheel);



    return this;
  }
  public TruckDodgeRamBuilderInterface askForPackages(){
    return this;
  }

  public Automobile build(){

    if(truckDriveChoice == 1){
      driveLine = new RamHeavyDutyRWD(truckDrive, truckRearAxle,
      new FrontDeadAxle(), new DriveShaft(), new ElectricSteering(),
      new LockingDifferential());
    }
    else if (truckDriveChoice == 2){
      driveLine = new RamFourWheelDrive(truckDrive, truckRearAxle,
      new FourWheelDriveAxle(), new DriveShaft(), new ElectricSteering(),
      new LockingDifferential());
    }

    return new Automobile("Ram", "1500", "BigHorn", body,driveLine,engine,suspension);
  }
  public static void main(String[] args) {
    Automobile ram1500BigHorn = new Ram1500BigHornBuilder()
      .askForTruckDrive()
      .askForTruckCabAndBed()
      .askForPowerTrain()
      .askForColorAndInterior()
      .askForOptions()
      .askForPackages()
      .build();

    System.out.println(ram1500BigHorn);
  }


}
