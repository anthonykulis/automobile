package edu.jalc.automobile.onlinebuilder.builders.dodgeram.ram1500.parts.wheels;

import edu.jalc.automobile.parts.suspension.StockWheel;

public class TruckAliminumWheel extends StockWheel{

  private double diameter, width;

   public TruckAliminumWheel(double diameter,double width){
      super(0.0);
      this.diameter=diameter;
      this.width=width;
   }

   public String toString(){
      return +diameter+ "x" +width +" AliminumWheel";
   }
}
