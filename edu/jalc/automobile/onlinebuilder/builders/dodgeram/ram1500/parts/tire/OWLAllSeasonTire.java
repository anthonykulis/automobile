package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;


public class OWLAllSeasonTire  extends AllSeasonTire  {
   private String tireDetails;
    
   private  OWLAllSeasonTire(){
      super(0,0);
   }
   
   public  OWLAllSeasonTire(double height, double width){
      super(height, width);
   }

   
   public String toString(){
      return tireDetails+ " OWL All Season Tire";
   }
}