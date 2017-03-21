package edu.jalc.automobile.parts;

public class ExtendedSpring extends Spring{

   private final double height = 10;

   public double getHeight(){
      return height;
   }

   public String toString(){
      return height+ " inch Coil Spring";
   }
}
