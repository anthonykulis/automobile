package edu.jalc.automobile.parts.suspension;
public class MediumSpringTest {

   public void testGetHeight(){
      System.out.println("Testing ShortSpring::getHeight");
      MediumSpring mediumSpring = new MediumSpring(30);
      assert(mediumSpring.getHeight() == 30);
   }


   public static void main(String[] args){
      MediumSpringTest test = new MediumSpringTest();
      test.testGetHeight();

      System.out.println("All Tests for ShortSpring Passed");
   }

}
