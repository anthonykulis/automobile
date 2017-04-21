package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;
import edu.jalc.automobile.parts.suspension.Tire;

public class TruckTire  extends Tire  {
   private String tireDetails;
    
   public  TruckTire(String tireDetails){
      super(0,0);
      this.tireDetails=tireDetails;

   }
   public String getTireDetails(){
      return this.tireDetails;
   }
   public String toString(){
      return this.tireDetails+" Tire";
   }
}