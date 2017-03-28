package edu.jalc.automobile.parts;

public class SteelWheel extends Wheel{

   private double size;
   private AllTerrainTire tire;
   
   private SteelWheel(){
      this.size = 0;
      this.tire = null;
      
   }
   
   public SteelWheel(double size, AllTerrainTire tire){
      this.size = size;
      this.tire = tire;
   }
   
   public double getSize(){
      return size;
   }
   
   public Tire getTire(){
      return tire;
   }
   
   public String toString(){
      return "Steal Wheel with " + tire.toString();
   }
}