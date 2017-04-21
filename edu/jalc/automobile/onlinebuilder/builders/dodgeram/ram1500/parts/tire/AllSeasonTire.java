package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;

public class AllSeasonTire  extends TruckTire  {
    
   public  AllSeasonTire(String tireDetails){
      super(tireDetails);
   }
   public String toString(){
      return getTireDetails()+" All Season Tire";
   }
}