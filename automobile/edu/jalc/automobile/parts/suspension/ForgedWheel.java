package edu.jalc.automobile.parts.suspension;

public class ForgedWheel extends Wheel {

   public ForgedWheel(double size) {
     super(size);
   }

   public String toString(){
      return this.getSize() + " inch Forged Wheels";
   }
}
