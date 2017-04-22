package edu.jalc.automobile.onlinebuilder.builders.dodgeram;

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
import edu.jalc.automobile.parts.body.seat.Seat;
import edu.jalc.automobile.parts.body.seat.ClothSeat;
import edu.jalc.automobile.parts.suspension.Wheel;
import edu.jalc.automobile.parts.suspension.DualRearWheel;
import edu.jalc.automobile.parts.suspension.SteelWheel;
import edu.jalc.automobile.parts.suspension.SteelChromeCladWheel;
import edu.jalc.automobile.parts.suspension.SteelArgentWheel;
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

public class Ram3500SLTBuilder implements DodgeRamBuilderInterface{

   private DieselEngine engine;
   private RearDriveAxle axle;
   private Suspension suspension;
   private Paint paint;
   private Seat seat;
   private Wheel packages;
   private Wheel wheel;
   private Tire tire;

   public Ram3500SLTBuilder askForPowerTrain(){
    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();
    try {
      builder.addType("Engine")
        .addOption(new HEMIVTTEngine())
        .addOption(new HeavyDutyHEMI())
        .addOption(new CumminsTurboDieselEngine())
        .sort()
        .build()
        .ask();

        engine = (DieselEngine)builder.getOptions().get(0);

    } catch(Exception e){
        e.printStackTrace();
        System.exit(1);
    }

    builder = new TerminalPrompterBuilder();

    try{
      builder.addType("Axle")
        .addOption(new RearAxleRatio(3.42))
        .addOption(new RearAxleRatio(3.73))
        .addOption(new RearAxleRatio(4.10))
        .sort()
        .build()
        .ask();

        axle = (RearDriveAxle)builder.getOptions().get(0);

    } catch(Exception e){
        e.printStackTrace();
        System.exit(1);
    }

    builder = new TerminalPrompterBuilder();

    try{
      builder.addType("Suspension")
        .addOption(new AirSuspension())
        .sort()
        .build()
        .ask();

        suspension = (Suspension)builder.getOptions().get(0);

    } catch(Exception e){
        e.printStackTrace();
        System.exit(1);
    }
    return this;
  }

  public Ram3500SLTBuilder askForColorAndInterior(){
    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();

    try{
      builder.addType("Exterior Paint")
        .addOption(new BrightGreen())
        .addOption(new BrightRed())
        .addOption(new HillsGreen())
        .addOption(new SchoolBusYellow())
        .addOption(new TreeGreen())
        .addOption(new Yellow())
        .sort()
        .build()
        .ask();

        paint = (Paint)builder.getOptions().get(0);
    } catch(Exception e){
        e.printStackTrace();
        System.exit(1);
    }

    builder = new TerminalPrompterBuilder();

    try{
      builder.addType("Seating and Trim")
        .addOption(new ClothSeat())
        .sort()
        .build()
        .ask();

        seat = (Seat)builder.getOptions().get(0);
    } catch(Exception e){
        e.printStackTrace();
        System.exit(1);
    }

    return this;
  }

  public Ram3500SLTBuilder askForOptions(){
    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();

    try{
      builder.addType("Wheels")
        .addOption(new SteelWheel(18))
        .addOption(new SteelChromeCladWheel(18))
        .addOption(new SteelChromeCladWheel(17))
        .addOption(new SteelArgentWheel(17))
        .sort()
        .build()
        .ask();

        wheel = (Wheel)builder.getOptions().get(0);

    } catch(Exception e){
        e.printStackTrace();
        System.exit(1);
    }

    builder = new TerminalPrompterBuilder();

    try{
      builder.addType("Tires")
        .addOption(new AllSeasonTire())
        .addOption(new AllTerrainTire())
        .sort()
        .build()
        .ask();

        tire = (Tire)builder.getOptions().get(0);

    } catch(Exception e){
        e.printStackTrace();
        System.exit(1);
    }

    return this;
  }

  public Ram3500SLTBuilder askForPackages(){
    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();

    try{
      builder.addType("Packages")
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

    Graphic graphic = new Graphic();

    Body body = new CrewCab(new Quarterpanels(paint, graphic), new EngineCompartment(new Hood(paint, graphic))
                , new LuxuryCabin(seat), new LongBed(4));

    TruckDriveLine driveline = new HeavyDutyRWD(axle, new FrontDeadAxle(), new DriveShaft()
                               , new ElectricSteering(), new LockingDifferential());

    EngineAssembly engineAssembly = new DieselEngineAssembly((DieselEngine)engine, new EconomyExhaust()
                                    , new TurbochargedInduction());

    Suspension towing = new TowingHeavyDuty(new HeavyShock(0), new HeavySpring(0), tire, wheel);

    return new Automobile("Ram", "3500", "SLT", body, driveline, engineAssembly, towing);
  }

  public static void main(String[] args) throws Exception{
    System.out.println(new Ram3500SLTBuilder()
      .askForPowerTrain()
      .askForColorAndInterior()
      .askForOptions()
      .askForPackages()
      .build());
  }

}
