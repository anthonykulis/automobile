package edu.jalc.automobile.onlinebuilder.components.driveline.truckdriveline;

import edu.jalc.automobile.parts.driveline.DriveShaft;
import edu.jalc.automobile.parts.driveline.ElectricSteering;
import edu.jalc.automobile.parts.driveline.LockingDifferential;

public class TruckDriveLine{

   private DriveShaft driveShaft = new DriveShaft();
   private ElectricSteering electricSteering = new ElectricSteering();
   private LockingDifferential lockingDifferential = new LockingDifferential();

   public void setDriveShaft(DriveShaft driveShaft){
      this.driveShaft = driveShaft;
   }
   
   public DriveShaft getDriveShaft(){
      return this.driveShaft;
   }

   public void setElectricSteering(ElectricSteering electricSteering){
      this.electricSteering = electricSteering;
   }

   public ElectricSteering getElectricSteering(){
      return this.electricSteering;
   }

   public void setLockingDifferential(LockingDifferential lockingDifferential){
      this.lockingDifferential = lockingDifferential;
   }
   
   public LockingDifferential getLockingDifferential(){
      return this.lockingDifferential;
   }

   public String toString(){
      return "TruckDriveLine";
   }
}