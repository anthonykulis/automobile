package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.wheels;

import edu.jalc.automobile.parts.suspension.Wheel;

public class TruckWheel extends Wheel{
   private double diameter, width;

   public TruckWheel(double diameter,double width){
      super(0.0);
      this.diameter=diameter;
      this.width=width;
   }
   public double getDiameter(){
   return this.diameter;
   }
    public double getWidth(){
   return this.width;
   }
   public String toString(){
      return +this.diameter+ "x" +this.width +"  Wheel";
   }
}
