package edu.jalc.automobile.parts.suspension;

public class SteelWheelTest{
   
   public void testGetSize(){
      System.out.println("Testing SteelWheel::getWheel");
      SteelWheel wheel = new SteelWheel(18);
      assert(18 == wheel.getSize());
   }

   
   public static void main(String[] args){
      SteelWheelTest test = new SteelWheelTest();
      test.testGetSize();
      System.out.println("All Tests for SteelWheel Passed");
   }
   
}