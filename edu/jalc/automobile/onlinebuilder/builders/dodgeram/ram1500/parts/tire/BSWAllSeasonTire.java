package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;

public class BSWAllSeasonTire  extends TruckTire  {
   private String tireDetails;
   
   public  BSWAllSeasonTire(double height, double width,String tireDetails){
      super(height, width,tireDetails);
   } 
   public String toString(){
      return +getHeight()+ "x" +getWidth() +getTireDetails()+" BSW All Season Tire";
   }
}