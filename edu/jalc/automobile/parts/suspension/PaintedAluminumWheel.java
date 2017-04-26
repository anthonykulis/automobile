package edu.jalc.automobile.parts.suspension;

public class PaintedAluminumWheel extends Wheel {

   private PaintedAluminumWheel(){
      super(0);
   }

   public PaintedAluminumWheel(double size){
      super(size);
   }


   public String toString(){
      return "Painted Aluminum Wheel: " + getSize() + " in";
   }
}
