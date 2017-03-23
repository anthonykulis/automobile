package edu.jalc.automobile.onlinebuilder.components.driveline.economic; 

import edu.jalc.automobile.parts.driveline.*; 
import edu.jalc.automobile.onlinebuilder.components.driveline.EconomicDriveLine;

public class EconomicRWD extends EconomicDriveLine{

   private final FrontDeadAxle frontDeadAxle;
   private final RearDriveAxle rearDriveAxle;
   private final DriveShaft driveShaft;

   private EconomicRWD(){
      super(null,null);
      this.frontDeadAxle=null;
      this.rearDriveAxle=null;
      this.driveShaft=null;
   }
   public EconomicRWD(FrontDeadAxle frontDeadAxle,RearDriveAxle rearDriveAxle,DriveShaft driveShaft,
                      ElectricSteering electricSteering, OpenDifferential openDifferential){
      super(electricSteering,openDifferential);
      this.frontDeadAxle=frontDeadAxle;
      this.rearDriveAxle=rearDriveAxle;
      this.driveShaft=driveShaft;
   }
   
   public FrontDeadAxle getFrontDeadAxle(){
      return this.frontDeadAxle;
   }

   public RearDriveAxle getRearDriveAxle(){
      return this.rearDriveAxle;
   }

   public DriveShaft getDriveShaft(){
      return this.driveShaft;
   }
   public String toString (){
      return "EconomicRWD has :\n" +
                    "\t"+ FrontDeadAxle().toString() +"\n"+
                    "\t"+ rearDriveAxle +"\n"+
                    "\t"+ driveShaft    +"\n"+
                    "\t"+ electricSteering +"\n"+
                    "\t"+ openDifferential;
   }
}