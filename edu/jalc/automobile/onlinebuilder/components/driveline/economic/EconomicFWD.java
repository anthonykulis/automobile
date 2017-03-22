package edu.jalc.automobile.onlinebuilder.components.driveline.economic; 

import edu.jalc.automobile.parts.driveline.FrontDriveAxle;
import edu.jalc.automobile.parts.driveline.RearDeadAxle;
import edu.jalc.automobile.onlinebuilder.components.driveline.EconomicDriveLine;

public class EconomicFWD extends EconomicDriveLine {

   private final FrontDriveAxle frontDriveAxle;
   private final RearDeadAxle rearDeadAxle;

   private EconomicFWD(){
      super(null,null);
      this.frontDriveAxle=null;
      this.rearDeadAxle=null;
   }
    public EconomicFWD(FrontDriveAxle frontDriveAxle,RearDeadAxle rearDeadAxle){
      super(null,null);
      this.frontDriveAxle=frontDriveAxle;
      this.rearDeadAxle=rearDeadAxle;
   }

   public FrontDriveAxle getFrontDriveAxle(){
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