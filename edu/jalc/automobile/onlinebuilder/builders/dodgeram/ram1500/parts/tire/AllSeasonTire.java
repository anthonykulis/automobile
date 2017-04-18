package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;
import edu.jalc.automobile.parts.suspension.Tire;

public class AllSeasonTire  extends Tire  {
   private String tireDetails;
    
   private  AllSeasonTire(){
      super(0,0);
   }
   
   public  AllSeasonTire(double height, double width){
      super(height, width);
   }

   
   public String toString(){
      return tireDetails+ " All Season Tire";
   }
}