package edu.jalc.automobile.parts.suspension;

public class SteelWheel extends Wheel {


   public SteelWheel(double size){
      super(size);
   }

   private SteelWheel(){
      super(0);
   }


   public String toString(){
      return getSize() + "in Steel Wheel";
   }
}
