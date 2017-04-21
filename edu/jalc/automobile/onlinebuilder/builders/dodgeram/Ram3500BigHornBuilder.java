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

public class Ram3500BigHornBuilder implements DodgeRamBuilderInterface{

  public Ram3500BigHornBuilder askForPowerTrain(){

    TerminalPrompterBuilder builder = TerminalPrompterBuilder.newBuilder();

    TerminalPrompter prompter = builder.addType("Engine")
      .addOption(new HEMIVTTEngine())
      .addOption(new HeavyDutyHEMI())
      .addOption(new CumminsTurboDieselEngine())
      .sort()
      .build();

      prompter.ask();

    TerminalPrompterBuilder.newBuilder().addType("Axle")
      .addOption(new RearAxleRatio(3.42))
      .addOption(new RearAxleRatio(3.73))
      .addOption(new RearAxleRatio(4.10))
      .sort()
      .build()
      .ask();

    TerminalPrompterBuilder.newBuilder().addType("Suspension")
      .addOption(new AirSuspension())
      .sort()
      .build()
      .ask();

  }
  public Ram3500BigHornBuilder askForColorAndInterior(){

    TerminalPrompterBuilder builder = TerminalPrompterBuilder.newBuilder();

    TerminalPrompter prompter = builder.addType("Exterior Color")
      .addOption(new BrightGreen())
      .addOption(new BrightRed())
      .addOption(new Yellow())
      .addOption(new HillsGreen())
      .addOption(new SchoolBusYellow())
      .addOption(new TreeGreen())
      .sort()
      .build();

      prompter.ask();

      TerminalPrompterBuilder.newBuilder().addType("Seating and Trim")
        .addOption(new LeatherSeat())
        .build()
        .ask();
  }
  public Ram3500BigHornBuilder askForPackages(){
    TerminalPrompterBuilder builder = TerminalPrompterBuilder.newBuilder();

    TerminalPrompter prompter = builder.addType("Packages")
      .addOption(new DualRearWheel())
      .build();

      prompter.ask();
  }
  public Ram3500BigHornBuilder askForOptions(){
    TerminalPrompterBuilder builder = TerminalPrompterBuilder.newBuilder();

    TerminalPrompter prompter = builder.addType("Wheels")
      .addOption(new BlackPaintedAluminumWheel(20))
      .addOption(new PaintedAluminumWheel(20))
      .addOption(new PolishedAluminumWheel(18))
      .sort()
      .build();

      prompter.ask();

      TerminalPrompterBuilder.newBuilder().addType("Tires")
        .addOption(new AllSeasonTire(275,70))
        .addOption(new AllTerrainTire(275,70))
        .addOption(new AllTerrainTire(285,60))
        .sort()
        .build()
        .ask();

  }
  public Automobile build(){help}
}
