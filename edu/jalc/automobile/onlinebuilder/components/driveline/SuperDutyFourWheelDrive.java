package edu.jalc.automobile.onlinebuilder.components.driveline; 

import edu.jalc.automobile.onlinebuilder.components.driveline.TruckDriveLine;
import edu.jalc.automobile.parts.driveline.FourWheelDriveAxle;

public class SuperDutyFourWheelDrive{

   private final FourWheelDriveAxle fwdAxle;
   
   public SuperDutyFourWheelDrive(FourWheelDriveAxle fwdAxle){
      this.fwdAxle = fwdAxle;
   }
   
   public FourWheelDriveAxle getFWDAxle(){
      return this.fwdAxle;
   }
   
   public String toString(){
      return "SuperDutyFourWheelDrive has: /n /t" + fwdAxle.toString();
   }
}