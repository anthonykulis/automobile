package edu.jalc.automobile.parts;

public class AllTerrainTire extends Tire{

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
   
   public String toString(){
      return "All Terrain Tire";
   }
}