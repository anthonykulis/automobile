package edu.jalc.automobile.parts.suspension;

public class SteelArgentWheel extends SteelWheel {

   
   public SteelArgentWheel(){
      super(18);
   }
   
   private SteelArgentWheel(double size){
      super(0);
   }

   
   public String toString(){
      return "Steel Argent Wheel: " + getSize();
   }
}