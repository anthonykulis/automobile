package edu.jalc.automobile.parts.suspension;

public class SpokeAluminumWheel extends AluminumWheel {

   private SpokeAluminumWheel (){
      super(0);
   }

   public SpokeAluminumWheel(double size){
      super(size);
   }


   public String toString(){
      return "Spoke Aluminum Wheel: " + getSize();
   }
}
