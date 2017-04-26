package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.axle;
import edu.jalc.automobile.parts.driveline.RearDriveAxle;

public class TruckRearAxle extends RearDriveAxle{

   private double ratio;
   
   private TruckRearAxle(){
      this.ratio=0.0;
   }
   public TruckRearAxle(double ratio){
      this.ratio=ratio;
   }
   public double getRatio(){
      return ratio;
   }
   
   public String toString(){
      return +ratio+" Rear Axle Ratio";
   }
}