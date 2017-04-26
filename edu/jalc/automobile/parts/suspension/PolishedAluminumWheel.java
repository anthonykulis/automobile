package edu.jalc.automobile.parts.suspension;

public class PolishedAluminumWheel extends AluminumWheel {

   private PolishedAluminumWheel(){
      super(0);
   }

   public PolishedAluminumWheel(double size){
      super(size);
   }


   public String toString(){
      return "Polished Aluminum Wheel: " + getSize() + " in";
   }
}
