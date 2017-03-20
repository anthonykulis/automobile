package edu.jalc.automobile.onlinebuilder.components.driveline.truckdriveline;

import edu.jalc.automobile.parts.driveshaft.DriveShaft;
import edu.jalc.automobile.parts.electricsteering.ElectricSteering;
import edu.jalc.automobile.parts.lockingdifferential.LockingDifferential;

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