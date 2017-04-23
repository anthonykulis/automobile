package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;
import edu.jalc.automobile.parts.suspension.Tire;

public class OnOffRoad  extends TruckTire  {
   public  OnOffRoad(String tireDetails){
      super(tireDetails);
   } 
   public String toString(){
      return super.getTireDetails()+" On Off Road Tire";
   }
}