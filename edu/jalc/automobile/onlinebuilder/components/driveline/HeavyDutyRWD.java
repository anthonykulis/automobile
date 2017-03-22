package edu.jalc.automobile.onlinebuilder.components.driveline;

import edu.jalc.automobile.onlinebuilder.components.driveline.TruckDriveLine;
import edu.jalc.automobile.parts.driveline.RearDriveAxle;
import edu.jalc.automobile.parts.driveline.FrontDeadAxle;

public class HeavyDutyRWD{

   private final RearDriveAxle rearAxle;
   private final FrontDeadAxle deadAxle;
   
   private HeavyDutyRWD(){
      this.rearAxle = null;
      this.deadAxle = null;
   }
   
   public HeavyDutyRWD(RearDriveAxle rearAxle, FrontDeadAxle deadAxle){
      this.rearAxle = rearAxle;
      this.deadAxle = deadAxle;
   }
   
   public RearDriveAxle getRearAxle(){
      return this.rearAxle;
   }
   
   public FrontDeadAxle getDeadAxle(){
      return this.deadAxle;
   }
   
   public String toString(){
      return "HeavyDutyRearWheelDrive";
   }
}