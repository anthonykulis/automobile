package edu.jalc.automobile.parts;

public class EconomyTireTest{

   public void testGetHeight(){
      System.out.println("Testing EconomyTire::getHeight");
      EconomyTire tire = new EconomyTire(30, 0);
      assert(tire.getHeight() == 30);
   }
   
   public void testGetWidth(){
      System.out.println("Testing EconomyTire::getWidth");
      EconomyTire tire = new EconomyTire(0, 25);
      assert(tire.getWidth() == 25);
   }
   
   public static void main(String[] args){
      EconomyTireTest test = new EconomyTireTest();
      test.testGetHeight();
      test.testGetWidth();
      
      System.out.println("All Tests for EconomyTire Passed");
   }
   
}