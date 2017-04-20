package edu.jalc.automobile.common.utils.prompter;
import edu.jalc.automobile.parts.suspension.DualRearWheel;

public class PackagePrompter{

  public static void main(String[] args) throws Exception{

    DualRearWheel dualRearWheel = new DualRearWheel();

    TerminalPrompterBuilder builder = TerminalPrompterBuilder.newBuilder();

    TerminalPrompter prompter = builder.addType("Packages")
      .addOption(dualRearWheel)
      .build();

      prompter.ask();
  }
}
