package edu.jalc.automobile.parts.suspension;

public class SteelChromeCladWheel extends SteelWheel {


   public SteelChromeCladWheel(double size){
      super(size);
   }

   private SteelChromeCladWheel(){
      super(0);
   }


   public String toString(){
      return "Steel Chrome Clad Wheel: " + getSize();
   }
}
