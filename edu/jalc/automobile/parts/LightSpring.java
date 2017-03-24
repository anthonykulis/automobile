package edu.jalc.automobile.parts;

public class LightSpring extends Spring{

   private final double height = 8;

   public LightSpring(){

   }
   
   public double getHeight(){
      return height;
   }
   
   public String toString(){
      return "Light Coil Spring: " + getHeight() + " inches";
   }
}
   