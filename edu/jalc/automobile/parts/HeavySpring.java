package edu.jalc.automobile.parts;

public class HeavySpring extends Spring{

   private final double HEIGHT = 10;
   
   public HeavySpring(){

   }
   
   public double getHeight(){
      return HEIGHT;
   }
   
   public String toString(){
      return "Heavy Coil Spring: "+ getHeight() + " inches";
   }
}
   