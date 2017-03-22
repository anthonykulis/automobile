package edu.jalc.automobile.parts;

public class SportTire extends Tire{

   private double height;
   private double width;

   private AllTerrainTire(){
      this.height = 0;
      this.width = 0;
   }

   public AllTerrainTire(double height, double width){
      this.height = height;
      this.width = width;
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
