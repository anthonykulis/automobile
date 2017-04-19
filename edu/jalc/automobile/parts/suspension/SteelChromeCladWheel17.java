package edu.jalc.automobile.parts.suspension;

public class SteelChromeCladWheel17 extends SteelWheel {

   
   public SteelChromeCladWheel17(){
      super(17);
   }
   
   private SteelChromeCladWheel17(double size){
      super(0);
   }

   
   public String toString(){
      return "Steel Chrome Clad Wheel: " + getSize();
   }
}