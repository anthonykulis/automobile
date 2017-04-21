package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;

public class BSWAllSeasonTire  extends TruckTire  {
   public  BSWAllSeasonTire(String tireDetails){
      super(tireDetails);
   } 
   public String toString(){
      return super.getTireDetails()+ " BSW All Season Tire";
   }
}