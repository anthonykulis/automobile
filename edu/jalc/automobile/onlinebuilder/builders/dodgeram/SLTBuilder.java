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

public class SLTBuilder implements DodgeRamBuilderInterface{

   private Engine engine;
   private RearDriveAxle axle;
   private Suspension suspension;
   private Paint paint;
   private Seat seat;
   private Wheel packages;


   public SLTBuilder askForPowerTrain(){
    TerminalPrompterBuilder builder = new TerminalPrompterBuilder();
    try {
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

  public SLTBuilder askForColorAndInterior(){
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
  public SLTBuilder askForOptions(){return this;}
  public SLTBuilder askForPackages(){
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
  public Automobile build(){return null;}

  public static void main(String[] args) {
    SLTBuilder builder = new SLTBuilder();
    builder.askForPowerTrain();
    builder.askForColorAndInterior();
    builder.askForPackages();
  }

}
