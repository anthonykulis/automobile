package edu.jalc.automobile.parts;

public class StockSpring extends Spring{

   private double height;
   
   private StockSpring(){
      this.height = 0;
   }
   
   public StockSpring(double height){
      this.height = height;
   }
   
   public double getHeight(){
      return height;
   }
   
   public String toString(){
      return "Stock Coil Spring";
   }
}
   