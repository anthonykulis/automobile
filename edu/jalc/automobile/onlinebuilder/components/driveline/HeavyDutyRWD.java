package edu.jalc.automobile.onlinebuilder.components.driveline;

import edu.jalc.automobile.onlinebuilder.components.driveline.TruckDriveLine;
import edu.jalc.automobile.parts.driveline.RearDriveAxle;
import edu.jalc.automobile.parts.driveline.FrontDeadAxle;

public class HeavyDutyRWD extends TruckDriveLine{

   RearDriveAxle rearAxle = new RearDriveAxle();
   FrontDeadAxle deadAxle = new FrontDeadAxle();
   
   private HeavyDutyRWD(){
      this.rearAxle=null;
      this.deadAxle=null;
   }
   
   public RearDriveAxle getRearAxle(){
      return this.rearAxle;
   }
      
   public FrontDeadAxle getDeadAxle(){
      return this.deadAxle;
   }
   
   public String toString(){
      return "HeavyDutyRearWheelDrive has :\n" +
              "\t"+ rearAxle +"\n"+
              "\t"+ deadAxle;
   }
}