package edu.jalc.automobile.onlinebuilder.components.driveline; 

import edu.jalc.automobile.parts.driveline.FrontDriveAxle;
import edu.jalc.automobile.parts.driveline.RearDeadAxle;
import edu.jalc.automobile.parts.driveline.DriveShaft ; 

public class EconomicFWD extends EconomicDriveLine {

   private FrontDriveAxle frontDriveAxle;
   private RearDeadAxle rearDeadAxle;

   private EconomicFWD(){
      this.frontDriveAxle=null;
      this.rearDeadAxle=null;
   }

   public FrontDriveAxle getFrontWheelDeadAxle(){
      return this.frontDriveAxle;
   }

   public RearDeadAxle getRearDeadAxle(){
      return this.rearDeadAxle;
   }
   public String toString (){
      return "EconomicRWD has :\n" +
                    "\t"+ frontDriveAxle +"\n"+
                    "\t"+ rearDeadAxle;
                    
   }
}