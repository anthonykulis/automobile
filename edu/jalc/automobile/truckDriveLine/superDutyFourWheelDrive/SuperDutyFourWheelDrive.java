package edu.jalc.automobile.truckDriveLine.superDutyFourWheelDrive; 

import edu.jalc.automobile.truckDriveLine.TruckDriveLine;
import edu.jalc.automobile.truckDriveLine.superDutyFourWheelDrive.fourWheelDriveAxle.FourWheelDriveAxle;

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