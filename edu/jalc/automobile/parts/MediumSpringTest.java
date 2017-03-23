package edu.jalc.automobile.parts;
public class MediumSpringTest {

   public void testGetHeight(){
      System.out.println("Testing ShortSpring::getHeight");
      MediumSpringTest mediumSpringTest = new MediumSpringTest(30);
      assert(mediumSpringTest.getHeight() == 30);
   }


   public static void main(String[] args){
      MediumSpringTest test = new MediumSpringTest();
      test.testGetHeight();

      System.out.println("All Tests for ShortSpring Passed");
   }

}
