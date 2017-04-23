package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.wheels;

public class TruckSteelWheel extends TruckWheel{

   public  TruckSteelWheel(double diameter,double width){
      super(diameter,width);
   }

   public String toString(){
      return super.getDiameter()+ "x" +super.getWidth() +"Steel Wheel";
   }
}
