package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.driveline;

import edu.jalc.automobile.onlinebuilder.components.driveline.TruckDriveLine;
import edu.jalc.automobile.parts.driveline.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.drive.*;

public class RamHeavyDutyRWD extends TruckDriveLine{

   private final RearDriveAxle rearDriveAxle;
   private final FrontDeadAxle frontDeadAxle;
   private final TruckDrive truckDrive ;
    
   private RamHeavyDutyRWD(){
      super(null, null, null);
      this.rearDriveAxle = null;
      this.frontDeadAxle = null;
      this.truckDrive=null;
   }
   
   public RamHeavyDutyRWD(TruckDrive truckDrive,RearDriveAxle rearDriveAxle,
                           FrontDeadAxle frontDeadAxle, DriveShaft driveShaft,
                           ElectricSteering electricSteering, LockingDifferential lockingDifferential){
      super(driveShaft, electricSteering, lockingDifferential);
      this.rearDriveAxle = rearDriveAxle;
      this.frontDeadAxle = frontDeadAxle;
      this.truckDrive=truckDrive;
   }
   
   public RearDriveAxle getRearDriveAxle(){
      return this.rearDriveAxle;
   }
   
   public FrontDeadAxle getFrontDeadAxle(){
      return this.frontDeadAxle;
   }
   public TruckDrive getTruckDrive(){
      return this.truckDrive;
   }

   
   public String toString(){
      return "TruckDriveLine has:\n" +
                    "\t"+ truckDrive+ "\n"+
                    "\t"+ rearDriveAxle +"\n"+
                    "\t"+ frontDeadAxle +"\n"+
                    "\t"+ getDriveShaft() +"\n"+
                    "\t"+ getElectricSteering() +"\n"+
                    "\t"+ getLockingDifferential();
   }
}