package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;
import edu.jalc.automobile.parts.suspension.Tire;

public class TruckTire  extends Tire  {
   private String tireDetails;
    
   public  TruckTire(double height, double width,String tireDetails){
      super(height, width);
   }
   
   public String getTireDetails(){
      return this.tireDetails;
   }
   
   public String toString(){
      return +getHeight()+ "x" +getWidth() +getTireDetails()+ " Tire";
   }
}