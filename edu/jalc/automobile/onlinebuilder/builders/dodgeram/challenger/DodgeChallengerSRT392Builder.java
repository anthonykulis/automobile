package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger;

import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.common.utils.prompter.*;
import edu.jalc.automobile.parts.engine.specs.*;
import edu.jalc.automobile.parts.engine.EngineAssembly;

public class DodgeChallengerSRT392Builder implements DodgeRamBuilderInterface{

  public DodgeRamBuilderInterface askForPowerTrain(TerminalPrompterBuilderInterface promptBuilder){
    EngineAssembly mdsEngine = new HemiMdsSportEngine(392,new HorsePower(485,4000),new Torque(475,3000),8);
    EngineAssembly hemiEngine = new HEMISportEngine(392,new HorsePower(485,4000),new Torque(475,3000),8);
    promptBuilder.addType("Powertrain");
    promptBuilder.addOption(mdsEngine);
    promptBuilder.addOption(hemiEngine);
    promptBuilder.sort();
    promptBuilder.build().ask();
  }
  public DodgeRamBuilderInterface askForColorAndInterior(TerminalPrompterBuilderInterface promptBuilder){

  }
  public DodgeRamBuilderInterface askForOptions(TerminalPrompterBuilderInterface promptBuilder){

  }
  public DodgeRamBuilderInterface askForPackages(TerminalPrompterBuilderInterface promptBuilder){

  }
}
