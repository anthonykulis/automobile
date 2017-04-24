package edu.jalc.automobile.parts.suspension;

public class AllTerrainTire extends Tire {


   private AllTerrainTire(){
      super(0,0);
   }

   public AllTerrainTire(double height, double width){
      super(height, width);
   }


   public String toString(){
      return "All Terrain Tire: On/Off Road " + height + " " + width;
   }
}
