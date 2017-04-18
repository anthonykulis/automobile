package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;


public class OWLOnOffRoad  extends OnOffRoad   {
   private String tireDetails;
    
   private  OWLOnOffRoad(){
      super(0,0);
   }
   
   public  OWLOnOffRoad(double height, double width){
      super(height, width);
   }

   
   public String toString(){
      return tireDetails+ " OWL On Off Road Tire";
   }
}