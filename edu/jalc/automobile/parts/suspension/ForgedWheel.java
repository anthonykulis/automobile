package edu.jalc.automobile.parts.suspension;

public class ForgedWheel extends Wheel {

   public ForgedWheel(double size, Tire tire) {
     super(size, tire);
   }

   public String toString(){
      return this.getSize() + " inch Forged Wheels";
   }
}
