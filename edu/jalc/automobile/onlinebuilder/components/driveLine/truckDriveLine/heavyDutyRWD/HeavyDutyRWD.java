package edu.jalc.automobile.onlinebuilder.components.driveline.truckdriveline.heavydutyrwd;

import edu.jalc.automobile.onlinebuilder.components.driveline.truckdriveline.TruckDriveLine;
import edu.jalc.automobile.parts.reardriveaxle.RearDriveAxle;
import edu.jalc.automobile.parts.frontdeadaxle.FrontDeadAxle;

public class HeavyDutyRWD extends TruckDriveLine{

   RearDriveAxle rearAxle = new RearDriveAxle();
   FrontDeadAxle deadAxle = new FrontDeadAxle();

   public void setRearAxle(RearDriveAxle rearAxle){
      this.rearAxle = rearAxle;
   }
   
   public RearDriveAxle getRearAxle(){
      return this.rearAxle;
   }
   
   public void setDeadAxle(FrontDeadAxle deadAxle){
      this.deadAxle = deadAxle;
   }
   
   public FrontDeadAxle getDeadAxle(){
      return this.deadAxle;
   }
   
   public String toString(){
      return "HeavyDutyRearWheelDrive";
   }
}