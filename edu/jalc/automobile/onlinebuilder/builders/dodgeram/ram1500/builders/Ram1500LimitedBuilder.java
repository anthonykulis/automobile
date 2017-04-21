package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.builders;

import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.common.utils.prompter.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.cabandbox.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.drive.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.engine.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.axle.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.cabin.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.exteriorpaint.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.seating.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.wheels.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.suspension.*;
import edu.jalc.automobile.onlinebuilder.components.engine.specs.*;
import edu.jalc.automobile.onlinebuilder.components.engine.EngineAssembly;
import edu.jalc.automobile.onlinebuilder.components.engine.economy.standard.StandardEcoEngine;
import edu.jalc.automobile.onlinebuilder.components.body.Body;
import edu.jalc.automobile.onlinebuilder.components.body.truck.*;
import edu.jalc.automobile.onlinebuilder.components.suspension.Suspension;
import edu.jalc.automobile.onlinebuilder.components.suspension.towing.*;
import edu.jalc.automobile.onlinebuilder.components.driveline.DriveLine;
import edu.jalc.automobile.onlinebuilder.components.driveline.truck.HeavyDutyRWD;
import edu.jalc.automobile.onlinebuilder.components.engine.diesel.*;
import edu.jalc.automobile.parts.engine.EcoEngine;
import edu.jalc.automobile.parts.induction.*;
import edu.jalc.automobile.parts.exhaust.*;
import edu.jalc.automobile.parts.body.seat.*;
import edu.jalc.automobile.parts.body.*;
import edu.jalc.automobile.parts.body.Cabin;
import edu.jalc.automobile.parts.suspension.*;
import edu.jalc.automobile.parts.driveline.*;

public class Ram1500LimitedBuilder implements TruckDodgeRamBuilderInterface{

   EngineAssembly engine;
   Body body;
   Suspension suspension;
   DriveLine driveline;
   RamTruckCabAndBed cabAndBox;
   TruckDrive truckDrive;
   TruckRearAxle truckRearAxle;
   TruckTire  tire;
   TruckWheel wheel;
   TruckSeat seat;
   Paint paint; 
   
   public TruckDrive askForTruckDrive(){
      int  truckDriveChoice = 1;
      TerminalPrompterBuilder truckDrivePrompter = TerminalPrompterBuilder.newBuilder();
      try{
         truckDriveChoice = truckDrivePrompter.addType("Drive")
            .addOption(new FourByTwoTruckDrive())
            .addOption(new FourByFourTruckDrive())
            .sort()
            .build()
            .ask();//use if 4*4 create 4*4driveline...
      }
      catch(Exception e){System.err.println(e);}
      truckDrive=(TruckDrive)truckDrivePrompter.getOptions().get(truckDriveChoice - 1);
      return this.truckDrive;
   }
   
   public RamTruckCabAndBed  askForTruckCabAndBed(){
      int cabAndBedChoice = 1;
      TerminalPrompterBuilder cabAndBedPrompter = TerminalPrompterBuilder.newBuilder();
      try{
         cabAndBedChoice= cabAndBedPrompter.addType("Cab And Box")
            .addOption(new  RamTruckCabAndBed(5.7,"Crew"))
            .addOption(new  RamTruckCabAndBed(6.4,"Crew"))
            .sort()
            .build()
            .ask();
      }
      catch(Exception e){System.err.println(e);}
     cabAndBox= (RamTruckCabAndBed)cabAndBedPrompter.getOptions().get(cabAndBedChoice - 1);
     return this.cabAndBox;
     
   }
   
   
   public DodgeRamBuilderInterface askForPowerTrain(){
   
        //engine choice
      TerminalPrompterBuilder promptBuilder = TerminalPrompterBuilder.newBuilder();
      
      EcoEngine ecoDieselEngine= new EcoDieselEngine( 182,new HorsePower(240,3600),new Torque(420,2000),6);
      EcoEngine hemiVVTEngine = new HemiVVTEngine(345,new HorsePower(395,5600 ),new Torque(410,3950),8);
      
      EngineAssembly eco_DieselEngine = new StandardEcoEngine(ecoDieselEngine, new EconomyExhaust() , new NaturallyAspiratedInduction());
      EngineAssembly hemi_VVTEngine  = new  StandardEcoEngine(hemiVVTEngine,new EconomyExhaust(),new NaturallyAspiratedInduction());
      
      promptBuilder.addType("Engine ");
      promptBuilder.addOption(eco_DieselEngine);
      promptBuilder.addOption(hemi_VVTEngine);
      promptBuilder.sort();
      int engineChoice = 2; 
      try{
         engineChoice = promptBuilder.build().ask();
      }
      catch(Exception e){}
      engine = (EngineAssembly)promptBuilder.getOptions().get(engineChoice - 1);
      
       //axle choice
      int axleChoice = 1;
      TerminalPrompterBuilder axlePrompter = TerminalPrompterBuilder.newBuilder();
      try{
         axleChoice= axlePrompter.addType("Axle")
            .addOption(new TruckRearAxle(3.21))
            .addOption(new TruckRearAxle(3.55))
            .addOption(new TruckRearAxle(3.92))
            .sort()
            .build()
            .ask();
      }
      catch(Exception e){System.err.println(e);}
      truckRearAxle =(TruckRearAxle)axlePrompter.getOptions().get(axleChoice - 1);
   
      return  this;
   }
   
   public DodgeRamBuilderInterface askForColorAndInterior(){
     
   //exterior paint choice
      TerminalPrompterBuilder paintPrompter = TerminalPrompterBuilder.newBuilder();
      int choice =1 ;
      paintPrompter.addType("Paint")
         .addOption(new BrightWhiteClearCoat())
         .addOption(new BrilliantBlackCrystalPearl())
         .addOption(new MaximumSteelMetallicClearCoat())
         .sort();
      
      try{
         choice = paintPrompter.build().ask();
      }
      catch(Exception e){System.err.println(e);}
      
      paint=(Paint)paintPrompter.getOptions().get(choice - 1);
      
   //Seat choice
      TerminalPrompterBuilder seatPrompter = TerminalPrompterBuilder.newBuilder();
      int seatChoice = 1;
      try{
         seatChoice = seatPrompter.addType("Seats")
            .addOption(new LimitedLeatherBucketSeats())
            .build()
            .ask();
      }
      catch(Exception e){System.err.println(e);}
      seat= (TruckSeat)seatPrompter.getOptions().get(seatChoice - 1);
      
      this.body =  new CrewCab(
         new Quarterpanels(paint,null),
         new EngineCompartment(new Hood(paint, null)),
         new TruckCabin(seat),
         cabAndBox);
      return this;
   }
   
   public DodgeRamBuilderInterface askForOptions(){
   
      try{
         TerminalPrompterBuilder wheelPrompter = TerminalPrompterBuilder.newBuilder();
         int wheelChoice = wheelPrompter.addType("Wheels")
            .addOption(new TruckAlumWheel(20.0,9.0))
            .sort()
            .build()
            .ask();
         wheel = (TruckWheel)wheelPrompter.getOptions().get(wheelChoice - 1);
      } 
      catch(Exception e){System.err.println(e);}
   
      try{      
         TerminalPrompterBuilder tirePrompter = TerminalPrompterBuilder.newBuilder();
         int tireChoice = tirePrompter.addType("Tires")
            .addOption(new BSWAllSeasonTire("P275/60R20"))
            .build()
            .ask();
         tire = (TruckTire)tirePrompter.getOptions().get(tireChoice - 1);
      }
      catch(Exception e){System.err.println(e);}
      //was not able to find the height for shock and spring!!
      suspension = new  TruckSuspension( new StockShock(0),new StockSpring(0), tire,wheel);
      
      return this;
   }
   public DodgeRamBuilderInterface askForPackages(){
      return this;
   }
   public Automobile build(){
    //use truck drive line 
      DriveLine driveLine = new HeavyDutyRWD(
         truckRearAxle,
         new FrontDeadAxle(),
         new DriveShaft(),
         new ElectricSteering(), 
         new LockingDifferential());
      return new Automobile("Ram ","1500 ","Limited ",body,driveLine,engine,suspension);
   }
   
   public static void main(String... args){
      
      Automobile ram1500limited = new Ram1500LimitedBuilder()
         .askForPowerTrain()
         .askForColorAndInterior()
         .askForOptions()
         .askForPackages()
         .build();
          
      System.out.println(ram1500limited);
   }

}
