package edu.jalc.automobile.onlinebuilder.builders.dodgeram;

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



public class Ram3500BigHornBuilder implements DodgeRamBuilderInterface{

  private Engine engine;
  private RearDriveAxle axle;
  private Suspension suspension;
  private Paint paint;
  private Seat seat;
  private Wheel wheel;
  private Wheel rearWheel;
  private Tire tire;

  public Ram3500BigHornBuilder askForPowerTrain(){


    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();

    int engineOptions = 0;
    try{
    engineOptions = builder.addType("Engine")
      .addOption(new HEMIVTTEngine())
      .addOption(new HeavyDutyHEMI())
      .addOption(new CumminsTurboDieselEngine())
      .sort()
      .build()
      .ask();

    engine = (Engine)builder.getOptions().get(engineOptions -1);

    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }

    TerminalPrompterBuilder axleBuilder = new TerminalPrompterBuilder();
    int axleOptions = 0;
    try{
    axleOptions = axleBuilder.newBuilder().addType("Axle")
      .addOption(new RearAxleRatio(3.42))
      .addOption(new RearAxleRatio(3.73))
      .addOption(new RearAxleRatio(4.10))
      .sort()
      .build()
      .ask();

    axle = (RearDriveAxle)axleBuilder.getOptions().get(axleOptions - 1);

    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }

    TerminalPrompterBuilder suspensionBuilder = new TerminalPrompterBuilder();

    int suspensionOptions = 0;
    try{
    suspensionOptions = suspensionBuilder.newBuilder().addType("Suspension")
      .addOption(new AirSuspension())
      .sort()
      .build()
      .ask();

    suspension = (Suspension)suspensionBuilder.getOptions().get(0);

    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }
    return this;
  }


  public Ram3500BigHornBuilder askForColorAndInterior(){

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
      seatingOptions = seatBuilder.newBuilder().addType("Seating and Trim")
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


  public Ram3500BigHornBuilder askForPackages(){

    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();

    int packageOptions = 1;
    try{
    packageOptions = builder.addType("Packages")
      .addOption(new DualRearWheel())
      .build()
      .ask();

    rearWheel = (Wheel)builder.getOptions().get(packageOptions - 1);

    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }

    return this;
  }


  public Ram3500BigHornBuilder askForOptions(){

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
      tireOptions = tireBuilder.newBuilder().addType("Tires")
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

    Graphic graphic = new Graphic("Ram 3500 BigHorn");
    Body body = new CrewCab(new Quarterpanels(paint, graphic), new EngineCompartment(new Hood(paint, graphic))
                    , new LuxuryCabin(seat), new LongBed(4));

    TruckDriveLine driveline = new HeavyDutyRWD(axle, new FrontDeadAxle(), new DriveShaft()
                                  , new ElectricSteering(), new LockingDifferential());

    EngineAssembly engineAssembly = new DieselEngineAssembly((DieselEngine)engine, new EconomyExhaust()
                                      , new TurbochargedInduction());

    Suspension towing = new TowingHeavyDuty(new HeavyShock(0), new HeavySpring(0), tire, wheel);

    return new Automobile("Ram", "3500", "BigHorn", body, driveline, engineAssembly, towing);

  }

  public static void main(String[] args)throws Exception{
    Ram3500BigHornBuilder rm = new Ram3500BigHornBuilder();
    rm.askForPowerTrain();
    rm.askForColorAndInterior();
    rm.askForPackages();
    rm.askForOptions();
    rm.build();
  }
}
