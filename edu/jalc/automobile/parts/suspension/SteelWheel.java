package edu.jalc.automobile.parts.suspension;

public class SteelWheel extends Wheel {

   
   private SteelWheel(){
      super(0, null);
   }
   
   public SteelWheel(double size, Tire tire){
      super(size, tire);
   }

   
   public String toString(){
      return "\tSteal Wheel with " + this.getTire();
   }
}