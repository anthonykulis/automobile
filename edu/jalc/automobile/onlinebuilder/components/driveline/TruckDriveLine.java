package edu.jalc.automobile.onlinebuilder.components.driveline;

import edu.jalc.automobile.parts.driveline.DriveShaft;
import edu.jalc.automobile.parts.driveline.ElectricSteering;
import edu.jalc.automobile.parts.driveline.LockingDifferential;

public class TruckDriveLine{

   private DriveShaft driveShaft = new DriveShaft();
   private ElectricSteering electricSteering = new ElectricSteering();
   private LockingDifferential lockingDifferential = new LockingDifferential();

   private TruckDriveLine(){
   this.driveShaft=null;
   this.electricSteering =null;
   this.lockingDifferential=null;
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
      return "TruckDriveLine has :\n" +
              "\t"+ driveShaft +"\n"+
              "\t"+ electricSteering+"\n"+
              "\t"+ lockingDifferential ;

   }
}