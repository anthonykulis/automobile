package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;

public class OWLAllSeasonTire  extends TruckTire  {
   
   public  OWLAllSeasonTire(double height, double width,String tireDetails){
      super(height, width,tireDetails);
   }   
   public String toString(){
      return +getHeight()+ "x" +getWidth() +getTireDetails()+" OWL All Season Tire";
   }
}