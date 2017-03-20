package edu.jalc.automobile.truckDriveLine.heavyDutyRWD;

import edu.jalc.automobile.truckDriveLine.TruckDriveLine;
import edu.jalc.automobile.truckDriveLine.heavyDutyRWD.rearDriveAxle.RearDriveAxle;
import edu.jalc.automobile.truckDriveLine.heavyDutyRWD.frontDeadAxle.FrontDeadAxle;

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