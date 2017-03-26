package edu.jalc.automobile.parts.suspension;

public class ShortSpring extends Spring{

   public ShortSpring(double height) {
      this.height = height;
   }

   private double height = 2;

   public double getHeight(){
      return height;
   }

   public String toString(){
      return height+ " inch Coil Spring";
   }
}
