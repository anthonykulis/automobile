package edu.jalc.automobile.parts.suspension;

public class AllTerrainTire extends Tire {


   public AllTerrainTire(){
      super(0,0);
   }

   private AllTerrainTire(double height, double width){
      super(height, width);
   }

   
   public String toString(){
      return "All Terrain Tire: On/Off Road";
   }
}
