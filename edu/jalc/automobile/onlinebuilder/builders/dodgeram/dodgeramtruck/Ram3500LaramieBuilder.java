package edu.jalc.automobile.onlinebuilder.builders.dodgeram.dodgeramtruck;

import edu.jalc.automobile.parts.body.*;
import edu.jalc.automobile.parts.engine.*;
import edu.jalc.automobile.parts.suspension.*;
import edu.jalc.automobile.parts.body.colors.*;;
import edu.jalc.automobile.parts.body.seat.LeatherSeat;
import edu.jalc.automobile.common.utils.prompter.TerminalPrompterBuilder;
import edu.jalc.automobile.common.utils.prompter.TerminalPrompter;
import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.onlinebuilder.components.body.Body;
import edu.jalc.automobile.onlinebuilder.components.driveline.TruckDriveLine;
import edu.jalc.automobile.onlinebuilder.components.engine.diesel.DieselEngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.body.truck.CrewCab;
import edu.jalc.automobile.onlinebuilder.components.suspension.towing.*;
import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;
import edu.jalc.automobile.onlinebuilder.components.driveline.truck.HeavyDutyRWD;
import edu.jalc.automobile.parts.exhaust.EconomyExhaust;
import edu.jalc.automobile.parts.induction.TurbochargedInduction;
import edu.jalc.automobile.parts.body.seat.Seat;
import edu.jalc.automobile.parts.driveline.*;
import edu.jalc.automobile.onlinebuilder.components.driveline.truck.SuperDutyFourWheelDrive;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.dodgeramtruck.*;




public class Ram3500LaramieBuilder implements DodgeRamTruckBuilderInterface{

  private EngineAssembly engine;
  private RearDriveAxle axle;
  private Suspension suspension;
  private Paint paint;
  private Seat seat;
  private Wheel wheel;
  private Wheel rearWheel;
  private Tire tire;
  private TruckCabandBed truckCabandBed;
  private FourWheelDriveAxle fourWheelDriveAxle;
  private Body body;

  int truckdrivecount = 1;
  public Ram3500LaramieBuilder askForTruckDrive(){

    TerminalPrompterBuilder truckDriveBuilder = new TerminalPrompterBuilder();

    try{
      truckdrivecount = truckDriveBuilder.addType("TruckDrive")
        .addOption(new FourByFourDrive())
        .addOption(new FourByTwoDrive())
        .sort()
        .build()
        .ask();
    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }

    fourWheelDriveAxle = (FourWheelDriveAxle)truckDriveBuilder.getOptions().get(truckdrivecount - 1);
    return this;
  }

  public Ram3500LaramieBuilder askForCabandBed(){

    TerminalPrompterBuilder cabAndBedBuilder = new TerminalPrompterBuilder();

    int cabAndBedcount = 1;
    try{
      cabAndBedcount = cabAndBedBuilder.addType("Cab and Bed Length")
        .addOption(new TruckCabandBed("Crew Cab", 8, 0))
        .addOption(new TruckCabandBed("Crew Cab", 6, 4))
        .addOption(new TruckCabandBed("Mega Cab", 6, 4))
        .sort()
        .build()
        .ask();
    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }

    truckCabandBed = (TruckCabandBed)cabAndBedBuilder.getOptions().get(cabAndBedcount -1);
    return this;
  }

  public Ram3500LaramieBuilder askForPowerTrain(){

    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();

    int engineOptions = 1;
    try{
    engineOptions = builder.addType("Engine")
      .addOption(new HEMIVTTEngine())
      .addOption(new HeavyDutyHEMI())
      .addOption(new CumminsTurboDieselEngine())
      .sort()
      .build()
      .ask();

    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }
    engine = (EngineAssembly)builder.getOptions().get(engineOptions -1);

    TerminalPrompterBuilder axleBuilder = new TerminalPrompterBuilder();
    int axleOptions = 1;
    try{
    axleOptions = axleBuilder.addType("Axle")
      .addOption(new RearAxleRatio(3.42))
      .addOption(new RearAxleRatio(3.73))
      .addOption(new RearAxleRatio(4.10))
      .sort()
      .build()
      .ask();

    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }
    axle = (RearDriveAxle)axleBuilder.getOptions().get(axleOptions - 1);

    TerminalPrompterBuilder suspensionBuilder = new TerminalPrompterBuilder();

    int suspensionOptions;
    try{
    suspensionOptions = suspensionBuilder.addType("Suspension")
      .addOption(new AirSuspension())
      .sort()
      .build()
      .ask();

    suspension = (Suspension)suspensionBuilder.getOptions().get(suspensionOptions - 1);

    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }
    return this;
  }


  public Ram3500LaramieBuilder askForColorAndInterior(){

    TerminalPrompterBuilder colorBuilder = new TerminalPrompterBuilder();

    int exteriorColors = 1;
    try{
    exteriorColors = colorBuilder.addType("Exterior Color")
      .addOption(new BrightGreen())
      .addOption(new BrightRed())
      .addOption(new Yellow())
      .addOption(new HillsGreen())
      .addOption(new SchoolBusYellow())
      .addOption(new TreeGreen())
      .sort()
      .build()
      .ask();

    paint = (Paint)colorBuilder.getOptions().get(exteriorColors - 1);

    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
      }

      TerminalPrompterBuilder seatBuilder = new TerminalPrompterBuilder();

      int seatingOptions = 1;
      try{
      seatingOptions = seatBuilder.addType("Seating and Trim")
        .addOption(new LeatherSeat())
        .build()
        .ask();

      seat = (Seat)seatBuilder.getOptions().get(seatingOptions - 1);

   } catch(Exception e){
     e.printStackTrace();
     System.exit(1);
   }

      return this;
  }


  public Ram3500LaramieBuilder askForPackages(){
    return this;
  }


  public Ram3500LaramieBuilder askForOptions(){

    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();

    int wheelOption = 1;
    try{
    wheelOption = builder.addType("Wheels")
      .addOption(new BlackPaintedAluminumWheel(20))
      .addOption(new PaintedAluminumWheel(20))
      .addOption(new PolishedAluminumWheel(18))
      .sort()
      .build()
      .ask();

    wheel = (Wheel)builder.getOptions().get(wheelOption - 1);

    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }

      TerminalPrompterBuilder tireBuilder = new TerminalPrompterBuilder();

      int tireOptions = 1;
      try{
      tireOptions = tireBuilder.addType("Tires")
        .addOption(new AllSeasonTire(275,70))
        .addOption(new AllTerrainTire(275,70))
        .addOption(new AllTerrainTire(285,60))
        .sort()
        .build()
        .ask();

      tire = (Tire)tireBuilder.getOptions().get(tireOptions - 1);

     } catch(Exception e){
       e.printStackTrace();
       System.exit(1);
     }

    return this;

  }
  public Automobile build(){

    Graphic graphic = new Graphic("Ram 3500 Laramie");
    Body body = new CrewCab(new Quarterpanels(paint, graphic), new EngineCompartment(new Hood(paint, graphic))
                    , new LuxuryCabin(seat), truckCabandBed);

    TruckDriveLine driveline = null;
    /* Note that HeavyDutyRWD does not take in a fourWheelDriveAxle so displaying 4x2 Drive isnt possible as well as
      SuperDutyFourWheelDrive does not take in a axle so displaying axle for SuperDutyFourWheelDrive is impossible.*/
    if (truckdrivecount == 1){
      driveline = new HeavyDutyRWD(axle, new FrontDeadAxle(), new DriveShaft()
                   , new ElectricSteering(), new LockingDifferential());
    }
    else{
      driveline = new SuperDutyFourWheelDrive(fourWheelDriveAxle, new DriveShaft()
                    , new ElectricSteering(), new LockingDifferential());
    }

    EngineAssembly engineAssembly = new DieselEngineAssembly((DieselEngine)engine, new EconomyExhaust()
                                    , new TurbochargedInduction());

    Suspension towing = new TowingHeavyDuty(new HeavyShock(0), new HeavySpring(0), tire, wheel);

    Automobile automobile = new Automobile("Ram", "3500", "Laramie", body, driveline, engineAssembly, towing);

    return automobile;

  }

  public static void main(String[] args)throws Exception{
    Ram3500LaramieBuilder rm = new Ram3500LaramieBuilder();
    rm.askForTruckDrive();
    rm.askForCabandBed();
    rm.askForPowerTrain();
    rm.askForColorAndInterior();
    rm.askForOptions();
    System.out.println(rm.build());
  }
}
