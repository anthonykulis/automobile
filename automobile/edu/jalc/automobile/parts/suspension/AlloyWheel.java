package edu.jalc.automobile.parts.suspension;

public class AlloyWheel extends Wheel {

   private AlloyWheel(){
      super(0, null);
   }
   
   public AlloyWheel(double size, Tire tire){
      super(size, tire);
   }
   

   public String toString(){
      return "Alloy Wheel with " + this.getTire();
   }
}