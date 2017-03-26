package edu.jalc.automobile.parts.suspension;

public class SteelWheel extends Wheel {

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
   
   public double getSize(){
      return size;
   }
   
   public Tire getTire(){
      return tire;
   }
   
   public String toString(){
      return "\tSteal Wheel with " + tire.toString();
   }
}