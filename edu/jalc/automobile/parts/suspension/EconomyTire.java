package edu.jalc.automobile.parts.suspension;

public class EconomyTire extends Tire {

   private EconomyTire(){
      super(0, 0);
   }

   public EconomyTire(double height, double width){
      super(height, width);
   }

   public String toString(){
      return "Economy Tire";
   }
}