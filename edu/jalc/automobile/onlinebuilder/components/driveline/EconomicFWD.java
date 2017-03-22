package edu.jalc.automobile.onlinebuilder.components.driveline; 

import edu.jalc.automobile.parts.driveline.FrontDriveAxle;
import edu.jalc.automobile.parts.driveline.RearDeadAxle;

public class EconomicFWD extends EconomicDriveLine {

   private FrontDriveAxle frontDriveAxle;
   private RearDeadAxle rearDeadAxle;

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