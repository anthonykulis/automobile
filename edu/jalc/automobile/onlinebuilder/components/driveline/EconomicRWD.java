package edu.jalc.automobile.onlinebuilder.components.driveline; 
import edu.jalc.automobile.parts.driveline.FrontDeadAxle;
import edu.jalc.automobile.parts.driveline.RearDriveAxle;
import edu.jalc.automobile.parts.driveline.DriveShaft ; 

public class EconomicRWD{

   private FrontDeadAxle frontDeadAxle;
   private RearDriveAxle rearDriveAxle;
   private DriveShaft driveShaft;

   private EconomicRWD(){
      this.frontDeadAxle=null;
      this.rearDriveAxle=null;
      this.driveShaft=null;
   }

   public FrontDeadAxle getFrontWheelDeadAxle(){
      return this.frontDeadAxle;
   }

   public RearDriveAxle getRearDriveAxle(){
      return this.rearDriveAxle;
   }

   public DriveShaft getDriveShaft(){
      return this.driveShaft;
   }
   public String toString (){
      return "EconomicRWD has :\n" +
                    "\t"+ frontDeadAxle +"\n"+
                    "\t"+ rearDriveAxle +"\n"+
                    "\t"+ driveShaft+"\n";
   }
}