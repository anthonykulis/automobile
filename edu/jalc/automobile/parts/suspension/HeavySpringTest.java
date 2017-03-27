package edu.jalc.automobile.parts.suspension;

public class HeavySpringTest{

   public void testGetHeight(){
      System.out.println("Testing HeavySpring::getHeight");
<<<<<<< HEAD
      HeavySpring spring = new HeavySpring(10);
=======
      HeavySpring spring = new HeavySpring();
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
      assert(10 == spring.getHeight());
   }
   
   public static void main(String[] args){
      HeavySpringTest test = new HeavySpringTest();
      test.testGetHeight();
      System.out.println("All Tests for HeavySpring Passed");
   }
}