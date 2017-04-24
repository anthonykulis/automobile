package edu.jalc.automobile.common.utils.prompter;

import edu.jalc.automobile.parts.body.colors.BrightGreen;
import edu.jalc.automobile.parts.body.colors.BrightRed;
import edu.jalc.automobile.parts.body.colors.Yellow;
import edu.jalc.automobile.parts.body.colors.HillsGreen;
import edu.jalc.automobile.parts.body.colors.SchoolBusYellow;
import edu.jalc.automobile.parts.body.colors.TreeGreen;
import edu.jalc.automobile.parts.body.seat.LeatherSeat;


public class ColorPrompter{

  public static void main(String[] args) throws Exception{

    BrightGreen brightGreen = new BrightGreen();
    BrightRed brightRed = new BrightRed();
    Yellow yellow = new Yellow();
    HillsGreen hillsGreen = new HillsGreen();
    SchoolBusYellow schoolBusYellow = new SchoolBusYellow();
    TreeGreen treeGreen = new TreeGreen();
    LeatherSeat leatherSeat = new LeatherSeat();

    TerminalPrompterBuilder builder = TerminalPrompterBuilder.newBuilder();

    TerminalPrompter prompter = builder.addType("Exterior Color")
      .addOption(brightGreen)
      .addOption(brightRed)
      .addOption(yellow)
      .addOption(hillsGreen)
      .addOption(schoolBusYellow)
      .addOption(treeGreen)
      .sort()
      .build();

      prompter.ask();

      TerminalPrompterBuilder.newBuilder().addType("Seating and Trim")
        .addOption(leatherSeat)
        .build()
        .ask();



  }
}
