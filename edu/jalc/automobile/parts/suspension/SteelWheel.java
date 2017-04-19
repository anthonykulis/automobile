package edu.jalc.automobile.parts.suspension;

public class SteelWheel extends Wheel {

   
   public SteelWheel(){
      super(18);
   }
   
   private SteelWheel(double size){
      super(size);
   }

   
   public String toString(){
      return getSize() + "in Steel Wheel";
   }
}