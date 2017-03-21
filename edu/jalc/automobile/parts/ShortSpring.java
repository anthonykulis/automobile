package edu.jalc.automobile.parts;

public class ShortSpring extends Spring{

   private final double height = 2;

   public double getHeight(){
      return height;
   }

   public String toString(){
      return height+ " inch Coil Spring";
   }
}
