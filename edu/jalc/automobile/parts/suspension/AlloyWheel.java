package edu.jalc.automobile.parts.suspension;

public class AlloyWheel extends Wheel {

   private AlloyWheel(){
      super(0);
   }
   
   public AlloyWheel(double size, Tire tire){
      super(size);
   }
   

   public String toString(){
      return "Alloy Wheel";
   }
}