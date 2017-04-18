package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.builders;

import java.util.*;
import edu.jalc.automobile.Automobile;
import edu.jalc.automobile.common.utils.prompter.TerminalPrompterBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.DodgeRamBuilderInterface;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.axle.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.seating.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.exteriorpaint.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.drive.*;
import edu.jalc.automobile.common.utils.prompter.*;


public class Ram1500LimitedBuilder implements DodgeRamBuilderInterface{

   private TruckDrive truckDrive;
   private TruckRearAxle truckRearAxle;
  /* private TruckBed;
   private Paint;
   private Tire;
   //needs engine and wheel*/
   
  /* Scanner keyboard = new Scanner(System.in);
   
    //determine the drive and cab/bed
 
   System.out.println("Would you like your car drive to be: /n/t enter 1 for 4*4 /n/t       2 for 4*2");
   
   int driveChoice = keyboard.nextInt();
   if (driveChoice==1){
   truckDrive= new ForByFourTruckDrive();
    }else if (driveChoice==1){
   truckDrive= new ForByTwoTruckDrive();
   }*/

   
   
   public DodgeRamBuilderInterface askForPowerTrain(TerminalPrompterBuilderInterface promptBuilder){
    
   TruckRearAxle threePointNintyNineAxle=new  TruckRearAxle(3.92);
   TruckRearAxle threePointFiftyFiveAxle=new  TruckRearAxle(3.55);
   TruckRearAxle fivePointTwentyOneAxle=new  TruckRearAxle(3.21);
   
    promptBuilder.addType("Powertrain");
    promptBuilder.addOption(threePointNintyNineAxle);
    promptBuilder.addOption(threePointFiftyFiveAxle);
    promptBuilder.addOption(fivePointTwentyOneAxle);
    promptBuilder.sort();
    promptBuilder.build().ask();
       
   }
   public DodgeRamBuilderInterface askForColorAndInterior(TerminalPrompterBuilderInterface promptBuilder){
   
   }
   public DodgeRamBuilderInterface askForOptions(TerminalPrompterBuilderInterface promptBuilder){
   
   }
   public DodgeRamBuilderInterface askForPackages(TerminalPrompterBuilderInterface promptBuilder){
   
   }
   
   public Automobile build(){
   }
}