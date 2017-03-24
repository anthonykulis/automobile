package edu.jalc.automobile.onlinebuilder.components.driveline.truck; 

import edu.jalc.automobile.onlinebuilder.components.driveline.TruckDriveLine;
import edu.jalc.automobile.parts.driveline.*;

public class SuperDutyFourWheelDrive extends TruckDriveLine{

   private final FourWheelDriveAxle fwdAxle;
   
   private SuperDutyFourWheelDrive(){
      super(null, null, null);
      this.fwdAxle = null;
   }

   public SuperDutyFourWheelDrive(FourWheelDriveAxle fwdAxle, DriveShaft driveShaft, ElectricSteering electricSteering, LockingDifferential lockingDifferential){
      super(driveShaft, electricSteering, lockingDifferential);
      this.fwdAxle = fwdAxle;
   }
   
   public FourWheelDriveAxle getFWDAxle(){
      return this.fwdAxle;
   }
   
   public String toString(){
      return "SuperDutyFourWheelDrive has:\n" +
                    "\t"+ fwdAxle +
                    "\t"+ getDriveShaft() +"\n"+
                    "\t"+ getElectricSteering() +"\n"+
                    "\t"+ getLockingDifferential();
   }
}