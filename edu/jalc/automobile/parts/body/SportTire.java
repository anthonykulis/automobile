package edu.jalc.automobile.parts.body;

import edu.jalc.automobile.parts.suspension.Tire;

public class SportTire extends Tire {

   private double height;
   private double width;

   private SportTire(){
      super(0,0);
   }

   public SportTire(double height, double width){
      super(height,width);
   }

   public double getHeight(){
      return height;
   }

   public double getWidth(){
      return width;
   }

   public String toString(){
      return "Sport Tire";
   }
}
