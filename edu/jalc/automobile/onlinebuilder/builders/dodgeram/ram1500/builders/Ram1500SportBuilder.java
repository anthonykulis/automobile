package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.builders;

import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.axle.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.cabandbox.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.drive.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.exteriorpaint.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.seating.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire.*;
//import new items form Ceaser
import edu.jalc.automobile.common.utils.prompter.*;
import java.util.*;

public class Ram1500SportBuilder implements DodgeRamBuilderInterface{

  public DodgeRamBuilderInterface askForPowerTrain(TerminalPrompterBuilderInterface promptBuilder){
    TerminalPrompterBuilder builder = TerminalPrompterBuilder.newBuilder();
    //builder.addType("Engine");
    //builder.addOption();

    return null;
  }
  public DodgeRamBuilderInterface askForColorAndInterior(TerminalPrompterBuilderInterface promptBuilder){
    TerminalPrompterBuilder builder = TerminalPrompterBuilder.newBuilder();
    builder.addType("Color");
    //Issues with the options being added. Not sure how to or why but continueing on adding them.
    builder.addOption(flameRedCLearCoat);
    builder.addOption(brightWhiteClearCoat);
    builder.addOption(maximumSteelMetallicClearCoat);
    builder.addOption(brilliantBlackCrystalPearl);
    builder.sort();

    return null;

  }
  public DodgeRamBuilderInterface askForOptions(TerminalPrompterBuilderInterface promptBuilder){
    return null;
  }
  public DodgeRamBuilderInterface askForPackages(TerminalPrompterBuilderInterface promptBuilder){
    return null;
  }

  public Automobile build(){
    return null;
  }


}
