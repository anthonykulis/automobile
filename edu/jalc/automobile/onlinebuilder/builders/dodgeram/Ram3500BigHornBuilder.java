package edu.jalc.automobile.onlinebuilder.builders.dodgeram;

import edu.jalc.automobile.parts.engine.HEMIVTTEngine;
import edu.jalc.automobile.parts.engine.HeavyDutyHEMI;
import edu.jalc.automobile.parts.engine.CumminsTurboDieselEngine;
import edu.jalc.automobile.parts.driveline.RearAxleRatio;
import edu.jalc.automobile.parts.suspension.AirSuspension;
import edu.jalc.automobile.parts.body.colors.BrightGreen;
import edu.jalc.automobile.parts.body.colors.BrightRed;
import edu.jalc.automobile.parts.body.colors.Yellow;
import edu.jalc.automobile.parts.body.colors.HillsGreen;
import edu.jalc.automobile.parts.body.colors.SchoolBusYellow;
import edu.jalc.automobile.parts.body.colors.TreeGreen;
import edu.jalc.automobile.parts.body.seat.LeatherSeat;
import edu.jalc.automobile.parts.suspension.DualRearWheel;
import edu.jalc.automobile.common.utils.prompter.TerminalPrompterBuilder;
import edu.jalc.automobile.common.utils.prompter.TerminalPrompter;
import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.parts.suspension.BlackPaintedAluminumWheel;
import edu.jalc.automobile.parts.suspension.PaintedAluminumWheel;
import edu.jalc.automobile.parts.suspension.PolishedAluminumWheel;
import edu.jalc.automobile.parts.suspension.AllSeasonTire;
import edu.jalc.automobile.parts.suspension.AllTerrainTire;
import edu.jalc.automobile.parts.driveline.RearDriveAxle;
import edu.jalc.automobile.parts.engine.Engine;
import edu.jalc.automobile.parts.body.Paint;
import edu.jalc.automobile.parts.body.seat.Seat;
import edu.jalc.automobile.parts.suspension.Wheel;
import edu.jalc.automobile.parts.suspension.Tire;

public class Ram3500BigHornBuilder implements DodgeRamBuilderInterface{

  private Engine engine;
  private RearDriveAxle axle;
  private AirSuspension suspension;
  private  Paint paint;
  private Seat seat;
  private Wheel wheel;
  private Wheel rearWheel;
  private Tire tire;

  public Ram3500BigHornBuilder askForPowerTrain(){


    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();
    try{
    builder.addType("Engine")
      .addOption(new HEMIVTTEngine())
      .addOption(new HeavyDutyHEMI())
      .addOption(new CumminsTurboDieselEngine())
      .sort()
      .build()
      .ask();

      engine = (Engine)builder.getOptions().get(0);

    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }

    builder = new TerminalPrompterBuilder();

    try{
    builder.newBuilder().addType("Axle")
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
    builder.newBuilder().addType("Suspension")
      .addOption(new AirSuspension())
      .build()
      .ask();

      suspension = (AirSuspension)builder.getOptions().get(0);

    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }
    return this;
  }


  public Ram3500BigHornBuilder askForColorAndInterior(){

    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();

    try{
    builder.addType("Exterior Color")
      .addOption(new BrightGreen())
      .addOption(new BrightRed())
      .addOption(new Yellow())
      .addOption(new HillsGreen())
      .addOption(new SchoolBusYellow())
      .addOption(new TreeGreen())
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
      builder.newBuilder().addType("Seating and Trim")
        .addOption(new LeatherSeat())
        .build()
        .ask();

        seat = (Seat)builder.getOptions().get(0);

   } catch(Exception e){
     e.printStackTrace();
     System.exit(1);
   }

      return this;
  }


  public Ram3500BigHornBuilder askForPackages(){

    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();

    try{
    builder.addType("Packages")
      .addOption(new DualRearWheel())
      .build()
      .ask();

      rearWheel = (Wheel)builder.getOptions().get(0);

    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }

    return this;
  }


  public Ram3500BigHornBuilder askForOptions(){

    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();

    try{
    builder.addType("Wheels")
      .addOption(new BlackPaintedAluminumWheel(20))
      .addOption(new PaintedAluminumWheel(20))
      .addOption(new PolishedAluminumWheel(18))
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
      builder.newBuilder().addType("Tires")
        .addOption(new AllSeasonTire(275,70))
        .addOption(new AllTerrainTire(275,70))
        .addOption(new AllTerrainTire(285,60))
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
  public Automobile build(){return null;}

  public static void main(String[] args)throws Exception{
    Ram3500BigHornBuilder rm = new Ram3500BigHornBuilder();
    rm.askForPowerTrain();
    rm.askForColorAndInterior();
    rm.askForPackages();
    rm.askForOptions();
  }
}
