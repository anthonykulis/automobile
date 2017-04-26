package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.wheels;

import edu.jalc.automobile.parts.suspension.Wheel;

public class TruckAlumWheel extends TruckWheel{

   public  TruckAlumWheel(double diameter,double width){
      super(diameter,width);
   }
   public String toString(){
      return super.getDiameter()+ "x" +super.getWidth() +" Alum Wheel";
   }
}
