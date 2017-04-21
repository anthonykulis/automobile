package edu.jalc.automobile.parts.suspension;

public class BlackPaintedAluminumWheel extends Wheel {

   private BlackPaintedAluminumWheel(){
      super(0);
   }

   public BlackPaintedAluminumWheel(double size){
      super(size);
   }


   public String toString(){
      return "Black Painted Aluminum Wheel: " + getSize();
   }
}
