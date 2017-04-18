package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;
import edu.jalc.automobile.parts.suspension.Tire;

public class OnOffRoad  extends Tire  {
   private String tireDetails;
    
   private  OnOffRoad(){
      super(0,0);
   }
   
   public  OnOffRoad(double height, double width){
      super(height, width);
   }

   
   public String toString(){
      return tireDetails+ " On Off Road Tire";
   }
}