package edu.jalc.automobile.parts.body;

import edu.jalc.automobile.parts.suspension.SportTire;

public class SportTireTest {
   public void testGetHeight(){
      System.out.println("Testing SportTire::getHeight");
      SportTire sportTire = new SportTire(30,0);
      assert(sportTire.getHeight() == 30);
   }
   public void testGetWidth(){
      System.out.println("Testing SportTire::getWidth");
      SportTire sportTire = new SportTire(0,30);
      assert(sportTire.getWidth() == 30);
   }

   public static void main(String[] args){
      SportTireTest test = new SportTireTest();

      test.testGetHeight();
      test.testGetWidth();

      System.out.println("All Tests for SportTireTest Passed");
   }

}
