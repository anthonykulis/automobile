package edu.jalc.automobile.parts.suspension;

public class SteelWheel extends Wheel {

   
   private SteelWheel(){
      super(0);
   }
   
   public SteelWheel(double size){
      super(size);
   }

   
   public String toString(){
      return getSize() + "in Steal Wheel";
   }
}