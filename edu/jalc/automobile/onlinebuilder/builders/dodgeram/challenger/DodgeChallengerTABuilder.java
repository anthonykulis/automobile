package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger;

import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.common.utils.prompter.*;

import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.engine.HemiVvtSportEngine;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.engine.HemiMdsVvtSportEngine;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.paint.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.seat.ClothBucketSeat;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.wheel.AluminumForgedWheel;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.tire.AllSeasonPerformanceTire;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.ThreeSeasonPerformanceTire;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.parts.brake.*;

import edu.jalc.automobile.onlinebuilder.components.engine.sport.NaturallyAspiratedSportEngine;
import edu.jalc.automobile.parts.engine.SportEngine;
import edu.jalc.automobile.parts.induction.NaturallyAspiratedInduction;
import edu.jalc.automobile.parts.exhaust.PerformanceExhaust;


public class DodgeChallengerTABuilder implements DodgeRamBuilderInterface{

  EngineAssembly engine;

  public DodgeRamBuilderInterface askForPowerTrain(TerminalPrompterBuilderInterface promptBuilder){
    SportEngine hemiVvtEngine = new HemiVvtSportEngine(5.7,new HorsePower(375,5200),new Torque(410,4200),8);
    SportEngine hemiMdsVvtSportEngine = new HemiMdsVvtSportEngine(5.7,new HorsePower(375,5200),new Torque(410,4200),8);
    EngineAssembly vvt_Engine = new NaturallyAspiratedSportEngine(hemiVvtEngine, new PerformanceExhaust(), new NaturallyAspiratedInduction());
    EngineAssembly mds_Vvt_Engine = new NaturallyAspiratedSportEngine(hemiMdsVvtSportEngine, new PerformanceExhaust(), new NaturallyAspiratedInduction());
    promptBuilder.addType("Powertrain");
    promptBuilder.addOption(vvt_Engine);
    promptBuilder.addOption(mds_Vvt_Engine);
    promptBuilder.sort();
    
  }
}
