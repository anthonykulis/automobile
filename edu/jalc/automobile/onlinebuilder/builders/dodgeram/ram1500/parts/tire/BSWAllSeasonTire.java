package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;


public class BSWAllSeasonTire  extends AllSeasonTire  {
   private String tireDetails;
    
   private  BSWAllSeasonTire(){
      super(0,0);
   }
   
   public  BSWAllSeasonTire(double height, double width){
      super(height, width);
   }

   
   public String toString(){
      return tireDetails+ " BSW All Season Tire";
   }
}