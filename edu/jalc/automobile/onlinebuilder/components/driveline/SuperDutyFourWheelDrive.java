package edu.jalc.automobile.onlinebuilder.components.driveline; 

import edu.jalc.automobile.onlinebuilder.components.driveline.TruckDriveLine;
import edu.jalc.automobile.parts.driveline.FourWheelDriveAxle;

public class SuperDutyFourWheelDrive extends TruckDriveLine{

   private final FourWheelDriveAxle fwdAxle;
   
   private SuperDutyFourWheelDrive(){
      super(null, null, null);
      this.fwdAxle = null;
   }

   public SuperDutyFourWheelDrive(FourWheelDriveAxle fwdAxle){
      super(null, null, null);
      this.fwdAxle = fwdAxle;
   }
   
   public FourWheelDriveAxle getFWDAxle(){
      return this.fwdAxle;
   }
   
   public String toString(){
      return "SuperDutyFourWheelDrive has:\n" +
                    "\t"+ fwdAxle;
   }
}