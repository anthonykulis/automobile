package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger;

import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.engine.*;
import edu.jalc.automobile.common.utils.prompter.*;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.sport.NaturallyAspiratedSportEngine;
import edu.jalc.automobile.parts.engine.SportEngine;
import edu.jalc.automobile.parts.induction.NaturallyAspiratedInduction;
import edu.jalc.automobile.parts.exhaust.PerformanceExhaust;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger.paint.*;

public class DodgeChallengerSRT392Builder implements DodgeRamBuilderInterface{

  EngineAssembly engine;

  public DodgeRamBuilderInterface askForPowerTrain(TerminalPrompterBuilderInterface promptBuilder){
    SportEngine mdsEngine = new HemiMdsSportEngine(392,new HorsePower(485,4000),new Torque(475,3000),8);
    SportEngine hemiEngine = new HEMISportEngine(392,new HorsePower(485,4000),new Torque(475,3000),8);
    EngineAssembly mds_Engine = new NaturallyAspiratedSportEngine(mdsEngine, new PerformanceExhaust(), new NaturallyAspiratedInduction());
    EngineAssembly hemi_Engine = new NaturallyAspiratedSportEngine(hemiEngine, new PerformanceExhaust(), new NaturallyAspiratedInduction());
    promptBuilder.addType("Powertrain");
    promptBuilder.addOption(mds_Engine);
    promptBuilder.addOption(hemi_Engine);
    promptBuilder.sort();
    int choice;
    try{choice = promptBuilder.build().ask();
    }catch(Exception e){choice = 0;}
    if (choice == 0) this.engine = mds_Engine;
    else this.engine = hemi_Engine;
    return this;
  }
  public DodgeRamBuilderInterface askForColorAndInterior(TerminalPrompterBuilderInterface promptBuilder){
    Paint[] paints = new Paint[]{
      new OctaneRedPaint(),
      new ContusionBluePaint(),
      new PitchBlackPaint(),
      new GoMangoPaint(),
      new GreenGoPaint(),
      new YellowJacketPaint(),
      new MaximumSteelPaint(),
    };
    TerminalPrompterBuilder paintPrompter = new TerminalPrompterBuilder().addType("Paint");
    for(Paint paint: paints){
      paintPrompter.addOption(paint);
    }
    Paint paint = paints[paintPrompter.sort().build().ask()];
    Graphic[] graphics = new Graphic[]{
      new Graphic("Twin Silver Center Stripes"),
      new Graphic("Twin Black Center Stripes")
    };
    int interiorChoice = new TerminalPrompterBuilder()
      .addType("Interior")
      .addOption(new Interior(new Red(), "Nappa Leather Alcantara"))
      .addOption(new Interior(new Black(), "Nappa Leather Alcantara"))
      .addOption(new Interior(new Black(), "SRT Laguna Leather"))
      .addOption(new Interior(new Sepia(), "SRT Laguna Leather"))
      .sort()
      .build()
      .ask();
    return this;
  }
  public DodgeRamBuilderInterface askForOptions(TerminalPrompterBuilderInterface promptBuilder){
    return this;
  }
  public DodgeRamBuilderInterface askForPackages(TerminalPrompterBuilderInterface promptBuilder){
    return this;
  }
  public Automobile build(){
    return new Automobile("Dodge","Challenger","SRT 392",null,null,engine,null);
  }
}
