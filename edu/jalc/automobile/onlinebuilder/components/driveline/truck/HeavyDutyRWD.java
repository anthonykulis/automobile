package edu.jalc.automobile.onlinebuilder.components.driveline.truck;

import edu.jalc.automobile.onlinebuilder.components.driveline.TruckDriveLine;
import edu.jalc.automobile.parts.driveline.RearDriveAxle;
import edu.jalc.automobile.parts.driveline.FrontDeadAxle;

public class HeavyDutyRWD extends TruckDriveLine{

   private final RearDriveAxle rearDriveAxle;
   private final FrontDeadAxle frontDeadAxle;
   
   private HeavyDutyRWD(){
      super(null, null, null);
      this.rearDriveAxle = null;
      this.frontDeadAxle = null;
   }
   
   public HeavyDutyRWD(RearDriveAxle rearDriveAxle, FrontDeadAxle frontDeadAxle){
      super(null, null, null);
      this.rearDriveAxle = rearDriveAxle;
      this.frontDeadAxle = frontDeadAxle;
   }
   
   public RearDriveAxle getRearDriveAxle(){
      return this.rearDriveAxle;
   }
   
   public FrontDeadAxle getFrontDeadAxle(){
      return this.frontDeadAxle;
   }
   
   public String toString(){
      return "TruckDriveLine has:\n" +
                    "\t"+ rearDriveAxle +"\n"+
                    "\t"+ frontDeadAxle;
   }
}