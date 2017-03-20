package edu.jalc.automobile.onlinebuilder.components.truckDriveLine.superDutyFourWheelDrive; 

import edu.jalc.automobile.onlinebuilder.components.truckDriveLine.TruckDriveLine;
import edu.jalc.automobile.onlinebuilder.components.truckDriveLine.superDutyFourWheelDrive.fourWheelDriveAxle.FourWheelDriveAxle;

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