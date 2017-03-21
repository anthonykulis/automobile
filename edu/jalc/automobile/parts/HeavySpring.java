package edu.jalc.automobile.parts;

public class HeavySpring extends Spring{

   private double height;
   
   private HeavySpring(){
      this.height = 0;
   }
   
   public HeavySpring(double height){
      this.height = height;
   }
   
   public double getHeight(){
      return height;
   }
   
   public String toString(){
      return "Heavy Coil Spring";
   }
}
   