package edu.jalc.automobile.parts;

public class SteelWheel extends Wheel{

   private double size;
   private Tire tire;
   
   private SteelWheel(){
      this.size = 0;
      this.tire = null;
      
   }
   
   public SteelWheel(double size, Tire tire){
      this.size = size;
      this.tire = tire;
   }
   
   public String toString(){
      return "Steal Wheel with " + tire.toString();
   }
}