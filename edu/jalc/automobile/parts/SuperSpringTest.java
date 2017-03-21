package edu.jalc.automobile.parts;

public class SuperSpringTest{
   
   public void testGetHeight(){
      System.out.println("Testing SuperSpring::getHeight");
      SuperSpring spring = new SuperSpring();
      assert(12 == spring.getHeight());
   }
   
   public static void main(String[] args){
      SuperSpringTest test = new SuperSpringTest();
      test.testGetHeight();
      System.out.println("All Tests for SuperSpring Passed");
   }
}
   