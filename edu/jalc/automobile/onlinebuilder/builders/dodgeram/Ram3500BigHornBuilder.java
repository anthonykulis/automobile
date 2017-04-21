package edu.jalc.automobile.onlinebuilder.builders.dodgeram;

import edu.jalc.automobile.parts.engine.HEMIVTTEngine;
import edu.jalc.automobile.parts.engine.HeavyDutyHEMI;
import edu.jalc.automobile.parts.engine.CumminsTurboDieselEngine;
import edu.jalc.automobile.parts.driveline.RearAxleRatio;
import edu.jalc.automobile.parts.suspension.AirSuspension;

public class Ram3500BigHornBuilder implements DodgeRamBuilderInterface{

  public DodgeRamBuilderInterface askForPowerTrain(){

    HEMIVTTEngine hemi = new HEMIVTTEngine();
    HeavyDutyHEMI heavy = new HeavyDutyHEMI();
    CumminsTurboDieselEngine diesel = new CumminsTurboDieselEngine();
    RearAxleRatio axle1 = new RearAxleRatio(3.42);
    RearAxleRatio axle2 = new RearAxleRatio(3.73);
    RearAxleRatio axle3 = new RearAxleRatio(4.10);
    AirSuspension suspension = new AirSuspension();


    TerminalPrompterBuilder builder = TerminalPrompterBuilder.newBuilder();

    TerminalPrompter prompter = builder.addType("Engine")
      .addOption(hemi)
      .addOption(heavy)
      .addOption(diesel)
      .sort()
      .build();

      prompter.ask();

    TerminalPrompterBuilder.newBuilder().addType("Axle")
      .addOption(axle1)
      .addOption(axle2)
      .addOption(axle3)
      .sort()
      .build()
      .ask();

    TerminalPrompterBuilder.newBuilder().addType("Suspension")
      .addOption(suspension)
      .sort()
      .build()
      .ask();

  }
  public static void main(String[] args) throws Exception{

  }
  Ram3500BigHornBuilder rb = new Ram3500BigHornBuilder();
  rb.askForPowerTrain();
}
