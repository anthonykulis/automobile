package edu.jalc.automobile.parts;

public class HeavySpringTest{

   public void testGetHeight(){
      System.out.println("Testing HeavySpring::getHeight");
      HeavySpring spring = new HeavySpring();
      assert(10 == spring.getHeight());
   }
   
   public static void main(String[] args){
      HeavySpringTest test = new HeavySpringTest();
      test.testGetHeight();
      System.out.println("All Tests for HeavySpring Passed");
   }
}