package edu.jalc.automobile.parts.suspension;

public class AllTerrainTire extends Tire {

   
   private AllTerrainTire(){
      super(0,0);
   }
   
   public AllTerrainTire(double height, double width){
      super(height, width);
   }

   
   public String toString(){
      return getHeight() + "in tall and "+ getWidth() +"in wide size All Terrain Tire";
   }
}