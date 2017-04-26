package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.wheels;

public class TruckAliminumWheel extends TruckWheel{

   public  TruckAliminumWheel(double diameter,double width){
      super(diameter,width);
   }

   public String toString(){
      return super.getDiameter()+ "x" +super.getWidth() +" AliminumWheel";
   }
}
