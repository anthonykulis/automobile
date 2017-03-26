package edu.jalc.automobile.parts.suspension;

public class ForgedWheel extends Tire {

   private double size;

   public ForgedWheel(double size) {
     this.size = size;
   }

   public double getSize(){
      return size;
   }

   public String toString(){
      return size+ " inch Wheels";
   }
}
