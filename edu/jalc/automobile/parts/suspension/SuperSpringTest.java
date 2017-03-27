package edu.jalc.automobile.parts.suspension;

public class SuperSpringTest{
   
   public void testGetHeight(){
      System.out.println("Testing SuperSpring::getHeight");
<<<<<<< HEAD
      SuperSpring spring = new SuperSpring(12);
=======
      SuperSpring spring = new SuperSpring();
>>>>>>> 7944c06d16bf7f58dcd703219a015a8fee427965
      assert(12 == spring.getHeight());
   }
   
   public static void main(String[] args){
      SuperSpringTest test = new SuperSpringTest();
      test.testGetHeight();
      System.out.println("All Tests for SuperSpring Passed");
   }
}
   