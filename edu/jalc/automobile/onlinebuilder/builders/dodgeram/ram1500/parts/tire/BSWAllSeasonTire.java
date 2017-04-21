package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;

public class BSWAllSeasonTire  extends TruckTire  {
    private String tireDetails;
 
   public  BSWAllSeasonTire(String tireDetails){
      super(tireDetails);
      this.tireDetails=tireDetails;
   } 
   public String toString(){
      return this.tireDetails+" BSW All Season Tire";
   }
}