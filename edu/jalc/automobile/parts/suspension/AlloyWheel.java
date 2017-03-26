package edu.jalc.automobile.parts.suspension;

public class AlloyWheel extends Wheel {

   private AlloyWheel(){
      super(0, null);
   }
   
   public AlloyWheel(double size, Tire tire){
      super(seize, tire);
   }
   

   public String toString(){
      return "Alloy Wheel with " + tire.toString();
   }
}