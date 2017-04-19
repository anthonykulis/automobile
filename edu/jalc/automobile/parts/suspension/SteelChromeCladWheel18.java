package edu.jalc.automobile.parts.suspension;

public class SteelChromeCladWheel18 extends SteelWheel {

   
   public SteelChromeCladWheel18(){
      super(18);
   }
   
   private SteelChromeCladWheel18(double size){
      super(0);
   }

   
   public String toString(){
      return "Steel Chrome Clad Wheel: " + getSize();
   }
}