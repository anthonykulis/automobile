package edu.jalc.automobile.onlinebuilder.components.truckDriveLine;

import edu.jalc.automobile.onlinebuilder.components.truckDriveLine.driveShaft.DriveShaft;
import edu.jalc.automobile.onlinebuilder.components.truckDriveLine.electricSteering.ElectricSteering;
import edu.jalc.automobile.onlinebuilder.components.truckDriveLine.lockingDifferential.LockingDifferential;

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