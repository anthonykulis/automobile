package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.tire;

public class OWLOnOffRoad  extends TruckTire {
    
   public  OWLOnOffRoad(String tireDetails){
      super(tireDetails);
   }
   public String toString(){
      return getTireDetails()+ " OWL On Off Road Tire";
   }
}