package edu.jalc.automobile.onlinebuilder.builders.dodgeram.challenger;

public class DodgeChallengerSXTBuilder implements DodgeRamBuilderInterface{
   
   private EngineAssembly engineAssembly;
   
   DodgeRamBuilderInterface askForPowerTrain(TerminalPrompterBuilderInterface promptBuilder){
      Engine engine = new VVT24ValveSportEngine(3.6, new HorsePower(303,3000), new Torque(300,2000), 6);
      EngineAssembly engineAssembly = new NaturallyAspiratedSportEngine(engine, new PerformanceExhaust(), new NaturallyAspiratedInduction());
      try{
         promptBuilder.addtype("Powertrain")
         .addOption(engineAssembly)
         .build()
         .tell("Your SXT Comes With A " + engineAssembly);
      }catch(Exception e){}
      this.engineAssembly = engineAssembly;
      return this;
   }

   DodgeRamBuilderInterface askForColorAndInterior(){
      Color color = new YellowJacket()//, new RedlineTricoat, new PitchBlack, new MaximumSteel, new TorRed, new ContusionBlue;
         TerminalPrompterBuilder promptBuilder = TerminalPrompterBuilder.newBuilder();
         promptBuilder.addtype("Color");
         promptBuilder.addOption(new YellowJacket());
         promptBuilder.sort();
         Terminal prompter prompter = promptBuilder.build();
         int choice = prompter.ask();
         Color color = (Color)promptBuilder.getOptions().get(choice - 1);
      this.color = color;
      return this;
   }


	DodgeRamBuilderInterface askForOptions(TerminalPrompterBuilderInterface promptBuilder){
        AluminumWheel aluminumWheel = new AluminumWheel(18);
        AllSeasonPerformanceTire allSeasonPerformanceTire = new AllSeasonPerformanceTire();
        promptBuilder.addType("Tire");
            //promptBuilder.addtype("Aluminum Wheel")
            //promptBuilder.addtype("All Season Performance Tire")
         .addOption(aluminumWheel)
         .addOption(allSeasonPerformanceTire)
         .build()
         .tell("Your SXT Comes With An " + aluminumWheel);
         .tell("Your SXT Comes With An " + allSeasonPerformanceTire);
      this.aluminumWheel = aluminumWheel;
      this.allSeasonPerformanceTire = allSeasonPerformanceTire;
      return this;
   }

	DodgeRamBuilderInterface askForPackages(TerminalPrompterBuilderInterface promptBuilder){
      Engine engine = new VVT24ValveSportEngine(3.6, new HorsePower(303,3000), new Torque(300,2000), 6);
            promptBuilder.addtype("Powertrain")
         .addOption(engineAssembly)
         .build()
         .tell("Your SXT Comes With A " + engineAssembly);
      this.engineAssembly = engineAssembly;
      return this;
      return this;
   }

	Automobile build(){
      return new Automobile("Dodge","Challenger","SXT",null,null,this.engineAssembly,null);
   }

}