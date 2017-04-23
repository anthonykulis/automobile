package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;

public class OWLAllSeasonTire  extends TruckTire  {
   public  OWLAllSeasonTire(String tireDetails){
      super(tireDetails);
   }   
   public String toString(){
      return  super.getTireDetails()+ " OWL All Season Tire";
   }
}