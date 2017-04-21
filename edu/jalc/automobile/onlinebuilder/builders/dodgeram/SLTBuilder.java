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
//import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;
import edu.jalc.automobile.parts.suspension.AirSuspension;

public class SLTBuilder implements DodgeRamBuilderInterface{

   private Engine engine;
   private RearDriveAxle axle;
   private AirSuspension suspension;


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

      suspension = (AirSuspension)builder.getOptions().get(0);

    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }
    return this;
  }

  public SLTBuilder askForColorAndInterior(){return this;}
  public SLTBuilder askForOptions(){return this;}
  public SLTBuilder askForPackages(){return this;}
  public Automobile build(){return null;}

  public static void main(String[] args) {
    SLTBuilder builder = new SLTBuilder();
    builder.askForPowerTrain();
  }

}
