package edu.jalc.automobile.onlinebuilder.components.driveline; 

import edu.jalc.automobile.onlinebuilder.components.driveline.TruckDriveLine;
import edu.jalc.automobile.parts.driveline.FourWheelDriveAxle;

public class SuperDutyFourWheelDrive extends TruckDriveLine{

   FourWheelDriveAxle fwdAxle = new FourWheelDriveAxle();

   public void setFWDAxle(FourWheelDriveAxle fwdAxle){
      this.fwdAxle = fwdAxle;
   }
   
   public FourWheelDriveAxle getFWDAxle(){
      return this.fwdAxle;
   }
   
   public String toString(){
      return "SuperDutyFourWheelDrive";
   }
}