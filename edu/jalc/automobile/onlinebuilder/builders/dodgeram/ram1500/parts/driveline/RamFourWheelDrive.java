package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.driveline;

import edu.jalc.automobile.onlinebuilder.components.driveline.TruckDriveLine;
import edu.jalc.automobile.parts.driveline.*;
import edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.drive.*;

public class RamFourWheelDrive extends TruckDriveLine{

   private final FourWheelDriveAxle fwdAxle;
   private final TruckDrive truckDrive;
   private final RearDriveAxle rearDriveAxle;
   
   private RamFourWheelDrive(){
      super(null, null, null);
      this.fwdAxle = null;
      this.truckDrive=null;
      this.rearDriveAxle=null;
   }

   public RamFourWheelDrive(TruckDrive truckDrive,RearDriveAxle rearDriveAxle,
                            FourWheelDriveAxle fwdAxle, DriveShaft driveShaft,
                            ElectricSteering electricSteering, LockingDifferential lockingDifferential){
      super(driveShaft, electricSteering, lockingDifferential);
      this.fwdAxle = fwdAxle;
      this.truckDrive=truckDrive;
      this.rearDriveAxle =rearDriveAxle;
   }
   
   public FourWheelDriveAxle getFWDAxle(){
      return this.fwdAxle;
   }
   public TruckDrive getTruckDrive(){
      return this.truckDrive;
   }
   public RearDriveAxle getRearDriveAxle(){
   return this.rearDriveAxle;
   }
   public String toString(){
      return "SuperDutyFourWheelDrive has:\n" +
                    "\t"+ truckDrive+ "\n"+
                    "\t"+ rearDriveAxle +"\n"+
                    "\t"+ fwdAxle +"\n"+
                    "\t"+ getDriveShaft() +"\n"+
                    "\t"+ getElectricSteering() +"\n"+
                    "\t"+ getLockingDifferential();
   }
}