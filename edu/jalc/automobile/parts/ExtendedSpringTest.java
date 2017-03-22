package edu.jalc.automobile.parts;

public class ExtendedSpringTest {
   public void testGetHeight(){
      System.out.println("Testing ShortSpring::getHeight");
      ExtendedSpring extendedSpring = new ExtendedSpring(30);
      assert(extendedSpring.getHeight() == 30);
   }


   public static void main(String[] args){
      ExtendedSpringTest test = new ExtendedSpringTest();
      test.testGetHeight();

      System.out.println("All Tests for ShortSpring Passed");
   }

}
