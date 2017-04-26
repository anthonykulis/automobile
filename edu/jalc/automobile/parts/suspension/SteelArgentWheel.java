package edu.jalc.automobile.parts.suspension;

public class SteelArgentWheel extends SteelWheel {


   public SteelArgentWheel(double size){
      super(size);
   }

   private SteelArgentWheel(){
      super(0);
   }


   public String toString(){
      return "Steel Argent Wheel: " + getSize();
   }
}
