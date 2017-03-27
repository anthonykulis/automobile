package edu.jalc.automobile.parts.suspension;

public class ShortSpringTest {

   public void testGetHeight(){
      System.out.println("Testing ShortSpring::getHeight");
      ShortSpring shortSpring = new ShortSpring(30);
      assert(shortSpring.getHeight() == 30);
   }


   public static void main(String[] args){
      ShortSpringTest test = new ShortSpringTest();
      test.testGetHeight();

      System.out.println("All Tests for ShortSpring Passed");
   }

}
