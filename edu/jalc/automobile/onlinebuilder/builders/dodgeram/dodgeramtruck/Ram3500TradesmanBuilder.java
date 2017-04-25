package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dodgeramtruck;

import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.common.utils.prompter.TerminalPrompterBuilderInterface;
import edu.jalc.automobile.common.utils.prompter.TerminalPrompterBuilder;
import edu.jalc.automobile.parts.engine.Engine;
import edu.jalc.automobile.parts.engine.HEMIVTTEngine;
import edu.jalc.automobile.parts.engine.HeavyDutyHEMI;
import edu.jalc.automobile.parts.engine.CumminsTurboDieselEngine;
import edu.jalc.automobile.parts.driveline.RearDriveAxle;
import edu.jalc.automobile.parts.driveline.RearAxleRatio;
import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;
import edu.jalc.automobile.parts.suspension.AirSuspension;
import edu.jalc.automobile.parts.body.Paint;
import edu.jalc.automobile.parts.body.colors.BrightGreen;
import edu.jalc.automobile.parts.body.colors.BrightRed;
import edu.jalc.automobile.parts.body.colors.HillsGreen;
import edu.jalc.automobile.parts.body.colors.SchoolBusYellow;
import edu.jalc.automobile.parts.body.colors.TreeGreen;
import edu.jalc.automobile.parts.body.colors.Yellow;
import edu.jalc.automobile.parts.body.seat.*;
import edu.jalc.automobile.parts.suspension.*;
import edu.jalc.automobile.parts.suspension.Tire;
import edu.jalc.automobile.parts.suspension.AllSeasonTire;
import edu.jalc.automobile.parts.suspension.AllTerrainTire;
import edu.jalc.automobile.onlinebuilder.components.body.truck.*;
import edu.jalc.automobile.onlinebuilder.components.body.Body;
import edu.jalc.automobile.parts.body.*;
import edu.jalc.automobile.onlinebuilder.components.driveline.truck.*;
import edu.jalc.automobile.onlinebuilder.components.driveline.TruckDriveLine;
import edu.jalc.automobile.parts.driveline.*;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.diesel.DieselEngineAssembly;
import edu.jalc.automobile.parts.engine.DieselEngine;
import edu.jalc.automobile.parts.exhaust.*;
import edu.jalc.automobile.parts.induction.*;
import edu.jalc.automobile.onlinebuilder.components.suspension.towing.*;
import edu.jalc.automobile.parts.suspension.*;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.EcoEngineAssembly;
import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.boosted.turbocharged.TurbochargedEcoEngine;

public class Ram3500TradesmanBuilder implements DodgeRamTruckBuilderInterface{

  private TruckCabandBed truckCabAndBed;
  private FourWheelDriveAxle fourWheelDriveAxle;
  private Engine engine;
  private RearDriveAxle axle;
  private Suspension suspension;
  private Paint paint;
  private Seat seat;
  private Wheel packages;
  private Wheel wheel;
  private Tire tire;

  int truckDriveOption = 1;
  public Ram3500TradesmanBuilder askForCabAndBed(){
    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();
    try{
      truckDriveOption = builder.addType("Cab and Bed Length")
       .addOption(new TruckCabandBed("Crew Cabin", 8, 0))
       .addOption(new TruckCabandBed("Crew Cabin", 6, 4))
       .addOption(new TruckCabandBed("Regular", 8, 0))
       .sort()
       .build()
       .ask();

       truckCabAndBed = (TruckCabandBed)builder.getOptions().get(truckDriveOption - 1);
    } catch(Exception e){
       e.printStackTrace();
       System.exit(1);
    }

    builder = new TerminalPrompterBuilder();
    try{
      truckDriveOption = builder.addType("Truck Drive")
       .addOption(new FourByFourDrive())
       .addOption(new FourByTwoDrive())
       .sort()
       .build()
       .ask();

       fourWheelDriveAxle = (FourWheelDriveAxle)builder.getOptions().get(truckDriveOption - 1);

    }catch(Exception e){
       e.printStackTrace();
       System.exit(1);
    }

    return this;
  }

   public Ram3500TradesmanBuilder askForPowerTrain(){
    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();
    int engineChoice = 1;
    try {
      engineChoice = builder.addType("Engine")
        .addOption(new HEMIVTTEngine())
        .addOption(new HeavyDutyHEMI())
        .addOption(new CumminsTurboDieselEngine())
        .sort()
        .build()
        .ask();

        engine = (Engine)builder.getOptions().get(engineChoice - 1);

    } catch(Exception e){
        e.printStackTrace();
        System.exit(1);
    }

    builder = new TerminalPrompterBuilder();
    int axleChoice = 1;
    try{
      axleChoice = builder.addType("Axle")
        .addOption(new RearAxleRatio(3.42))
        .addOption(new RearAxleRatio(3.73))
        .addOption(new RearAxleRatio(4.10))
        .sort()
        .build()
        .ask();

        axle = (RearDriveAxle)builder.getOptions().get(axleChoice - 1);

    } catch(Exception e){
        e.printStackTrace();
        System.exit(1);
    }

    builder = new TerminalPrompterBuilder();
    int suspensionChoice = 1;
    try{
      suspensionChoice = builder.addType("Suspension")
        .addOption(new AirSuspension())
        .sort()
        .build()
        .ask();

        suspension = (Suspension)builder.getOptions().get(suspensionChoice - 1);

    } catch(Exception e){
        e.printStackTrace();
        System.exit(1);
    }
    return this;
  }

  public Ram3500TradesmanBuilder askForColorAndInterior(){
    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();
    int paintChoice = 1;
    try{
      paintChoice = builder.addType("Exterior Paint")
        .addOption(new BrightGreen())
        .addOption(new BrightRed())
        .addOption(new HillsGreen())
        .addOption(new SchoolBusYellow())
        .addOption(new TreeGreen())
        .addOption(new Yellow())
        .sort()
        .build()
        .ask();

        paint = (Paint)builder.getOptions().get(paintChoice - 1);
    } catch(Exception e){
        e.printStackTrace();
        System.exit(1);
    }

    builder = new TerminalPrompterBuilder();
    int seatChoice = 1;
    try{
      seatChoice = builder.addType("Seating and Trim")
        .addOption(new ClothSeat())
        .addOption(new VinylSeat())
        .sort()
        .build()
        .ask();

        seat = (Seat)builder.getOptions().get(seatChoice - 1);
    } catch(Exception e){
        e.printStackTrace();
        System.exit(1);
    }

    return this;
  }

  public Ram3500TradesmanBuilder askForOptions(){
    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();
    int wheelChoice = 1;
    try{
      wheelChoice = builder.addType("Wheels")
        .addOption(new SteelWheel(18))
        .addOption(new SteelChromeCladWheel(18))
        .addOption(new SteelChromeCladWheel(17))
        .addOption(new SteelArgentWheel(17))
        .sort()
        .build()
        .ask();

        wheel = (Wheel)builder.getOptions().get(wheelChoice - 1);

    } catch(Exception e){
        e.printStackTrace();
        System.exit(1);
    }

    builder = new TerminalPrompterBuilder();
    int tireChoice = 1;
    try{
      tireChoice = builder.addType("Tires")
        .addOption(new AllSeasonTire(275, 70))
        .addOption(new AllTerrainTire(275, 70))
        .sort()
        .build()
        .ask();

        tire = (Tire)builder.getOptions().get(tireChoice - 1);

    } catch(Exception e){
        e.printStackTrace();
        System.exit(1);
    }

    return this;
  }

  public Ram3500TradesmanBuilder askForPackages(){
    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();
    int packageChoice = 1;
    try{
      packageChoice = builder.addType("Packages")
        .addOption(new DualRearWheel())
        .sort()
        .build()
        .ask();

        packages = (Wheel)builder.getOptions().get(0);
    } catch(Exception e){
        e.printStackTrace();
        System.exit(0);
    }

    return this;
  }

  public Automobile build(){

    Body body = new CrewCab(new Quarterpanels(paint, new Graphic())
                , new EngineCompartment(new Hood(paint, new Graphic()))
                , new LuxuryCabin(seat), new LongBed(4));

   TruckDriveLine driveline = null;
   if(truckDriveOption == 1){
      driveline = new HeavyDutyRWD(axle, new FrontDeadAxle(), new DriveShaft()
                              , new ElectricSteering(), new LockingDifferential());
   }else{
      driveline = new SuperDutyFourWheelDrive(fourWheelDriveAxle, new DriveShaft()
                              , new ElectricSteering(), new LockingDifferential());
   }
    EngineAssembly engineAssembly = null;
    if(engine == new CumminsTurboDieselEngine()){
      engineAssembly = new DieselEngineAssembly((DieselEngine)engine, new EconomyExhaust()
                                                       , new TurbochargedInduction());
    } else {
        engineAssembly = new TurbochargedEcoEngine((EcoEngine)engine, new EconomyExhaust()
                         , new TurbochargedInduction());
    }

    Suspension towing = new TowingHeavyDuty(new HeavyShock(0), new HeavySpring(0), tire, wheel);

    return new Automobile("Ram", "3500", "Tradesman", body, driveline, engineAssembly, towing);
  }

  public static void main(String[] args) throws Exception{
    System.out.println(new Ram3500TradesmanBuilder()
      .askForCabAndBed()
      .askForPowerTrain()
      .askForColorAndInterior()
      .askForOptions()
      .askForPackages()
      .build());
  }

}
