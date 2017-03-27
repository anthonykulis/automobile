package edu.jalc.automobile.parts.suspension;

public class StockSpringTest{

   public void testGetHeight(){
      System.out.println("Testing StockSpring::getHeight");
<<<<<<< HEAD
      StockSpring spring = new StockSpring(2);
=======
      StockSpring spring = new StockSpring();
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
      assert(2 == spring.getHeight());
   }
   
   public static void main(String[] args){
     StockSpringTest test = new StockSpringTest();
      test.testGetHeight();
      System.out.println("All Tests for StockSpring Passed");
   }
}