package edu.jalc.automobile.parts.suspension;

public class AluminumWheel extends Wheel {

   private AluminumWheel(){
      super(0);
   }

   public AluminumWheel(double size){
      super(size);
   }


   public String toString(){
      return "Aluminum Wheel: " + getSize() + " in";
   }
}
