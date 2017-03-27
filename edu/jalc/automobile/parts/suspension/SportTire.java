package edu.jalc.automobile.parts.suspension;

public class SportTire extends Tire{


   private SportTire(){
      super(0,0);
   }

   public SportTire(double height, double width){
      super(height,width);
   }

   public String toString(){
      return "Sport Tire";
   }
}
