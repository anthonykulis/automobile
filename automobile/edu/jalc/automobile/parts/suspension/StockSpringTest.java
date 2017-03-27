package edu.jalc.automobile.parts.suspension;

public class StockSpringTest{

   public void testGetHeight(){
      System.out.println("Testing StockSpring::getHeight");
      StockSpring spring = new StockSpring(2);
      assert(2 == spring.getHeight());
   }
   
   public static void main(String[] args){
     StockSpringTest test = new StockSpringTest();
      test.testGetHeight();
      System.out.println("All Tests for StockSpring Passed");
   }
}