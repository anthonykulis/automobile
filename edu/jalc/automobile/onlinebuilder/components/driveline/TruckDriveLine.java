package edu.jalc.automobile.onlinebuilder.components.driveline;

import edu.jalc.automobile.onlinebuilder.components.driveline.DriveLine;
import edu.jalc.automobile.parts.driveline.DriveShaft;
import edu.jalc.automobile.parts.driveline.ElectricSteering;
import edu.jalc.automobile.parts.driveline.LockingDifferential;

public class TruckDriveLine extends DriveLine{

   private final DriveShaft driveShaft;
   private final ElectricSteering electricSteering;
   private final LockingDifferential lockingDifferential;
   
   private TruckDriveLine(){
      this.driveShaft = null;
      this.electricSteering = null;
      this.lockingDifferential = null;
   }

   public TruckDriveLine(DriveShaft driveShaft, ElectricSteering electricSteering, LockingDifferential lockingDifferential){
      this.driveShaft = driveShaft;
      this.electricSteering = electricSteering;
      this.lockingDifferential = lockingDifferential;
   }
   
   public DriveShaft getDriveShaft(){
      return this.driveShaft;
   }

   public ElectricSteering getElectricSteering(){
      return this.electricSteering;
   }
   
   public LockingDifferential getLockingDifferential(){
      return this.lockingDifferential;
   }

   public String toString(){
      return "TruckDriveLine has:\n" +
                    "\t"+ driveShaft +"\n"+
                    "\t"+ electricSteering +"\n"+
                    "\t"+ lockingDifferential;
   }
}